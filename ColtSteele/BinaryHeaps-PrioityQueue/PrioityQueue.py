"""
Implement a Prioity Queue

Which is really just a Min Heap, that uses nodes
that have both a priority and value.
"""
import math

class Node:
    def __init__(self,value, priority):
        self.value = value
        self.priority = priority

class PriorityQueue:

    def __init__(self):
        self.values = []

    def Enqueue(self,value):
        self.values.append(value)

        listSize = len(self.values)
        if listSize > 0: # check if the list size is greater then 0
            # want to reduce anything unessary

        # basic equation is 2n+1
        # or floor(lastpos/2) -1 => parent
        # then I do a compare if parent is less then child
        # if it is then I do a swap and try to do the same thing
        # if not then I stop

            currentChild = listSize - 1
            currentParent = math.floor((currentChild -1) /2)
            notNull = currentParent >= 0
            while self.values[currentChild].priority < self.values[currentParent].priority and notNull:
                temp = self.values[currentChild]
                self.values[currentChild] = self.values[currentParent]
                self.values[currentParent] = temp

                currentChild = currentParent
                currentParent = math.floor((currentChild -1) /2)
                notNull = currentParent >= 0

    def Dequeue(self):
        if len(self.values) == 0:
            return None
        # Setting the smallest value to the top 
        minNode = self.values.pop()

        if len(self.values) == 0 or len(self.values) == 1:
            return minNode

        maxNode = self.values[0]
        

        self.values[0] = minNode
        if len(self.values) < 3:
            if self.values[0].priority > self.values[1].priority:
                temp = self.values[0] 
                self.values[0] = self.values[1]
                self.values[1] = temp
            return maxNode


        else:
            currentNodeP = 0
            leftNode = (2 * currentNodeP) + 1
            rightNode =  (2 * currentNodeP) + 2

            while leftNode < len(self.values) and rightNode < len(self.values):
                if self.values[leftNode].priority < self.values[rightNode].priority: # figuring out which side is greater
                    if self.values[currentNodeP].priority > self.values[leftNode].priority: # figuring out if the top node is less than leftnode
                        temp = self.values[currentNodeP]
                        self.values[currentNodeP] = self.values[leftNode]
                        self.values[leftNode] = temp

                        currentNodeP = leftNode
                        leftNode = (2 * currentNodeP) + 1
                        rightNode = (2 * currentNodeP) + 2

                elif self.values[rightNode].priority < self.values[leftNode].priority:
                    if self.values[currentNodeP].priority > self.values[rightNode].priority:
                        temp = self.values[currentNodeP]
                        self.values[currentNodeP] = self.values[rightNode]
                        self.values[rightNode] = temp

                        currentNodeP = rightNode
                        leftNode = (2 * currentNodeP) + 1
                        rightNode = (2 * currentNodeP) + 2

                    
            #print(self.values)
            return maxNode


if __name__ == "__main__":
    MBHs = PriorityQueue()

    MBHs.Enqueue(Node("common cold", 5))
    MBHs.Enqueue(Node("gunshot wound", 1))
    MBHs.Enqueue(Node("high Fever",2))
    MBHs.Enqueue(Node("dog attack",3))
    

    for x in MBHs.values:
        print(x.value)
        print(x.priority)
        print("---------")

    MBHs.Dequeue()

    MBHs.Enqueue(Node("cut off hand",1))

    MBHs.Dequeue()