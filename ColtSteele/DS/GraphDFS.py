
"""
Implement DFS on a graph

Recursive Way:
global visited dic
mark as visited and keep calling your self
on its's childern, but only if they haven't 
been visited

Iterative Way:
Form a stack. Mark first node as visited. Then 
take all the stuck that the first node is connected
to, and if it has been visited, then add it to the 
stack. After that keep looping till there is 
nothing left in the stack
"""
import Graph

def DFSReCurGraph(vertex,Alist):
    
    results = []
    visited = {}
    def run(vertex):
        if vertex in Alist:
            visited[vertex] = 1
            results.append(vertex)
            for x in Alist[vertex]:# after it finishes a loop it goes up 
                # another call stack
                hasVisted = x in visited
                if hasVisted == False:
                    run(x)
                

    run(vertex)

    return results

def DFSInterGraph(vertex,Alist):
    stack = []
    stack.append(vertex)
    discover = {}
    result = []
    while len(stack) > 0:
        vertex = stack.pop()
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

    print(DFSReCurGraph("A", DFSGraph.AdjacencyList))
    print(DFSInterGraph("A", DFSGraph.AdjacencyList))