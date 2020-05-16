package com.AlgoExpert.problems;

public class subarraySort {
    /*
    * Time: O(n)
    * Space: O(1)
    * */
    public static int[] subarraySort(int[] array) {
        Integer minOutOfOrder = Integer.MAX_VALUE;
        Integer maxOutOfOrder = Integer.MIN_VALUE;

        // Figuring out where the biggest and smallest are
        for(int i =0; i < array.length; i++){
            int curNum = array[i];
            if(isOutOfOrder(i,curNum,array)){
                minOutOfOrder = Math.min(minOutOfOrder,curNum);
                maxOutOfOrder = Math.max(maxOutOfOrder,curNum);
            }
        }

        // checking to see if the array was already in order
        if(minOutOfOrder == Integer.MAX_VALUE){
            return new int[]{-1,-1};
        }

        // finding where the biggest and smallest fit in
        // Smallest
        int idxSmall = 0;
        while (minOutOfOrder >= array[idxSmall]){
            idxSmall++;
        }

        // Largest
        int idxLarge = array.length - 1;
        while(maxOutOfOrder <= array[idxLarge]){
            idxLarge--;
        }

        return new int[]{idxSmall,idxLarge};
    }

    public static boolean isOutOfOrder(int i, int current, int[] array){
        if(i == 0){
            return current > array[i+1];
        }else if (i == array.length-1){
            return current < array[i-1];
        }else{
            return current > array[i+1] || current < array[i-1]; // only looking for stuff that make this out of order
        }
    }
}
