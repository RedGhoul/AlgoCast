package com.stephengrider.problems;

public class BSTNode {
    private BSTNode left;
    private BSTNode right;
    private Integer Data;
    public BSTNode(Integer Data){
        this.Data = Data;
    }

    public BSTNode getLeft() {
        return left;
    }

    public void setLeft(BSTNode left) {
        this.left = left;
    }

    public BSTNode getRight() {
        return right;
    }

    public void setRight(BSTNode right) {
        this.right = right;
    }

    public Integer getData() {
        return Data;
    }

    public void setData(Integer data) {
        Data = data;
    }
}
