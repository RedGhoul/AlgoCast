package com.AlgoExpert.problems;

public class BubbleSort {

    /**
     *
     * Time: O(n^2) - since we have a double for loop
     * Space: (1) - since we are doing everything in place
     *
     * You could also do this one while loop plus a for loop
     *
     * **/
    public static int[] bubbleSortV1(int[] array) {
        for(int i =0; i < array.length; i++){
            for(int j = i + 1;j < array.length; j++){
                if(array[i] > array[j]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }

    /*
    * Could refactor the swap logic into its own class
    * */
    public static int[] bubbleSortV1(int[] array) {
        for(int i =0; i < array.length; i++){
            for(int j = i + 1;j < array.length; j++){
                if(array[i] > array[j]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }

    public static void swapValues(int i, int j, int[] array){
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
