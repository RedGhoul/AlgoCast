package com.JavaAlgos.ColtSteele.SortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Sort(new int[] { 37, 45, 29, 8 })));
        System.out.println(Arrays.toString(Sort(new int[] { 1, 0 })));
        System.out.println(Arrays.toString(Sort(new int[] { 37 })));
        System.out.println(Arrays.toString(Sort(new int[] {})));
    }

    public static int[] Sort(int[] arr) {
        if (arr.length <= 1)
            return arr;

        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length - 1 - i; k++) {
                if (arr[k] > arr[k + 1]) {
                    swap(arr, k, k + 1);
                }
            }
        }

        return arr;
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
