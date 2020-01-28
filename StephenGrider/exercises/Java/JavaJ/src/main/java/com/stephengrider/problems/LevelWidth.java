package com.stephengrider.problems;

import java.util.ArrayList;

// --- Directions
// Given the root node of a tree, return
// an array where each element is the width
// of the tree at each level.
// --- Example
// Given:
//     0
//   / |  \
// 1   2   3
// |       |
// 4       5
// Answer: [1, 3, 2]
public class LevelWidth {

    public static void main(String[] args){
//        TreeNode tempRoot = new TreeNode("20");
//
//        TreeNode temp1 = new TreeNode("0");
//        tempRoot.addChildern(temp1);
//        TreeNode temp2 = new TreeNode("40");
//        tempRoot.addChildern(temp2);
//        TreeNode temp3 = new TreeNode("-15");
//        tempRoot.addChildern(temp3);
//
//        TreeNode temp1Childern = new TreeNode("12");
//        temp1.addChildern(temp1Childern);
//        TreeNode temp2Childern = new TreeNode("-2");
//        temp1.addChildern(temp2Childern);
//        TreeNode temp3Childern = new TreeNode("1");
//        temp1.addChildern(temp3Childern);
//
//        temp3.addChildern(new TreeNode("-2"));
//
//        Tree mainTree = new Tree(tempRoot);

        TreeNode tempRoot = new TreeNode("0");

        TreeNode temp1 = new TreeNode("1");
        tempRoot.addChildern(temp1);
        TreeNode temp2 = new TreeNode("2");
        tempRoot.addChildern(temp2);
        TreeNode temp3 = new TreeNode("3");
        tempRoot.addChildern(temp3);

        TreeNode temp1Childern = new TreeNode("4");
        temp1.addChildern(temp1Childern);

        temp3.addChildern(new TreeNode("5"));

        Tree mainTree = new Tree(tempRoot);

        getLevelWidth(mainTree.getRoot());
    }

    public static void getLevelWidth(TreeNode root){
        ArrayList<Integer> widthCount = new ArrayList<Integer>();
        ArrayList<TreeNode> qq = new ArrayList<TreeNode>();
        TreeNode space = new TreeNode("Spacer");
        qq.add(root);
        qq.add(space);
        widthCount.add(1);
        LevelwidthHelper(qq,widthCount);
        System.out.println(widthCount);
    }

    public static void LevelwidthHelper(ArrayList<TreeNode> qq, ArrayList<Integer> widthCount){

        int initalqqSize = qq.size();
        for(int i = 0; i < initalqqSize; i++){
            if(qq.get(i).getData().equals("Spacer")){
                for(int j =0; j < i+1; j++){
                    qq.remove(0);
                }
            }
            else if(qq.get(i).getChildern().size() > 0){

                for(TreeNode node:qq.get(i).getChildern()){
                    qq.add(node);
                }

            }
        }
        if(qq.size() ==0){
            return;
        }
        TreeNode space = new TreeNode("Spacer");
        qq.add(space);
        widthCount.add(qq.size()-1);
        LevelwidthHelper(qq,widthCount);
    }
}
