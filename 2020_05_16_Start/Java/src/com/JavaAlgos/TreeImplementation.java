package com.JavaAlgos;

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


        ArrayList<String> stuff = BreathFirstSearch(root);

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

    public static ArrayList<String> BFSHelper(ArrayList<TreeNodeImplementation> Stack,ArrayList<String> AnswerStack){
        if(Stack.size() == 0) return AnswerStack;
        TreeNodeImplementation curNode = Stack.remove(0);
        AnswerStack.add(curNode.data);
        Stack.addAll(curNode.childern);
        return BFSHelper(Stack,AnswerStack);
    }
}
