package com.AlgoExpert.problems;

public class numberOfWaysToMakeChange {
    /*
    * Uses the tabulation methodology
    *
    * you didn't need to think about max or min here (like minNumberOfCoinsForChange) since you were
    * purely just looking at the number of ways 
    *
    * Time: O(n * d) where n is the target size, and d is the number of denominations
    * Space: O(n) cause we have to make tabulation array the size of n at the very beginning
    * */
    public static int numberOfWaysToMakeChange(int n, int[] denoms) {
        int[] ways = new int[n+1];
        ways[0] = 1;

        for(int domIndex=0; domIndex < denoms.length; domIndex++){

            for(int waysIndex =0; waysIndex < ways.length; waysIndex++){

                if(denoms[domIndex] <= waysIndex){
                    ways[waysIndex] = ways[waysIndex] + ways[waysIndex-denoms[domIndex]];
                }

            }

        }


        return ways[n];
    }
}
