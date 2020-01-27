package com.stephengrider.problems;

import java.util.ArrayList;

// --- Directions
// 1) Create a node class.  The constructor
// should accept an argument that gets assigned
// to the data property and initialize an
// empty array for storing children. The node
// class should have methods 'add' and 'remove'.
// 2) Create a tree class. The tree constructor
// should initialize a 'root' property to null.
// 3) Implement 'traverseBF' and 'traverseDF'
// on the tree class.  Each method should accept a
// function that gets called with each element in the tree
public class Tree {

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

        Tree mainTree = new Tree(tempRoot);

        Tree.BFS(mainTree.root);

        System.out.println("");

        Tree.DFS(mainTree.root);
    }

    private TreeNode root = null;

    public Tree(TreeNode node){
        this.root = node;
    }

    public TreeNode getRoot(){
        return this.root;
    }

    public static void DFS(TreeNode tn){
        ArrayList<TreeNode> qq = new ArrayList<TreeNode>();
        qq.add(tn);
        DFSHelper(qq);

    }

    public static void DFSHelper(ArrayList<TreeNode> qq){
        if(qq.size() == 0){
            return;
        }
        System.out.print(" " + qq.get(0).getData());
        ArrayList<TreeNode> childern = qq.get(0).getChildern();
        qq.remove(0);
        for(int i =childern.size()-1; i >= 0; i--){
            qq.add(0,childern.get(i));
        }

        DFSHelper(qq);
    }

    public static void BFS(TreeNode tn){
        ArrayList<TreeNode> qq = new ArrayList<TreeNode>();
        qq.add(tn);

        BFSHelper(qq);
    }

    public static void BFSHelper(ArrayList<TreeNode> qq){
        if(qq.size() == 0){
            return;
        }
        for(TreeNode childern: qq.get(0).getChildern()){
            qq.add(childern);
        }
        System.out.print( " " + qq.remove(0).getData());
        BFSHelper(qq);

    }
}



