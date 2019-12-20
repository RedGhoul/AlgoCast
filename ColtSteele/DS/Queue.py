"""
Implement a Queue. 
Going to be using a linked list 
"""

class Node:

    def __init__(self,value):
        self.value = value
        self.next = None


class Queue:

    def __init__(self):
        self.head = None
        self.tail = None

    def enqueue(self,value):

        newNode = Node(value)

        if self.head == None:
            self.head = newNode
            self.tail = newNode
        else:
            self.tail.next = newNode
            self.tail = newNode
        

    def dequeue(self):

        if self.head == None:
            return None

        nodeToReturn = self.head
        
        if self.head == self.tail: # for the case where they point to the same thing
            self.tail = None
        
        self.head = self.head.next

        return nodeToReturn

        
