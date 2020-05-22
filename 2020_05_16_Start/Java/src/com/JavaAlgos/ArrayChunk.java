package com.JavaAlgos;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayChunk {
    public static void main(String[] args){
        System.out.println(generateChunks(Arrays.asList(1,2,3,4),2));
        System.out.println(generateChunks(Arrays.asList(1,2,3,4,5),2));
        System.out.println(generateChunks(Arrays.asList(1,2,3,4,5,6,7,8),3));
        System.out.println(generateChunks(Arrays.asList(1,2,3,4,5),4));
        System.out.println(generateChunks(Arrays.asList(1,2,3,4,5),10));
    }
    /*
    * Q:Given an array and chunk size, split the array many
    * subarrays where each subarray is of length size.
    * Input: inputArray, int (chunk size)
    * Output: array of sub arrays (ArrayList of ArrayList)
    * My Q: What to do if given an input of zero ?
    * What to do if chunk size is bigger then input array ?
    * */
    public static List<List<Integer>> generateChunks(List<Integer> inputArray, Integer chunkSize){
        List<List<Integer>> finalAnswer = new ArrayList<>();

        if(chunkSize == 0 || inputArray.size() == 0){
            finalAnswer.add(inputArray);
            return finalAnswer;
        }

        if(chunkSize > inputArray.size()) {
            return null;
        }
        ArrayList<Integer> tempAL = new ArrayList<Integer>();
        for(int i = 0; i < inputArray.size(); i++){
            // this works cause of the specifying the brackets properly
            if(i != 0 && ((i+1) % chunkSize) == 0){
                tempAL.add(inputArray.get(i));
                finalAnswer.add(tempAL);
                tempAL = new ArrayList<Integer>();
            }else{
                tempAL.add(inputArray.get(i));
            }
        }

        if (tempAL.size() != 0) {
            finalAnswer.add(tempAL);
        }
        return finalAnswer;
    }
}
