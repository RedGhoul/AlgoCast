"""
Implement Weighted Graph
"""

class WeightedGraph:

    def __init__(self):
        self.adjacencyList = {}

    def addVertex(self,vertex):
        self.adjacencyList[vertex] = []
    
    def addEdge(self, vertex1,vertex2,weight):
        self.adjacencyList[vertex1].append({"node":vertex2,"weight":weight})
        self.adjacencyList[vertex2].append({"node":vertex1,"weight":weight})


if __name__ == "__main__":
    
    graph = WeightedGraph()

    graph.addVertex("A")
    graph.addVertex("B")
    graph.addVertex("C")

    graph.addEdge("A","B",9)
    graph.addEdge("A","C",5)
    graph.addEdge("B","C",7)

    print(graph.adjacencyList)