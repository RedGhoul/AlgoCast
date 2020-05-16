"""
Implement Dijkstras Algorthim
"""

from PrioityQueue import PriorityQueue, Node
from WeightedGraph import WeightedGraph


def Dijkstra(start, end,graphy):
    PQ = PriorityQueue()
    Distances = {} # a way to measure the distance from the 
    # root node to the any one of the nodes in the tree
    Prev = {} # gives you a road map of how 
    # you got there
    for key, val in graphy.adjacencyList.items():
        if key == start:
            # at the very start aka origin your at a distance
            # of zero
            Distances[key] = 0 
            PQ.Enqueue(Node(key,0)) 
        else:
            # everything else you don't know so you 
            # set it equal to zero
            Distances[key] = None
            PQ.Enqueue(Node(key,1000000)) 
        Prev[key] = None

    while len(PQ.values) > 0:
        smallest = PQ.Dequeue() 
        # pull off the min priority queue
        # so you will always get the one with the least distance 
        # from the start
        if smallest.value == end: 
            # if it ends up being the same 
            # as the end your done
            break
        else:
            # if it is not you need to figure out if it is a good choice to 
            # go to. So you loop throught the adjacency list for that value 
            # you pulled out of the queue
            for neighbor in graphy.adjacencyList[smallest.value]:
                nextNode = neighbor

                # then you find the distance from one of the things in your 
                # neighbor list to your self. Thats your testing distance
                # combination of Dict and the weight of the neighbor node edge
                newDistance = Distances[smallest.value] + nextNode.weight
                # you get your old distance from the the distances Dict
                # from A to the current node
                oldDistance = Distances[nextNode.value]
                if newDistance <= oldDistance: 
                    # do a compare to see which one is the smallest distance

                    # if it is smaller then, update the distances in the 
                    # distance dict for the neighbor
                    Distances[nextNode.value] = newDistance
                    # set the roadmap dict aka prev, for the neighbor node to 
                    # be the current smallest
                    Prev[nextNode.value] = smallest

                    # then enqueue the neighbor with the new distance
                    PQ.Enqueue(Node(nextNode.value,newDistance))

                    # then in doing the loop multiple times. You enqueue a number of 
                    # nodes with distances and update the distance table for the current
                    # node you are on. So if you started at node A then you would loop 
                    # through all of node A's neighbors, and put then into a priority Queue
                    # and build up a table of the distances between the neighbors and A
                    # then you go back up to the top and pull from the Priority Queue
                    # to get the next smallest distance to go to. Then you do the same for
                    # for that node

                    # this whole thing works be consistianly comparing the what the current 
                    # shortest path is from the current node to the negibour. To the what it would be 
                    # from the root to the current node PLUS the new nodes weight





    




if __name__ == "__main__":
    graphy = WeightedGraph()

    graphy.addVertex("A")
    graphy.addVertex("B")
    graphy.addVertex("C")
    graphy.addVertex("D")
    graphy.addVertex("E")
    graphy.addVertex("F")

    graphy.addEdge("A","B",4)
    graphy.addEdge("A","C",2)
    graphy.addEdge("B","E",3)
    graphy.addEdge("C","D",2)
    graphy.addEdge("C","F",4)
    graphy.addEdge("D","E",3)
    graphy.addEdge("D","F",1)
    graphy.addEdge("E","F",1)

    Dijkstra("A","F",graphy)