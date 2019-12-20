"""
Implement Stack. Most effient way is to use a linked list
FIFO - First In First out
Instead of putting it on the back of an ever growing list
you put it in the begining
"""

class Node:

    def __init__(self,value):
        self.next = None
        self.value = None

class Stack:

    def __init__(self):
        self.head = None
        self.tail = None


    def push(self, value):
        newNode = Node(value)

        if self.head == None:
            self.head = newNode
            self.tail = newNode

        else:
            newNode.next = self.head
            self.head = newNode

    def pop(self):

        if self.head == None:
            return None
        
        nodeToReturn = self.head

        self.head = self.head.next

        return nodeToReturn
        

