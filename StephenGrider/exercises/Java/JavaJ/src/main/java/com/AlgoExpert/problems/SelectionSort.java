package com.AlgoExpert.problems;

public class SelectionSort {
    /**
     * Same thing as bubble sort expect you are checking if anything
     * is less then. Rather then greater than. And you make the swap.
     *
     * By doing it this way you are building the sorted array from the back
     * (least to greatest) rather then from (greatest to least) aka bubble sort
     *
     * **/
    public static int[] selectionSort(int[] array) {
        for(int i = 0; i < array.length; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
