package com.AlgoExpert.problems;

public class InsertionSort {



    /**
     *
     * 1) Move Forward One
     * 2) Then compare to everything behind you. If array[i] is less then array[j]. Then swap, since if it is true
     * array[j] must be greater then array[i].
     * 3) Then continue to do that for all values from 0 to your current index.
     * 4) Repeat steps 1 to 3 till you get to the end of the array
     *
     *
     * This type of sorting algo is really good when you have a coninues sream of data coming in
     * that you need to be sorted
     *
     *
     * Time: O(n^2)
     * Space: O(n)
     *
     * Can also do this with a while loop and for loop
     * where you keep subtracting the j value in the while
     * and have the compare in the while condtional
     * **/


    public static int[] insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
