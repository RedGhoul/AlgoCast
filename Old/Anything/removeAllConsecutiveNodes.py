"""
Given a linked list, remove all consecutive nodes that sum to zero. Print out the remaining nodes.

For example, suppose you are given the input 3 -> 4 -> -7 -> 5 -> -6 -> 6. In this case, 
you should first remove 3 -> 4 -> -7, then -6 -> 6, leaving only 5.
"""


class Node:

    def __init__(self,value):
        self.value = value
        self.next = None


def removeAllConsecutiveNode(head):
    return None





if __name__ == "__main__":
    node1 = Node(3)
    node2 = Node(4)
    node3 = Node(-7)
    node4 = Node(5)
    node5 = Node(-6)
    node6 = Node(6)

    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5
    node5.next = node6

