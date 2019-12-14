"""
Implement Binary Search Tree
"""

class Node:

    def __init__(self,value):
        self.value = value
        self.right = None
        self.left = None

class BinarySearchTree:

    def __init__(self):
        self.root = None

    def insertloop(self,value):
        newNode = Node(value)
        if self.root == None:
            self.root = newNode
            return
        else:
            current = self.root
            while True:
                if value < current.value:
                    if current.left == None:
                        current.left = newNode
                        return
                    else:
                        current = current.left
                elif value > current.value:
                    if current.right == None:
                        current.right = newNode
                        return
                    else:
                        current = current.right
                

    def insert(self,value):
        if self.root == None:
            self.root = Node(value)
            return

        return self.insertNode(value,self.root) # you could also do this with a loop
        # instead of recursivly

    def insertNode(self,value,node=None):

        if value > node.value:
            if node.right == None:
                node.right = Node(value)
                return
            else:
                self.insertNode(value,node=node.right)

        elif value < node.value:
            if node.left == None:
                node.left = Node(value)
                return
            else:
                self.insertNode(value,node=node.left)


    def find(self,value):
        if self.root == None:
            return None

        return self.findNode(value,self.root) # you could also do this with a loop
        # instead of recursivly

    def findNode(self,value,node=None):
        if node == None:
            return None
        if node.value == value:
            return node

        if value > node.value:
            if node.right != None:
                self.findNode(value,node=node.right)

        elif value < node.value:
            if node.left != None:
                self.findNode(value,node=node.left)

        #return None

if __name__ == "__main__":
    bins = BinarySearchTree()
    NodeRoot = Node(10)
    node1 = Node(5)
    node2 = Node(13)
    node3 = Node(2)
    node4 = Node(7)
    node5 = Node(10)
    node6 = Node(16)
    NodeRoot.left = node1
    NodeRoot.right = node2
    node1.left = node3
    node1.right = node4
    node2.left = node5
    node2.right = node6
    bins.root = NodeRoot
    bins.insertloop(8)
    bins.find(2)
