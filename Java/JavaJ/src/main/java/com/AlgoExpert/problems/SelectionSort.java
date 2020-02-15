package com.AlgoExpert.problems;

public class SelectionSort {
    /**
     * Your building things from the back of the array to the front if the array
     *
     * Your checking to see if your smallestIndex is actually your smallest index
     *
     * Every time you find something smaller, you make the smallestIndex point to
     * the new smallest index
     *
     * Then you keep comparing till you get to the end of the array
     *
     * Then finally you swap the current smallest index with what ever index i is at.
     *
     * Your esstentially going through the array and trying to find the smallest number.
     * And then swapping it with current index which is going left to right
     * so you have a sorted array being built up behind the current value of i
     * **/
    public static int[] selectionSort(int[] array) {
        for(int i = 0; i < array.length; i++){

            int smallestIndex = i;

            for(int j = i+1; j < array.length; j++){
                if(array[smallestIndex] > array[j]){
                    smallestIndex = j;
                }
            }

            if(smallestIndex != i){
                int temp = array[i];
                array[i] = array[smallestIndex];
                array[smallestIndex] = temp;
            }

        }
        return array;
    }
}
