package com.AlgoExpert.problems;

public class BSTValidation {
    public static void main(String[] args){
        TestBST test11 = new TestBST(10);
        test11.insert(5).insert(15);
        test11.left.right = new BSTValidation.BST(10);
        validateBst(test11);
    }
    public static boolean validateBst(BST tree) {
        if(tree == null){
            return false;
        }

        return validateHelper(tree,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    public static boolean validateHelper(BST node, int min, int max){
        if(node!= null){
            if(node.value > max){
                return false;
            }
            if(node.value < min){
                return false;
            }
            if(node.value <= max){
                if(!validateHelper(node.left, min, node.value)){
                    return false;
                }
            }
            if(node.value >= min){
                if(!validateHelper(node.right, node.value, max)){
                    return false;
                }
            }
        }
        return true;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }

}
class TestBST extends BSTValidation.BST {
    public TestBST(int value) {
        super(value);
    }

    public TestBST insert(int value) {
        BSTValidation.BST current = null;
        if (value < this.value) {
            if (this.left == null) {
                BSTValidation.BST newBST = new BSTValidation.BST(value);
                this.left = newBST;
                return this;
            } else {
                current = this.left;
            }
        } else {
            if (right == null) {
                BSTValidation.BST newBST = new BSTValidation.BST(value);
                this.right = newBST;
                return this;
            } else {
                current = this.right;
            }
        }
        while (true) {
            if (value < current.value) {
                if (current.left == null) {
                    BSTValidation.BST newBST = new BSTValidation.BST(value);
                    current.left = newBST;
                    return this;
                } else {
                    current = current.left;
                }
            } else {
                if (current.right == null) {
                    BSTValidation.BST newBST = new BSTValidation.BST(value);
                    current.right = newBST;
                    return this;
                } else {
                    current = current.right;
                }
            }
        }
    }
}
