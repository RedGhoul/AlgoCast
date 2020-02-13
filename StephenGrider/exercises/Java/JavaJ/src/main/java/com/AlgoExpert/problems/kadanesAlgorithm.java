package com.AlgoExpert.problems;

public class kadanesAlgorithm {
    public static int kadanesAlgorithmV1(int[] array) {
        if(array.length==0){
            return 0;
        }
        int currentMax = Integer.MIN_VALUE;
        int summ = 0;
        for(int i = 0; i < array.length; i++){
            if(summ < 0){
                summ = 0;
            }

            summ = summ + array[i];
            if(summ > currentMax){
                currentMax = summ;
            }
        }
        return currentMax;
    }
}
