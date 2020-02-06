package com.coltsteele.problems;

import java.util.ArrayList;

/*
* Given an array of arrays, return one big array with all the individual elements inside
* */
public class flatten<T> {
    public static void main(String[] args){

    }
    /*
    * I am not even sure how to began to answer this sort of question in a strong typed language like java
    *
    * So this is how I did it in Python - Used helper method recursion
    *
    * I would call the helper method inside the normal function
    * The helper method would take in a value of, array that needs to be flattend
    * and a value that you popped off the array.
    * After that it would check what the value would be.
    * If it was a value type like a string or object it would be
    * added to the global answer array that existed in the scope of the normal function
    * If it wasn't a value type and was an array type, I would take it and make another recussive
    * call to the the helper method.
    * And then finally I would check if the array that was passed in empty, if it was I would just return it
    * and at the very end I would return the answer array I built up
    * */
    public void flattenNow(ArrayList<T> input){
        if(input.get(0).getClass().isArray()){

        }
        if(input.get(0).getClass().isPrimitive()){

        }
    }
}
