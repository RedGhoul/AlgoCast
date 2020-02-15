package com.stephengrider.problems;

// --- Directions
// Given a node, validate the binary search tree,
// ensuring that every node's left hand child is
// less than the parent node's value, and that
// every node's right hand child is greater than
// the parent
public class BSTValidation {

    public static void main(String[] args){
        BSTNode rootNode = new BSTNode(10);
        BinarySearchTree temp = new BinarySearchTree(rootNode);

        BSTNode left1 = new BSTNode(0);
        BSTNode right1 = new BSTNode(12);

        rootNode.setLeft(left1);
        rootNode.setRight(right1);

        BSTNode left11 = new BSTNode(-1);
        BSTNode left22 = new BSTNode(4);

        left1.setLeft(left11);
        left1.setRight(left22);

        BSTNode right11 = new BSTNode(11);
        BSTNode right22 = new BSTNode(20);

        right1.setLeft(right11);
        right1.setRight(right22);

        BSTNode right111 = new BSTNode(17);
        BSTNode right222 = new BSTNode(99);

        right22.setLeft(right111);
        right22.setRight(right222);

        //left11.setRight(new BSTNode(15));


        System.out.println(BSTValidation.validate(rootNode));
    }

    public static boolean validate(BSTNode node){
        if(node == null){
            return false;
        }
        return validationHelper(node,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private static Boolean validationHelper(BSTNode node, Integer min, Integer max){


            if(node != null && node.getData() > max){
                return false;
            }
            if(node != null && node.getData() < min){
                return false;
            }
            if(node != null){
                if(!validationHelper(node.getLeft(),min,node.getData())){
                    return false;
                }
            }


            if(node != null){
                if(!validationHelper(node.getRight(),node.getData(),max)){
                    return false;
                };
            }
        return true;
    }
}
