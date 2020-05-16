package com.AlgoExpert.problems;
import java.util.*;
public class largestRange {
    public static int[] getlargestRange(int[] array) {
        int[] bestRange = new int[2];
        int longestLength = 0;
        HashMap<Integer,Boolean> bag = new HashMap<>();
        for(int i : array){
            bag.put(i,true);
        }

        for(int i : array){

            if(bag.get(i) == false){
                continue;
            }else{
                bag.put(i, false);
                int curLength = 1;
                int left = i - 1;
                int right = i + 1;
                while(bag.containsKey(left)){
                    bag.put(left,false);
                    curLength++;
                    left--;
                }

                while(bag.containsKey(right)){
                    bag.put(right,false);
                    curLength++;
                    right++;
                }

                if(curLength > longestLength){
                    longestLength = curLength;
                    bestRange[0] = left + 1;
                    bestRange[1] = right -1;
                }

            }

        }
        return bestRange;
    }
}
