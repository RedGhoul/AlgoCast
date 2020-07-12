package com.JavaAlgos.StephenGrider;

public class Circular {
    public static void main(String[] args){
//        LLNodeImplementation one = new LLNodeImplementation(1);
//        LLNodeImplementation two = new LLNodeImplementation(2,one);
//        LLNodeImplementation three = new LLNodeImplementation(3,two);
//        LLNodeImplementation four = new LLNodeImplementation(4,three);
//        LLNodeImplementation five = new LLNodeImplementation(5,four);
//        LLNodeImplementation six = new LLNodeImplementation(6,five);
//
//        System.out.println(circular(six));

        LLNodeImplementation one1 = new LLNodeImplementation(1);
        LLNodeImplementation two1= new LLNodeImplementation(2);
        LLNodeImplementation three1 = new LLNodeImplementation(3);
        LLNodeImplementation four1 = new LLNodeImplementation(4);
        LLNodeImplementation five1 = new LLNodeImplementation(5);
        LLNodeImplementation six1 = new LLNodeImplementation(6);
        LLNodeImplementation seven1 = new LLNodeImplementation(7);

        one1.nextNode = two1;
        two1.nextNode = null;
        //three1.nextNode = four1;
//        four1.nextNode = five1;
//        five1.nextNode = six1;
//        six1.nextNode = seven1;
//        seven1.nextNode = one1;


        System.out.println(circularV2(one1));
    }

    public static boolean circular(LLNodeImplementation input){
        LLNodeImplementation start = input;
        LLNodeImplementation end = input;
        while(true) {
            start = start.nextNode;
            end = end.nextNode.nextNode;
            if (start == end) return true;
            if (end == null || end.nextNode == null) return false;
        }
    }

    public static boolean circularV2(LLNodeImplementation input){
        if(input == null) return false;
        LLNodeImplementation start = input;
        LLNodeImplementation end = input;
        try {
            //  Block of code to try
            while(end != null && end.nextNode != null) { // has to be a "&&" rather then a "||"
                start = start.nextNode;
                end = end.nextNode.nextNode;
                if (start == end) return true; // this is the only place where you check if they are the same thing
                // you know that if they are then you return true
            }
        }
        catch(Exception e) {
            //  Block of code to handle errors
            System.out.println(e);
        }

        return false; //since we know at least something points to an end in the linked list
    }

}
