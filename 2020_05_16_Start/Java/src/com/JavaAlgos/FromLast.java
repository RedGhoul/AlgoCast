package com.JavaAlgos;

public class FromLast {

    public static void main(String[] args){
        LLNodeImplementation one1 = new LLNodeImplementation(1);
        LLNodeImplementation two1= new LLNodeImplementation(2);
        LLNodeImplementation three1 = new LLNodeImplementation(3);
        LLNodeImplementation four1 = new LLNodeImplementation(4);
        LLNodeImplementation five1 = new LLNodeImplementation(5);
        LLNodeImplementation six1 = new LLNodeImplementation(6);
        LLNodeImplementation seven1 = new LLNodeImplementation(7);

        one1.nextNode = two1;
        two1.nextNode = three1;
        three1.nextNode = four1;
        four1.nextNode = five1;
        five1.nextNode = six1;
        six1.nextNode = null;
//        seven1.nextNode = null;

        System.out.println(FindFromLast(one1,3));
    }

    public static LLNodeImplementation FindFromLast(LLNodeImplementation head, int spaceFromLast){
        // Error checking
        if(head == null || head.nextNode == null) return null;
        if(spaceFromLast == 0) return head;

        LLNodeImplementation start = head;
        LLNodeImplementation last = head;

        // Setting the last
        int count = 0;
        while(count != spaceFromLast && last != null){
            last = last.nextNode;
            count++;
        }

        // moving them one at a time
        while(last.nextNode != null){ // one before the last
            // so that you don't take an unnecessary extra step
            // that would throw off the count
            start = start.nextNode;
            last = last.nextNode;
        }
        return start;
    }
}
