package com.coltsteele.problems;

import java.util.ArrayList;
import java.util.Arrays;

/*
* return the minimal length of a contiguous subarray, where the subarray's sun is greater then or equal to
* an integer passed to the function
* */
public class minSubArrayLen {
    public static void main(String[] args){

        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(2);
        temp.add(3);
        temp.add(1);
        temp.add(2);
        temp.add(4);
        temp.add(3);

        System.out.println(minSubArrayLen.findMinSubArrayLength(temp,7));

    }

    public static Integer findMinSubArrayLength(ArrayList<Integer> inputArray, Integer target){
        // add input checking code here
        ArrayList<Integer> lengths = new ArrayList<Integer>();
        int start = 0;
        int end = 1;
        int currentSum = inputArray.get(start) + inputArray.get(end);
        if(currentSum >= target){
            lengths.add((end-start)+1);
        }

        while(start <= inputArray.size()-1){

            currentSum = currentSum + inputArray.get(end);
            if(currentSum >= target){
                lengths.add((end-start)+1);
            }

            if(inputArray.get(end) >= target || inputArray.get(start) >= target){
                lengths.add(1);
            }

            if(end >= inputArray.size()-1){
                start++;
                end = start +1;
                if(end <= inputArray.size()-1 && start <= inputArray.size()-1){
                    currentSum = inputArray.get(start);
                }else if(end >= inputArray.size()-1){
                    if(inputArray.get(start) >= target){
                        lengths.add(1);
                    }
                    break;
                }
            }else{
                end++;
            }

        }
        int min = Integer.MAX_VALUE;
        for(int i =0; i < lengths.size(); i++){
            if(lengths.get(i) <min){
                min = lengths.get(i);
            }
        }
        return min;
    }


}
