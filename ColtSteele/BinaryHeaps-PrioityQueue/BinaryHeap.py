"""
Implement a Binary Heap
"""
import math

class MaxBinaryHeap:

    def __init__(self):
        self.values = []

    def insert(self,value):
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
            while self.values[currentChild] > self.values[currentParent] and notNull:
                temp = self.values[currentChild]
                self.values[currentChild] = self.values[currentParent]
                self.values[currentParent] = temp

                currentChild = currentParent
                currentParent = math.floor((currentChild -1) /2)
                notNull = currentParent >= 0

    def ExtractMax(self):
        if len(self.values) == 0:
            return None

        

        # Setting the smallest value to the top 
        minNode = self.values.pop()

        if len(self.values) == 0 or len(self.values) == 1:
            return minNode

        maxNode = self.values[0]
        

        self.values[0] = minNode
        if len(self.values) < 3:
            if self.values[0] < self.values[1]:
                temp = self.values[0] 
                self.values[0] = self.values[1]
                self.values[1] = temp
            return maxNode


        else:
            currentNodeP = 0
            leftNode = (2 * currentNodeP) + 1
            rightNode =  (2 * currentNodeP) + 2

            while leftNode < len(self.values) and rightNode < len(self.values):
                if self.values[leftNode] > self.values[rightNode]: # figuring out which side is greater
                    if self.values[currentNodeP] < self.values[leftNode]: # figuring out if the top node is less than leftnode
                        temp = self.values[currentNodeP]
                        self.values[currentNodeP] = self.values[leftNode]
                        self.values[leftNode] = temp

                        currentNodeP = leftNode
                        leftNode = (2 * currentNodeP) + 1
                        rightNode = (2 * currentNodeP) + 2

                elif self.values[rightNode] > self.values[leftNode]:
                    if self.values[currentNodeP] < self.values[rightNode]:
                        temp = self.values[currentNodeP]
                        self.values[currentNodeP] = self.values[rightNode]
                        self.values[rightNode] = temp

                        currentNodeP = rightNode
                        leftNode = (2 * currentNodeP) + 1
                        rightNode = (2 * currentNodeP) + 2

                    
            print(self.values)
            return maxNode


if __name__ == "__main__":
    MBHs = MaxBinaryHeap()

    MBHs.insert(41)
    MBHs.insert(39)
    MBHs.insert(33)
    MBHs.insert(18)
    MBHs.insert(27)
    MBHs.insert(12)
    MBHs.insert(55)

    print(MBHs.values)

    MBHs.ExtractMax()
    MBHs.ExtractMax()