package com.JavaAlgos.StephenGrider;

public class weave {
    public static void main(String[] args){
        QueueImplementation temp = new QueueImplementation();
        temp.add(1);
        temp.add(2);
        temp.add(3);
        temp.add(4);

        QueueImplementation temp2 = new QueueImplementation();
        temp2.add(11);
        temp2.add(21);
        temp2.add(31);
        temp2.add(41);

        QueueImplementation answer = weaves(temp,temp2);

        while(true){
            Integer temps = answer.remove();
            if(temps == null) return;
            System.out.println(temps);
        }
    }

    /*
    * Q: create a function that inter weaves two different Queues into a
    * single new Queue, regardless of the size of the two queues.
    * Input: Two separate queues
    * Output: New queues
    * */
    public static QueueImplementation weaves(QueueImplementation Q1, QueueImplementation Q2){
        if(Q1 == null || Q2 == null) return null;
        QueueImplementation answerQ = new QueueImplementation();
        // Could have done this using & creating the "peek" method on our QueueImplementation class
        while(true){
            Integer Q1Val = Q1.remove();
            if(Q1Val != null){
                answerQ.add(Q1Val);
            }
            Integer Q2Val = Q2.remove();
            if(Q2Val != null){
                answerQ.add(Q2Val);
            }
            if(Q2Val == null && Q1Val == null){
                return answerQ;
            }
        }
    }
}
