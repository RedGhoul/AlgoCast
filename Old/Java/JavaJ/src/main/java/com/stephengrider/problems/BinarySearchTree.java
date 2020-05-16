package com.stephengrider.problems;
// --- Directions
// 1) Implement the Node class to create
// a binary search tree.  The constructor
// should initialize values 'data', 'left',
// and 'right'.
// 2) Implement the 'insert' method for the
// Node class.  Insert should accept an argument
// 'data', then create an insert a new node
// at the appropriate location in the tree.
// 3) Implement the 'contains' method for the Node
// class.  Contains should accept a 'data' argument
// and return the Node in the tree with the same value.
public class BinarySearchTree {

    private BSTNode root;

    public BinarySearchTree(BSTNode node){
        this.root = node;
    }

    public static void main(String[] args){
        BSTNode rootNode = new BSTNode(1);
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

        temp.insert(new BSTNode(-20));

        System.out.println(temp.contains(new BSTNode(177)));
    }

    public void insert(BSTNode node){
        if(node == null){
            return;
        }
        insertHelper(this.root,node);
    }

    public void insertHelper(BSTNode currentNode, BSTNode nodeToInsert){
        if(currentNode == null){
            return;
        }

        if(nodeToInsert.getData() > currentNode.getData()){
            if(currentNode.getRight() == null){
                currentNode.setRight(nodeToInsert);
                return;
            }else{
                insertHelper(currentNode.getRight(), nodeToInsert);
            }
        }else if(nodeToInsert.getData() < currentNode.getData()){
            if(currentNode.getLeft() == null){
                currentNode.setLeft(nodeToInsert);
                return;
            }else{
                insertHelper(currentNode.getLeft(),nodeToInsert);
            }
        }
    }

    public boolean contains(BSTNode node){
        if(node == null){
            return false;
        }
        return  containsHelper(this.root,node);
    }

    public boolean containsHelper(BSTNode currentNode, BSTNode nodeToFind){
        if(currentNode == null){
            return false;
        }

        if(currentNode.getData() == nodeToFind.getData()){
            return true;
        }
        if(nodeToFind.getData() > currentNode.getData()){
            return containsHelper(currentNode.getRight(), nodeToFind);
        }else if(nodeToFind.getData() < currentNode.getData()){
            return containsHelper(currentNode.getLeft(),nodeToFind);
        }
        return false;
    }

}
