package com.stephengrider.problems;

import java.util.ArrayList;
// --- Directions
// Create a stack data structure.  The stack
// should be a class with methods 'push', 'pop', and
// 'peek'.  Adding an element to the stack should
// store it until it is removed.
// --- Examples
//   const s = new Stack();
//   s.push(1);
//   s.push(2);
//   s.pop(); // returns 2
//   s.pop(); // returns 1
public class Stack {

    public static void main(String[] args){
        Stack temp = new Stack();

        for(int i =0; i < 10; i++){
            temp.push("ele" + i);
        }
        System.out.println(temp.toString());

        for(int i =0; i < 10; i++){
            temp.pop();
            System.out.println(temp.toString());
        }

    }
    private ArrayList<String> arrayList;

    public Stack(){
        this.arrayList = new ArrayList<String>();
    }

    // Always put it at the very beginning
    public void push(String element){

        arrayList.add(0,element);
    }

    public String pop(){
        if(arrayList.size() ==0){
            return null;
        }
        return arrayList.remove(0);
    }

    @Override
    public String toString() {
        return "Stack{" +
                "arrayList=" + arrayList +
                '}';
    }
}
