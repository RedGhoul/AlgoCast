package com.JavaAlgos.ColtSteele;
import java.util.*;

public class MinSubArrayLen {
    public static void main(String[] args){
//        System.out.println(findMinSubArrayLen(new int[] {2,3,1,2,4,3},7));
//        System.out.println(findMinSubArrayLen(new int[] {2,1,6,5,4},9));
//        System.out.println(findMinSubArrayLen(new int[] {3,1,7,11,2,9,8,21,62,33,19},52));
//        System.out.println(findMinSubArrayLen(new int[] {1,4,16,22,5,7,8,9,10},39));
//        System.out.println(findMinSubArrayLen(new int[] {1,4,16,22,5,7,8,9,10},55));
//        System.out.println(findMinSubArrayLen(new int[] {4,3,3,8,1,2,3},11));
//        System.out.println(findMinSubArrayLen(new int[] {1,4,16,22,5,7,8,9,10},95));


        System.out.println(findMinSubArrayLenSlide(new int[] {2,3,1,2,4,3},7));
        System.out.println(findMinSubArrayLenSlide(new int[] {2,1,6,5,4},9));
        System.out.println(findMinSubArrayLenSlide(new int[] {3,1,7,11,2,9,8,21,62,33,19},52));
        System.out.println(findMinSubArrayLenSlide(new int[] {1,4,16,22,5,7,8,9,10},39));
        System.out.println(findMinSubArrayLenSlide(new int[] {1,4,16,22,5,7,8,9,10},55));
        System.out.println(findMinSubArrayLenSlide(new int[] {4,3,3,8,1,2,3},11));
        System.out.println(findMinSubArrayLenSlide(new int[] {1,4,16,22,5,7,8,9,10},95));

    }
    /***
     * Duplicates do not matter
     * Not considering float data types
     * This is kind of sort of right
     */
    public static int findMinSubArrayLen(int[] arrayIn, int target){
        if (arrayIn.length == 0) return 0;
        if (target < 0) return 0;

        int lenCount = 0;
        int minLenCount = Integer.MAX_VALUE;
        int curSum = 0;
        for(int i = 0; i < arrayIn.length; i++){
            lenCount++;
            curSum = curSum + arrayIn[i];

            if(curSum >= target){
               if(lenCount < minLenCount){
                   minLenCount = lenCount;
                   lenCount = 0;
               }
               curSum = 0;
            }
        }

        return minLenCount == Integer.MAX_VALUE ? 0: minLenCount;

    }

    /***
     * What I learned from this:
     * -> Sliding window does not just mean a fix window size
     * -> You can increase or decrease the window size based on a
     * set of conditions. As you go through your data structure,
     * using two points.
     * -> You can build the sum of the window as you grow the window
     * and use something like :
     *                 curTotal = curTotal - arrayIn[startP];
     *                 startP++;
     * to reduce the size of the window & sum as you go along
     *
     * This is still Time Complexity: O(n), Space Complexity: O(1)
     * **/
    public static int findMinSubArrayLenSlide(int[] arrayIn, int target){
        int startP = 0;
        int curTotal = 0;
        int curMin = Integer.MAX_VALUE;

        for(int i =0; i < arrayIn.length;i++){
                curTotal = curTotal + arrayIn[i];
                // walking all the way forward till the curTotal is less then target
            /**
             * If you didn't do this you would just end up
             * maintaining an arbitrary window size
             * **/
                while(curTotal >= target){
                    curMin = Math.min(curMin,(i+1)-startP);
                    curTotal = curTotal - arrayIn[startP];
                    startP++;
                }
        }

        return curMin == Integer.MAX_VALUE ? 0 : curMin;
    }
}
