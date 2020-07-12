package com.JavaAlgos.StephenGrider;

import java.util.Arrays;

public class BasicSortingAlgorithms {
    public static void main(String[] args){
        System.out.println(Arrays.toString(bubbleSort(new int[]{10,-30,97,0,5})));
        System.out.println(Arrays.toString(selectionSort(new int[]{10,0,97,-30,5})));
    }

    public static int[] mergeSort(int [] arrayIn){
        if(arrayIn.length == 0 || arrayIn.length == 1) return arrayIn;
        if(arrayIn.length == 2) return merge(
                Arrays.copyOfRange(arrayIn,0,0),
                Arrays.copyOfRange(arrayIn,1,1)
        );
        int midPoint = arrayIn.length / 2;
        int[] left = Arrays.copyOfRange(arrayIn,0,midPoint);
        int[] right = Arrays.copyOfRange(arrayIn, midPoint, arrayIn.length);
        return merge(mergeSort(left),mergeSort(right));
        /**
         * Each one of these smaller mergeSorts keep building up bigger
         * pieces of the left and right side of the final array
         * **/
    }

    public static int[] merge(int[] left, int[] right){
        int [] newArr = new int[left.length+right.length];
        for (int i =0; i < left.length;i++){
            if(left[i] < right[i]){
                newArr[i] = left[i];
                left = Arrays.copyOfRange(left,i,left.length);
            }else {
                newArr[i] = right[i];
                right = Arrays.copyOfRange(right,i,right.length);
            }
        }
        if(left.length != 0){
            newArr = arrayAdd(newArr,left);
        }
        if(right.length != 0){
            newArr = arrayAdd(newArr,right);
        }
        return newArr;
    }

    public static int[] arrayAdd(int[] left, int[] right){
        int[] result = new int[left.length +right.length];
        System.arraycopy(left, 0, result, 0,  left.length);
        System.arraycopy(right, 0, result, left.length, right.length);
        return result;
    }
    /**
     * The prove me wrong algorithm - O(n^2)
     * 1) You assume that the current index you are at, is the location of the min value
     * 2) Then you go through the rest of the array looking for something smaller, and
     * you keep track of it
     * 3) And at after going through the rest of the array, if you did find something
     * that was smaller, you swap it
     *
     * And you keep doing that for the rest of the array
     * **/
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

    /**
     * Things always bubble to the top. - O(n^2)
     * Keep comparing the current value to the others in the list.
     * If it is greater then swap
     * **/
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
