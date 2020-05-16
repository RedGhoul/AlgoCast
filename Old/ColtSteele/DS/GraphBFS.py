"""
Implement BFS on a graph
"""

import Graph

def BFSInterGraph(vertex,Alist):
    stack = [] # you end up using a queue rather then a 
    # FIFO stack
    stack.append(vertex)
    discover = {}
    result = []
    while len(stack) > 0:
        vertex = stack.pop(0) # since your poping it off 
        # from the top of the queue your working from the 
        # oldest stuff first so you end up going through 
        # the first layer of nodes before touching anything else
        hasBeenDiscovered = vertex in discover
        if hasBeenDiscovered == False:
            discover[vertex] = 1
            result.append(vertex)
            for x in Alist[vertex]:
                stack.append(x) # from the last thing in the Alist 
                # since we are continusly appending and then 
                # going through the list

    return result

if __name__ == "__main__":
    DFSGraph = Graph.Graph()
    DFSGraph.addVertex("A")
    DFSGraph.addVertex("B")
    DFSGraph.addVertex("C")
    DFSGraph.addVertex("D")
    DFSGraph.addVertex("E")
    DFSGraph.addVertex("F")

    DFSGraph.addEdge("A","B")
    DFSGraph.addEdge("A","C")
    DFSGraph.addEdge("B","D")
    DFSGraph.addEdge("C","E")
    DFSGraph.addEdge("D","E")
    DFSGraph.addEdge("D","F")
    DFSGraph.addEdge("E","F")

    print(BFSInterGraph("A", DFSGraph.AdjacencyList))