package com.stephengrider.problems;
// --- Directions
// Implement a Queue datastructure using two stacks.
// *Do not* create an array inside of the 'Queue' class.
// Queue should implement the methods 'add', 'remove', and 'peek'.
// For a reminder on what each method does, look back
// at the Queue exercise.
// --- Examples
//     const q = new Queue();
//     q.add(1);
//     q.add(2);
//     q.peek();  // returns 1
//     q.remove(); // returns 1
//     q.remove(); // returns 2
public class TwoBecomeOne {
    private Stack stackStart;
    private Stack stackEnd;

    public void TwoBecomeOne(){
        stackStart = new Stack();
        stackEnd = new Stack();
    }

    public void add(String element){
        stackStart.push(element);

    }
    /*
     * Every Time you want to do one of these things
     * you have to take everything off the first stack
     * and then place it one the second stack. To get the
     * right order for the queue. Then pop off what you need
     * from the second stack (and not put it back if "remove")
     * then take everything from the second stack and put it
     * back onto the first stack
     * */
    public String remove(){
        while(true){
            String current = stackStart.pop();
            if(current == null){
                break;
            }
            stackEnd.push(current);
        }
        String theThingIWant = stackEnd.pop();

        //stackStart.push(theThingIWant);

        while(true){
            String current = stackEnd.pop();
            if(current == null){
                break;
            }
            stackStart.push(current);
        }
        return theThingIWant;
    }

    public String peek(){

        while(true){
            String current = stackStart.pop();
            if(current == null){
                break;
            }
            stackEnd.push(current);
        }
        String theThingIWant = stackEnd.pop();

        stackStart.push(theThingIWant);

        while(true){
            String current = stackEnd.pop();
            if(current == null){
                break;
            }
            stackStart.push(current);
        }
        return theThingIWant;
    }

}
