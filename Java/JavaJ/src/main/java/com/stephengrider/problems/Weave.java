package com.stephengrider.problems;
// --- Directions
// 1) Complete the task in weave/queue.js
// 2) Implement the 'weave' function.  Weave
// receives two queues as arguments and combines the
// contents of each into a new, third queue.
// The third queue should contain the *alterating* content
// of the two queues.  The function should handle
// queues of different lengths without inserting
// 'undefined' into the new one.
// *Do not* access the array inside of any queue, only
// use the 'add', 'remove', and 'peek' functions.
// --- Example
//    const queueOne = new Queue();
//    queueOne.add(1);
//    queueOne.add(2);
//    const queueTwo = new Queue();
//    queueTwo.add('Hi');
//    queueTwo.add('There');
//    const q = weave(queueOne, queueTwo);
//    q.remove() // 1
//    q.remove() // 'Hi'
//    q.remove() // 2
//    q.remove() // 'There'
public class Weave {

    public static void main(String args[]){
        Queue temp1 = new Queue();
        Queue temp2 = new Queue();
        for (int i =1; i < 10; i++){
            temp1.add(i);
            temp2.add(i*2);
        }

        System.out.println(temp1.toString());
        System.out.println(temp2.toString());
        Queue newQ = Weave.createWeave(temp1,temp2);

        System.out.println(newQ.toString());

        while(true){
            Integer temp = newQ.remove();
            if(temp == null){
                break;
            }else{
                System.out.println(temp);
            }
        }
    }

    public static Queue createWeave(Queue q1, Queue q2){
        // check if they are both empty or one of them is
        Queue output = new Queue();
        Integer ValuesFromQ1 = q1.remove();
        Integer ValuesFromQ2 = q2.remove();
        output.add(ValuesFromQ1);
        output.add(ValuesFromQ2);

        while (true){
            ValuesFromQ1 = q1.remove();
            ValuesFromQ2 = q2.remove();
            if(ValuesFromQ1 != null){
                output.add(ValuesFromQ1);
            }
            if(ValuesFromQ2 != null){
                output.add(ValuesFromQ2);
            }
            if(ValuesFromQ1 == null && ValuesFromQ2 == null){
                break;
            }
        }

        return output;
    }
}
