package com.AlgoExpert.problems;

public class InvertingBST {
    public static void invertBinaryTree(BinaryTree tree) {
        if(tree == null){
            return;
        }
        invertBinaryTreeHelper(tree);
        invertBinaryTree(tree.left);
        invertBinaryTree(tree.right);
    }
    // have to switch where the tree is pointing to left and right. not just left and right
    public static void invertBinaryTreeHelper(BinaryTree tree){
        BinaryTree left = tree.left;
        tree.left = tree.right;
        tree.right = left;
    }


    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }
}
