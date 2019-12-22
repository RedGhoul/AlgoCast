
"""
Implement a Graph
"""

class Graph:

    def __init__(self):
        self.AdjacencyList = {}

    def addVertex(self,value):

        isCopy = value in self.AdjacencyList

        if isCopy == False:
            self.AdjacencyList[value] = []


    def addEdge(self, vertex1, vertex2):

        if vertex1 in self.AdjacencyList:
            self.AdjacencyList[vertex1].append(vertex2)
        else:
            self.AdjacencyList[vertex1] = [vertex2]

        if vertex2 in self.AdjacencyList:
            self.AdjacencyList[vertex2].append(vertex1)
        else:
            self.AdjacencyList[vertex2] = [vertex1]


if __name__ == "__main__":
    graphy = Graph()

    graphy.addVertex(3)
    graphy.addVertex(23)

    graphy.addEdge(2,3)
    graphy.addEdge(23,3)
    print(graphy.AdjacencyList)