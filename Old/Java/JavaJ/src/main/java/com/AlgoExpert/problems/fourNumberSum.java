package com.AlgoExpert.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class fourNumberSum {
    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        List<Integer[]> quads = new ArrayList<Integer[]>();

        HashMap<Integer,List<Integer[]>> allPairs = new HashMap<>();


        for(int i = 1; i < array.length-1;i++){
            // doing stuff in the back
            for(int j = i+1; j < array.length; j++){
                int curSum = array[i] + array[j];
                int diff = targetSum - curSum;
                if(allPairs.containsKey(diff)){
                    List<Integer[]> pairs = allPairs.get(diff);
                    for(Integer[] x : pairs){
                        Integer[] newQ = new Integer[]{x[0], x[1], array[i], array[j]};
                        quads.add(newQ);
                    }
                }
            }
            // doing stuff in front
            for(int k = 0; k < i; k++){
                int curSum = array[i] + array[k];
                if(allPairs.containsKey(curSum)){
                    allPairs.get(curSum).add(new Integer[]{array[i],array[k]});
                }else{
                    List<Integer[]> pairGroup = new ArrayList<Integer[]>();
                    pairGroup.add(new Integer[]{array[i],array[k]});
                    allPairs.put(curSum,pairGroup);
                }
            }

        }
        return quads;
    }
}
