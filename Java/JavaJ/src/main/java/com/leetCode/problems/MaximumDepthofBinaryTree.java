package com.leetCode.problems;

import java.util.*;

public class MaximumDepthofBinaryTree {
    /*
    * Could do this either using BFS or DFS
    * Failed at doing DFS then looked at the sol
    * And used the BFS
    *
    * BFS gets the depth be looking at the number of levels of the tree
    *
    * BFS = Queue
    * DFS = Stack
    * */
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        // Here you are counting levels using BFS to figure out the depth
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int count = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            // Have to go through all the nodes at each level
            while(size-- > 0) {// when this first starts its gonna be just 1
                // subtract 1 from size
                TreeNode node = queue.poll(); // it keeps on sliding stuff out of the queue
                if(node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                }
            }
            count++;
        }
        return count;
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
