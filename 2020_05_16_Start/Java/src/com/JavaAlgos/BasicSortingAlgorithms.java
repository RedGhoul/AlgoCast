package com.JavaAlgos;

import java.util.Arrays;

public class BasicSortingAlgorithms {
    public static void main(String[] args){
        System.out.println(Arrays.toString(bubbleSort(new int[]{10,-30,97,0,5})));
        System.out.println(Arrays.toString(selectionSort(new int[]{10,0,97,-30,5})));
    }

    
    public static int[] selectionSort(int[] inputArray){
        for(int outside = 0; outside < inputArray.length; outside++){
            int IndexOfMin = outside;
            int curMinVal = inputArray[outside];
            for(int inside = outside+1; inside < inputArray.length; inside++){
                if(inputArray[inside] < curMinVal){
                    curMinVal = inputArray[inside];
                    IndexOfMin = inside;
                }
            }
            intArraySwap(inputArray,outside,IndexOfMin);
        }

        return inputArray;
    }
    public static int[] bubbleSort(int[] inputArray){
        for(int right = 0; right < inputArray.length;right++){
            for(int left = right+1; left < inputArray.length;left++){
                int curRight = inputArray[right];
                int curLeft = inputArray[left];
                if(curRight > curLeft){
                    intArraySwap(inputArray,right, left);
                }
            }
        }

        return inputArray;
    }

    public static void intArraySwap(int[] inputArray,int pos1,int pos2){
        int initial = inputArray[pos1];
        inputArray[pos1] = inputArray[pos2];
        inputArray[pos2] = initial;
    }
}
