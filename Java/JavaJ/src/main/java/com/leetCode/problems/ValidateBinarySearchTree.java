package com.leetCode.problems;

public class ValidateBinarySearchTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    /*
    * The way I answered it from algo expert didn't work on the leetcode
    * test case :(
    * But this is the easiest way to solve it
    * */
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        return validateHelper(root,null,null);
    }

    public static boolean validateHelper(TreeNode node, Integer lower, Integer upper){
        if(node == null) return true;

        int val = node.val;
        if(lower != null && val <= lower) return false;
        if(upper != null && val >= upper) return false;

        if(!validateHelper(node.right, val,upper)) return false;
        if(!validateHelper(node.left, lower,val)) return false;

        return true;

    }
}
