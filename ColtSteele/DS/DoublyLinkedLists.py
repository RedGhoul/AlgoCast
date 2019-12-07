"""
Implement Doubly Linked Lists
"""

class Node:
    def __init__(self,value):
        self.next = None
        self.prev = None
        self.value = value


class DoublyLinkedList:

    def __init__(self):
        self.head = None
        self.tail = None
        self.length = 0

    def push(self,value):
        newNode = Node(value)
        if self.head == None:
            self.head = newNode
            self.tail = newNode
        else:
            newNode.prev = self.tail
            self.tail.next = newNode
            self.tail = newNode
        
        self.length += 1

        return None

    def pop(self):
        popedNode = self.tail
        if self.head == None:
            return None
        
        if self.length == 1:
            self.tail = None
            self.head = None
        else:
            self.tail = popedNode.prev
            self.tail.next = None
            popedNode.prev = None

        self.length -= 1

        return popedNode

    def shift(self):
        shiftedNode = self.head
        if self.head == None:
            return None

        if self.length == 1:
            self.length = 0
            self.tail = None
            self.head = None

        else:
            self.head = shiftedNode.next
            shiftedNode.next = None
            self.head.prev = None
            self.length -= 1

        return shiftedNode

    def unShift(self,value):
        newNode = Node(value)

        if self.head == None:
            self.head = newNode
            self.tail = newNode
        
        else:
            self.head.prev = newNode
            newNode.next = self.head
            self.head = newNode

        self.length += 1


    def get(self, index):

        if self.length == 0:
            return None

        start = self.head
        count = 0
        while start != None:
            if count == index:
                return start
            else:
                start = start.next
                count += 1


    def setVal(self,value,index):
        if self.length == 0:
            return None
        
        start = self.head
        count = 0
        while start != None:
            if count == index:
                start.value = value
                return
            else:
                start = start.next
                count +=1

    def insertVal(self,value,index):
        newNode = Node(value)
        if self.length == 0 or index > self.length or index < self.length:
            return None

        start = self.head
        count = 0

        while start != None:
            if count == index:
                newNode.next = start.next
                start.next = newNode
                newNode.prev = start
                return
            else:
                start = start.next


    def removeVal(self,value, index):

        if self.length == 0:
            return None

        start = self.head
        count = 0

        while start != None:
            if count == index:
                prevNode = start.prev
                nextNode = start.next

                prevNode.next = nextNode
                nextNode.prev = prevNode
            else:
                start = start.next


        


    


