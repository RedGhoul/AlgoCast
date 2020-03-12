package com.leetCode.problems;

public class SymmetricTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /*
    This can be done iteratively as well
     */


    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return sysHelper(root.left, root.right);
    }

    public static boolean sysHelper(TreeNode left, TreeNode right){
        if(left == null && right != null){
            return false;
        }
        if(right == null && left != null){
            return false;
        }
        if(right == null && left == null){
            return true;
        }
        if(right.val != left.val){
            return false;
        }
        if(!sysHelper(left.left,right.right)){
            return false;
        }
        if(!sysHelper(left.right,right.left)){
            return false;
        }
        return true;
    }
}
