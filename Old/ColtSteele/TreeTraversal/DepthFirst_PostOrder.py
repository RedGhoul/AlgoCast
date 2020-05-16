"""
Implement depthFirstSearch_PostOrder
"""
class Node:
    def __init__(self,value):
        self.value = value
        self.right = None
        self.left = None

def depthFirstSearch_PostOrder(root):
    # in this case we aren't trying to have two different 
    # vars for visited or on the list to be visted 
    # we are building the visited method from the ground up
    visited = []
    current = root


    def helper(node):
        

        if node.left != None:
            helper(node.left) # keep going left until it hits the dead zone

        if node.right != None:
            helper(node.right) # after the top unravels you hit 8 and then you hit another dead zone
            # then it unravels again and you back to the stack that has 6. but then you already finished that
            # then it unravels again and your back at 10 but. you are gonna 
            # start to do the right side of the tree

        # the only change from pre order
        visited.append(node.value) # when you reach an end node like 3, this line is all that is left, before it unravels

    helper(current)

    return visited



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

    #print(depthFirstSearch_PreOrder(NodeRoot))

    #        """ 
    #         10
    #     /       \
    #    6        15
    #  /   \     /  \
    # 3     8       20
    # """
    NodeRoot = Node(10)
    node1 = Node(6)
    node2 = Node(15)
    node3 = Node(3)
    node4 = Node(8)
    node6 = Node(20)
    NodeRoot.left = node1
    NodeRoot.right = node2
    node1.left = node3
    node1.right = node4
    node2.right = node6

    print(depthFirstSearch_PostOrder(NodeRoot))