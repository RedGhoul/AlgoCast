package com.JavaAlgos.StephenGrider;

public class MidPoint {
    public static void main(String[] args){
        LLNodeImplementation one = new LLNodeImplementation(1);
        LLNodeImplementation two = new LLNodeImplementation(2,one);
        LLNodeImplementation three = new LLNodeImplementation(3,two);
        LLNodeImplementation four = new LLNodeImplementation(4,three);
        LLNodeImplementation five = new LLNodeImplementation(5,four);
        LLNodeImplementation six = new LLNodeImplementation(6,five);
        System.out.println(MidPoint.FindMidPoint(six).data);
    }

    /*
    * Classic linked List mid point question
    * Q: Find the mid point of a linked list
    * In: A node (start)
    * Out: A node (middle)
    * */
    public static LLNodeImplementation FindMidPoint(LLNodeImplementation start){
        if(start == null) return null;
        if(start.nextNode == null) return null;
        LLNodeImplementation p1 = start;
        LLNodeImplementation p2 = start;
        while(p2.nextNode != null && p2.nextNode.nextNode != null){
            p1 = p1.nextNode;
            p2 = p2.nextNode.nextNode; // for a even number of nodes this will end up being null. And once you
            // go back up that loop you end up getting a null pointer exception. Which is caused by you trying to
            // access its "nextNode"
        }
        return p1; // should be returning p1 not p2
    }
}
