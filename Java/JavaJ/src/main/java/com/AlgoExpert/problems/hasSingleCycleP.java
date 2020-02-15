package com.AlgoExpert.problems;

public class hasSingleCycleP {
    /*
    * Got the base idea down
    * Don't have to try the single cycle with every since number
    * If it works with one then it works with everything
    *
    * Why store a whole hashmap when you can just store a pointer?
    *
    * Time: O(n)
    * Space: O(1)
    *
    * */
    public static boolean hasSingleCycle(int[] array) {
        int loopCount = 0;

        int newIndex = 0;

        while(loopCount< array.length){

            if(loopCount > 0 && newIndex == 0){
                return false;
            }

            newIndex = calNewIndex(newIndex,array);


            loopCount++;
        }
        return newIndex == 0;
    }

    public static int calNewIndex(int newIndex, int[] array){
        newIndex = (newIndex + array[newIndex]) % array.length;
        if(newIndex < 0){
            return newIndex + array.length;
        }
        return newIndex;
    }
}
