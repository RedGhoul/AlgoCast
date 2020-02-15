package com.coltsteele.problems;

import java.util.HashMap;

/*
* Given a sorted array of ints and target average, determine if there is a
* pair of values in the array where the average of the pair equals the target
* average.
*
* You can also do this with a pair of pointer as well. Since they say you have a sorted array.
* Since you can start from the first index to the very last one, and then take the avg.
* if the the resulting avg is less then the target avg then, you increase the right pointer
* and do everything again. If the resulting avg is greater then you reduce the end pointer
* by one
* */
public class averagePair {
    public static void main(String[] args){
        System.out.println(averagePair.isThereAvragePair(new double[]{1,2,3},2.5));
    }


    public static boolean isThereAvragePair(double[] arrayIn, double targetAvg){
        if(arrayIn == null || arrayIn.length == 0){
            return false;
        }

        HashMap<Double, Double> avgHM = new HashMap<Double,Double>();

        for(Double entry: arrayIn){
            Double requiredValue = (targetAvg*2)-entry;
            avgHM.put(requiredValue,entry);
        }

        for(Double entry: arrayIn){
            if(avgHM.containsKey(entry)){
                return true;
            }
        }


        return false;
    }
}
