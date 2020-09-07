package com.JavaAlgos.ColtSteele.SortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Sort(new int[] { 2, 1, 9, 76, 4 })));

        System.out.println(Arrays.toString(Sort(new int[] { 37, 45, 29, 8 })));
        System.out.println(Arrays.toString(Sort(new int[] { 1, 0 })));
        System.out.println(Arrays.toString(Sort(new int[] { 37 })));
        System.out.println(Arrays.toString(Sort(new int[] {})));
    }

    public static int[] Sort(int[] arr) {
        if (arr.length == 0)
            return arr;
        /**
         * The outer for loop is going to be concerned with the current right side
         * element, that should be put in the left hand side
         */
        for (int i = 1; i < arr.length; i++) {
            int curValue = arr[i];
            /**
             * Making room for the new element from the outer for loop. This is done by
             * shifting everything bigger then the curValue to the right. You don't care
             * have to care that it ends up over writing the index of curValue, since you
             * already have a copy of it above.
             */
            int lastValueOfJ = -1;
            for (int j = i - 1; j >= 0 && arr[j] > curValue; j--) {
                arr[j + 1] = arr[j];
                lastValueOfJ = j;
            }
            /**
             * Here you insert the curValue at the index, at which arr[j] stops being bigger
             * then curValue. And you don't have to care about over writting something and
             * messing up the order since you already moved everything bigger to the right
             */
            if (lastValueOfJ != -1) {
                arr[lastValueOfJ] = curValue;
            }

        }
        return arr;
    }
}
