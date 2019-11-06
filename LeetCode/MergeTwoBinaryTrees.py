"""
617. Merge Two Binary Trees
Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.

You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.

Input: 
	Tree 1                     Tree 2                  
          1                         2                             
         / \                       / \                            
        3   2                     1   3                        
       /                           \   \                      
      5                             4   7                  
Output: 
Merged tree:
	     3
	    / \
	   4   5
	  / \   \ 
	 5   4   7
 

Note: The merging process must start from the root nodes of both trees.

"""

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def mergeTrees(self, t1: TreeNode, t2: TreeNode) -> TreeNode:
        #doing the None ref check here
        if t1 == None and t2 == None:
            return None
        newTreeNode = None
        
        #doing the None value check here
        if t1 == None:
            newTreeNode = TreeNode(t2.val) 
        elif t2 == None:
            newTreeNode = TreeNode(t1.val)
        else:
            newTreeNode = TreeNode(t1.val + t2.val)
        
        if t2 == None:
            newTreeNode.left = self.mergeTrees(t1.left,None)
            newTreeNode.right = self.mergeTrees(t1.right,None)
        elif t1 == None:
            newTreeNode.left = self.mergeTrees(None,t2.left)
            newTreeNode.right = self.mergeTrees(None,t2.right)
        else:
            newTreeNode.left = self.mergeTrees(t1.left,t2.left)
            newTreeNode.right = self.mergeTrees(t1.right,t2.right)
        
        return newTreeNode

"""
Runtime: 108 ms, faster than 9.70% of Python3 online submissions for Merge Two Binary Trees.
Memory Usage: 15.2 MB, less than 5.72% of Python3 online submissions for Merge Two Binary Trees.
"""


# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
"""
The better solution. doing everything in place
so you are not build out a full tree
"""
class Solution:
    def mergeTrees(self, t1: TreeNode, t2: TreeNode) -> TreeNode:
        #if some of them are none there is no need to sum them
        # just return them
        if t1 == None:
            return t2
        elif t2 == None:
            return t1

        t1.val += t2.val
        
        # this is the part I like to think of as the recursive loop
        t1.left = self.mergeTrees(t1.left,t2.left)
        t1.right = self.mergeTrees(t1.right,t2.right)
        
        return t1

"""
Runtime: 84 ms, faster than 87.59% of Python3 online submissions for Merge Two Binary Trees.
Memory Usage: 14.4 MB, less than 14.29% of Python3 online submissions for Merge Two Binary Trees.
"""