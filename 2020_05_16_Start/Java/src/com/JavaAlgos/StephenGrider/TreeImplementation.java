package com.JavaAlgos.StephenGrider;

import java.util.ArrayList;

public class TreeImplementation {
    public static void main(String[] args){
        TreeNodeImplementation root = new TreeNodeImplementation("20");
        TreeNodeImplementation c1 = new TreeNodeImplementation("0");
        TreeNodeImplementation c2 = new TreeNodeImplementation("40");
        TreeNodeImplementation c3 = new TreeNodeImplementation("-15");
        TreeNodeImplementation cc1 = new TreeNodeImplementation("12");
        TreeNodeImplementation cc2 = new TreeNodeImplementation("-2");
        TreeNodeImplementation cc3 = new TreeNodeImplementation("1");
        TreeNodeImplementation ccc1 = new TreeNodeImplementation("-2");
        root.childern.add(c1);
        root.childern.add(c2);
        root.childern.add(c3);

        c1.childern.add(cc1);
        c1.childern.add(cc2);
        c1.childern.add(cc3);

        c3.childern.add(ccc1);


        //ArrayList<String> stuff = BreathFirstSearch(root);
        ArrayList<String> stuff2 = DepthFirstSearch(root);
    }

    public TreeNodeImplementation root;
    public TreeImplementation(){
        root = null;
    }

    public static ArrayList<String> BreathFirstSearch(TreeNodeImplementation root){
        ArrayList<String> AnswerStack = new ArrayList<String>();
        ArrayList<TreeNodeImplementation> NodeStack = new ArrayList<TreeNodeImplementation>();
        NodeStack.add(root);
        return BFSHelper(NodeStack,AnswerStack);
    }

    /*
    * All about using a Queue. Treating an ArrayList like one,
    * always removing from the left & and adding to the right.
    * */
    private static ArrayList<String> BFSHelper(ArrayList<TreeNodeImplementation> Stack,ArrayList<String> AnswerStack){
        if(Stack.size() == 0) return AnswerStack;
        TreeNodeImplementation curNode = Stack.remove(0);
        AnswerStack.add(curNode.data);
        Stack.addAll(curNode.childern);
        return BFSHelper(Stack,AnswerStack);
    }

    public static ArrayList<String> DepthFirstSearch(TreeNodeImplementation root){
        ArrayList<TreeNodeImplementation> NodeStack = new ArrayList<TreeNodeImplementation>();
        NodeStack.add(root);
        return DFSHelper(NodeStack,new ArrayList<String>());
    }

    /*
    * Same idea as BFS expect your putting all the children at the front, and are picking from the front
    * So you are using a stack FIFO
    * */
    private static ArrayList<String> DFSHelper(ArrayList<TreeNodeImplementation> Stack,ArrayList<String> AnswerStack){
        if(Stack.size() ==0)return AnswerStack;
        TreeNodeImplementation curNode = Stack.remove(0);
        AnswerStack.add(curNode.data);
        int curSize = curNode.childern.size()-1;
        for(int i =curSize; i >= 0; i--){ //have to put a greater then there when counting backwards
            Stack.add(0,curNode.childern.get(i));
        }
        return DFSHelper(Stack,AnswerStack);
    }

}
