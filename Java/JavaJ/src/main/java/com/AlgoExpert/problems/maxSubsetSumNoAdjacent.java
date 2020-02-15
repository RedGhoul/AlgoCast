package com.AlgoExpert.problems;

public class maxSubsetSumNoAdjacent { // Dynamic Programming problem
    public static int maxSubsetSumNoAdjacent(int[] array) {
        if(array.length == 0){
            return 0;
        }else if(array.length == 1){
            return 1;
        }

        int sec = array[0]; // what is the biggest thing at zero
        int first = Math.max(array[0],array[1]); // what is the biggest thing at 1 which could be one or zero
        int currentMax = 0;
        for(int i = 2; i < array.length; i++){
            currentMax = Math.max(first, sec+array[i]);
            sec = first;
            first = currentMax;
        }
        return first; // cause in the case that the array given is just two elements long
    }
}
