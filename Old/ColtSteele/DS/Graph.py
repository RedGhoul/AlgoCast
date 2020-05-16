
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

    def removeEdge(self,vertex1,vertex2):

        if vertex1 in self.AdjacencyList:
            self.AdjacencyList[vertex1].remove(vertex2)
        if vertex2 in self.AdjacencyList:
            self.AdjacencyList[vertex2].remove(vertex1)

    def removeVertex(self,vertex):

        if vertex in self.AdjacencyList:
            del self.AdjacencyList[vertex]
            for key,val in self.AdjacencyList.items():
                if vertex in val:
                    val.remove(vertex)
    
    def removeVertex2(self,vertex):
        #using removeEdge
        if vertex in self.AdjacencyList:

            while len(self.AdjacencyList[vertex]) > 0:
                adjVertex = self.AdjacencyList[vertex].pop()
                self.AdjacencyList[vertex].append(adjVertex)
                self.removeEdge(adjVertex,vertex)
            
            del self.AdjacencyList[vertex]
        


    


if __name__ == "__main__":
    graphy = Graph()

    graphy.addVertex(3)
    graphy.addVertex(23)
    graphy.addVertex(44)
    graphy.addEdge(2,3)
    graphy.addEdge(23,3)
    graphy.addEdge(23,44)
    graphy.removeVertex2(2)
    print(graphy.AdjacencyList)