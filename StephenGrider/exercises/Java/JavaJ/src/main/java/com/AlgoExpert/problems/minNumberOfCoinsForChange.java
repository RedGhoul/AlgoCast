package com.AlgoExpert.problems;

import java.util.Arrays;

public class minNumberOfCoinsForChange {
    /*
    * Initialize the ways array to a value that makes sense to the problem.
    * If looking for the min initialize to the max.
    * If looking for the max initialize to the min.
    * So the DP was ways[waysIndex - denoms[denomIndex]]+1 or ways[waysIndex]
    * */
    public static int minNumberOfCoinsForChange(int n, int[] denoms) {
        Arrays.sort(denoms);
        int[] ways = new int[n+1];
        Arrays.fill(ways,Integer.MAX_VALUE);

        ways[0] = 0;

        for(int domIndex =0; domIndex < denoms.length; domIndex++){
            for(int waysIndex =0; waysIndex < ways.length; waysIndex++){
                if(denoms[domIndex] <= waysIndex){
                    int compare = 0;
                    if(ways[waysIndex - denoms[domIndex]] == Integer.MAX_VALUE){
                        compare = ways[waysIndex - denoms[domIndex]];
                    }else{
                        compare = ways[waysIndex - denoms[domIndex]] + 1;
                    }
                    ways[waysIndex] = Math.min(compare, ways[waysIndex]); // you got to do min since your looking for the min
                }
            }
        }
        if(ways[n] == Integer.MAX_VALUE){
            return -1;
        }else{
            return ways[n];
        }

    }
}
