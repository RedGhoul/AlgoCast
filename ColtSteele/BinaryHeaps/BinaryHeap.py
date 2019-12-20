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


            

            


if __name__ == "__main__":
    MBHs = MaxBinaryHeap()

    MBHs.insert(41)
    MBHs.insert(39)
    MBHs.insert(33)
    MBHs.insert(18)
    MBHs.insert(27)
    MBHs.insert(12)
    MBHs.insert(55)
    MBHs.insert(45)
    MBHs.insert(333)
    print(MBHs.values)