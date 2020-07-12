package com.JavaAlgos.StephenGrider;

import java.util.Arrays;

public class PrintingSteps {
    public static void main(String[] args){
        printSteps(4);
    }

    /*
    * Q: Given a positive number N, print a step shape with N levels
    * using the "#" character. Each level should have spaces at the
    * other end.
    *
    * Input: numSteps Integer
    * Output: Steps printed out to the console
    * Ideas: String Concatenation - ArrayLists - Array
    * */
    public static void printSteps(int numSteps){
        if(numSteps == 0) System.out.println("");
        char[] outputArr = new char[numSteps]; // when initializing an array,
        // you put the size thinking it starts from 1
        Arrays.fill(outputArr,'*');
        for(int i = 0; i < outputArr.length; i++){
            outputArr[i] = '#';
            System.out.println(outputArr);
        }
    }
}
