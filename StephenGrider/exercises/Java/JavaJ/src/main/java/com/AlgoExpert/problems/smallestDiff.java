package com.AlgoExpert.problems;

import java.util.Arrays;

public class smallestDiff {
    public static void main(String[] args){
        smallestDiff.smallestDifference(new int[]{-1,5,10,20,3},new int[]{26,134,135,15,17});
    }
    /*
    * Okay so you were on the right track, but your logic was a bit wrong.
    * You don't need to have one pointer starting at the beginning of array one
    * and the other starting at the end of array two. That would end up giving you the
    * biggest diff not the diff closest to zero. Instead what you need to do start both
    * pointers at beginning of the arrays, and compute their diff (logic here being
    * that they are both the smallest things in their arrays). If their diff isn't zero
    * you have to increment the pointer pointing to the smallest value since diff closest to
    * zero is only found when both numbers are about the same 26 - 27 vs 1 -8 (1 would have to move up).
    *
    *In general n*log(n) > n
    * Time: O(n*log(n) + m*log(m))
    * Space: O(1) - we aren't creating anything for every interaction
    * */
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int p1 = 0;
        int p2 = 0;
        int currentDiff = 0;
        int subDiff = 0;
        int cp1 = 0;
        int cp2 = 0;
        int subDiffMin = Integer.MAX_VALUE;
        while(p1 < arrayOne.length && p2 < arrayTwo.length){
            currentDiff = Math.abs(arrayOne[p1]-arrayTwo[p2]);
            subDiff = Math.abs(currentDiff - 0);
            if(subDiff < subDiffMin){
                subDiffMin = subDiff;
                cp1 = p1;
                cp2 = p2;
            }
            if(arrayOne[p1] < arrayTwo[p2]){
                p1++;
            }else{
                p2++;
            }

        }

        return new int[]{arrayOne[cp1],arrayTwo[cp2]};
    }
}
