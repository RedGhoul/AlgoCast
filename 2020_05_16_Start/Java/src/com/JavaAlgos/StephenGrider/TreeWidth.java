package com.JavaAlgos.StephenGrider;

import java.util.ArrayList;

public class TreeWidth {
    public static void main(String[] args){
        TreeNodeImplementation root = new TreeNodeImplementation("0");
        TreeNodeImplementation r1 = new TreeNodeImplementation("1");
        TreeNodeImplementation r2 = new TreeNodeImplementation("2");
        TreeNodeImplementation r3 = new TreeNodeImplementation("3");
        root.childern.add(r1);
        root.childern.add(r2);
        root.childern.add(r3);
        TreeNodeImplementation rr1 = new TreeNodeImplementation("4");
        TreeNodeImplementation rr2 = new TreeNodeImplementation("5");
        r1.childern.add(rr1);
        r3.childern.add(rr2);
        r3.childern.add(new TreeNodeImplementation("10"));
        r3.childern.add(new TreeNodeImplementation("11"));
        r3.childern.add(new TreeNodeImplementation("12"));
        ArrayList<Integer> things = FindTreeWidth(root);
    }

    public static ArrayList<Integer> FindTreeWidth(TreeNodeImplementation root){
        ArrayList<TreeNodeImplementation> Nodes = new ArrayList<TreeNodeImplementation>();
        Nodes.add(root);
        Nodes.add(new TreeNodeImplementation("X"));
        ArrayList<Integer> answer = new ArrayList<Integer>();
        return FindTreeWidthHelper(Nodes,answer,0);
    }

    public static ArrayList<Integer> FindTreeWidthHelper(ArrayList<TreeNodeImplementation> nodes, ArrayList<Integer> answer, int count){
        TreeNodeImplementation curNode = nodes.remove(0);
        if(curNode.data.equals("X")){
            nodes.add(new TreeNodeImplementation("X"));
            answer.add(count);
            if(nodes.size() == 1 && nodes.get(0).data.equals("X")){
                return answer;
            }
            return FindTreeWidthHelper(nodes,answer,0);
        }
        for(int i= curNode.childern.size()-1; i >= 0;i--){
            nodes.add(curNode.childern.get(i));
        }
        return FindTreeWidthHelper(nodes,answer,count+1);

    }


}
