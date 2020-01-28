package com.stephengrider.problems;

public class SelectionSort {

    public static void main(String[] args){
        int[] arr = SelectionSort.Sort(new int[]{10,0,97,-30,5});
        for (int i: arr) {
            System.out.print(" "+i);
        }
    }

    //Prove me wrong
    public static int[] Sort(int[] input){
        for(int i =0; i < input.length; i++){
            // I think this is the index with the lowest element
            int indexOfMin = i;

            // going through every other element in the array to prove my theory
            for(int j =i+1; j < input.length; j++){
                // Okay, if I am wrong then record the index where there is a smaller number
                if(input[j] < input[indexOfMin]){
                    indexOfMin = j;
                }
            }

            // check to see if indexOfMin is the same as before
            // if it isn't then swap the values;
            if(indexOfMin != i){
                int temp = input[i];
                input[i] = input[indexOfMin];
                input[indexOfMin] = temp;
            }
        }

        return input;
    }
}
