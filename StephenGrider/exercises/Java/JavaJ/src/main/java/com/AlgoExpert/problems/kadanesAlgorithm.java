package com.AlgoExpert.problems;

public class kadanesAlgorithm {
    /*
    * Kind of like common sense since the only thing that could limit your max sum
    * is a big negative number. So once your sum dips in negative then you know
    * that adding any more things won't be worth it. So you reset your current sum
    * and you continue to add. However to mitigate the risk of having a big number at the
    * end. You also want to continuously keep track of the current max sum every iteration.
    *
    * TIME: O(n)
    * SPACE: O(1)
    *
    * */
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
