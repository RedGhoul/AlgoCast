package com.AlgoExpert.Code;

public class TwoNumberSum {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // error checking code

        if(array.length == 0){
            return new int[0];
        }
        // Write your code here.
        java.util.HashMap<Integer,Integer> sumMap = new java.util.HashMap<Integer,Integer>();

        for(int i =0; i < array.length; i++){
            int key = targetSum - array[i];
            sumMap.put(key,array[i]);
        }

        for(int i =0; i < array.length; i++){
            if(sumMap.containsKey(array[i])){
                if(array[i] != sumMap.get(array[i])){ // super werid but really got test case
                    int[] answer = new int[]{array[i],sumMap.get(array[i])};
                    return answer;
                }

            }
        }


        return new int[0]; // they asked for empty should have been empty
    }
}
