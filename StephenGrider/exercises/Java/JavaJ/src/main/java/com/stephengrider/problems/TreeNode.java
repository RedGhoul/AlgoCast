package com.stephengrider.problems;

import java.util.ArrayList;

public class TreeNode {
    private String Data;
    private ArrayList<TreeNode> Childern;

    public TreeNode(String data) {
        Data = data;
        Childern = new ArrayList<TreeNode>();
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    public ArrayList<TreeNode> getChildern() {
        return Childern;
    }

    public void addChildern(TreeNode child) {
        Childern.add(child);
    }

    public void setChildern(ArrayList<TreeNode> childern) {
        Childern = childern;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "Data='" + Data + '\'' +
                ", Childern=" + Childern +
                '}';
    }
}
