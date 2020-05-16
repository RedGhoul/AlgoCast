package com.stephengrider.problems;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Tree2 {
    private TreeNode root = null;

    public Tree2(TreeNode node){
        this.root = node;
    }

    public static void main(String[] args){

        TreeNode tempRoot = new TreeNode("20");

        TreeNode temp1 = new TreeNode("0");
        tempRoot.addChildern(temp1);
        TreeNode temp2 = new TreeNode("40");
        tempRoot.addChildern(temp2);
        TreeNode temp3 = new TreeNode("-15");
        tempRoot.addChildern(temp3);

        TreeNode temp1Childern = new TreeNode("12");
        temp1.addChildern(temp1Childern);
        TreeNode temp2Childern = new TreeNode("-2");
        temp1.addChildern(temp2Childern);
        TreeNode temp3Childern = new TreeNode("1");
        temp1.addChildern(temp3Childern);

        temp3.addChildern(new TreeNode("-2"));

        Tree2 mainTree = new Tree2(tempRoot);

        Tree2.BFS(mainTree.root);

        System.out.println("");

        Tree2.DFS(mainTree.root);
    }

    private static ArrayList<TreeNode> DFS(TreeNode root) {
        if(root == null){
            return null;
        }
        ArrayList<TreeNode> curList = new ArrayList<>();
        curList.add(root);
        ArrayList<TreeNode> output = DFSHelper(curList,null);
        return output;
    }

    private static ArrayList<TreeNode> DFSHelper(ArrayList<TreeNode> curList, ArrayList<TreeNode> output){
        if(output == null){
            output = new ArrayList<TreeNode>();
        }
        if(curList.size() == 0){
            return output;
        }
        TreeNode currentNode = curList.remove(0);
        output.add(currentNode);
        ArrayList<TreeNode> newCurList = currentNode.getChildern();
        newCurList.addAll(curList);
        curList = newCurList;
        return DFSHelper(curList,output);
    }

    private static ArrayList<TreeNode> BFS(TreeNode root) {
        if(root == null){
            return null;
        }
        ArrayList<TreeNode> curList = new ArrayList<>();
        curList.add(root);
        ArrayList<TreeNode> output = new ArrayList<>();
        BFSHelper(curList,output);
        return output;
    }

    private static ArrayList<TreeNode> BFSHelper(ArrayList<TreeNode> curList, ArrayList<TreeNode> Output){
        if(curList.size() == 0){
            return Output;
        }
        TreeNode curNode = curList.remove(0);
        Output.add(curNode);
        curList.addAll(curNode.getChildern());
        return BFSHelper(curList,Output);
    }

}
