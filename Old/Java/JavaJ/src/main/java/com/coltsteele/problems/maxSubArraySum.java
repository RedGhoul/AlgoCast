package com.coltsteele.problems;

import java.util.ArrayList;
import java.util.Arrays;

/*
* find the maximum sum of a subarray with the length
* that is passed to the function.
* Subarray must consist of consecutive elements from the original array
* */
public class maxSubArraySum {

    public static void main(String[] args){
        ArrayList<Integer> inputArray = new ArrayList<Integer>();

        inputArray.add(100);
        inputArray.add(200);
        inputArray.add(300);
        inputArray.add(400);

        System.out.println(maxSubArraySum.findMaxSubArraySum(inputArray,2));

    }

    /*
    *
    * Ask this question : Assuming length given to us will be from the zero index
    * */
    public static ArrayList<Integer> findMaxSubArraySum(ArrayList<Integer> inputArray, int length){
        // Add input error checking here

        int startP = 0;
        int endP = length-1;

        int startMax = 0;
        int endMax = 0;

        int currentSum =0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = startP; i <= endP; i++){
            currentSum = currentSum + inputArray.get(i);
        }

        /*
        * Just got confused around here as to when and where I should increment the two pointers
        * Since I was incrementing startP before using its index for the subtraction
        * */

        while(true){
            endP++;
            if(endP > inputArray.size()-1){
                break;
            }
            currentSum = currentSum - inputArray.get(startP);
            currentSum = currentSum + inputArray.get(endP);

            if(currentSum > maxSum){
                maxSum = currentSum;
                endMax = endP;
                startMax = startP+1;
            }
            startP++;
        }

        System.out.println("MAX Sum found was " + maxSum);
        return new ArrayList<Integer>(inputArray.subList(startMax,endMax+1));
    }

    public static Integer findMaxSubArraySumTestEd(ArrayList<Integer> inputArray, int length){
        // Add input error checking here
        if(inputArray.size() == 0 || length > inputArray.size()){
            return null;
        }
        int startP = 0;
        int endP = length-1;

        int startMax = 0;
        int endMax = 0;

        int currentSum =0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = startP; i <= endP; i++){
            currentSum = currentSum + inputArray.get(i);
        }

        /*
         * Just got confused around here as to when and where I should increment the two pointers
         * Since I was incrementing startP before using its index for the subtraction
         * */

        while(true){
            endP++;
            if(endP > inputArray.size()-1){
                break;
            }
            currentSum = currentSum - inputArray.get(startP);
            currentSum = currentSum + inputArray.get(endP);

            if(currentSum > maxSum){
                maxSum = currentSum;
                endMax = endP;
                startMax = startP+1;
            }
            startP++;
        }

        return maxSum;
    }
}
