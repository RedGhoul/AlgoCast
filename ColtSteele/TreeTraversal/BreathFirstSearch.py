"""
Implement Breath First Search
"""

class Node:
    def __init__(self,value):
        self.value = value
        self.right = None
        self.left = None


def BFS(top):
    needToVisit = [top]
    resultedFinds = []

    while len(needToVisit) != 0:
        currentNode = needToVisit.pop()
        resultedFinds.append(currentNode.value)
        if currentNode.left != None:
            needToVisit.insert(0,currentNode.left)
        if currentNode.right != None:
            needToVisit.insert(0,currentNode.right)

    return resultedFinds







if __name__ == "__main__":
    """
            10
        /       \
       5        13
     /   \     /  \
    2     7   10  16 
    """
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

    print(BFS(NodeRoot))