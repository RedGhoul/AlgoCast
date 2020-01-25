package com.stephengrider.problems;

import java.util.ArrayList;

// --- Description
// Create a queue data structure.  The queue
// should be a class with methods 'add' and 'remove'.
// Adding to the queue should store an element until
// it is removed
// --- Examples
//     const q = new Queue();
//     q.add(1);
//     q.remove(); // returns 1;
public class Queue {

    public static void main(String[] args){
        Queue temp = new Queue();
        temp.add(1);
        System.out.println(temp.toString());
        temp.add(2);
        System.out.println(temp.toString());
        temp.add(3);
        System.out.println(temp.toString());
        temp.add(4);
        System.out.println(temp.toString());


        temp.remove();
        System.out.println(temp.toString());
        temp.remove();
        System.out.println(temp.toString());
    }
    private ArrayList<Integer> array;

    public Queue(){
        this.array = new ArrayList<Integer>();
    }

    public void add(Integer element){
        array.add(0,element);
    }

    public Integer remove(){
        if(array.size() == 0){
            return null;
        }
        return array.remove(array.size()-1);
    }

    @Override
    public String toString() {
        return "Queue{" +
                "array=" + array +
                '}';
    }
}
