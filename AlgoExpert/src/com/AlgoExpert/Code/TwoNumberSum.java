package com.AlgoExpert.Code;
/*
* Time complexity - O(n) since we are only going through the loop once. Worst case we have to iterate through
* all the values
* Space complexity - O(n) since we are just adding things to the hash map. And worst case we have to
* iterate thorough all the array values and put them in hashmap
* */
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
            sumMap.put(key,array[i]); //Where we have 10 - 5 = 5 and we put 5 into the hashmap.
        }

        for(int i =0; i < array.length; i++){
            if(sumMap.containsKey(array[i])){
                /*
                * But then when we get to this point we see it in the hashmap
                * and assume that its the sum we are looking for. However there is only one 5 in
                * the list. So we end up returning the wrong answer.
                * What we can do to combat this is to use one big loop rather then two small loops
                * As seen in the V2 of this function.
                *
                *
                * */

                /*
                * This is the stop gap solution I came up with at the time
                * */
                if(array[i] != sumMap.get(array[i])){
                    int[] answer = new int[]{array[i],sumMap.get(array[i])};
                    return answer;
                }

            }
        }


        return new int[0]; // they asked for empty should have been empty
    }

    public static int[] twoNumberSumV2(int[] array, int targetSum) {
        // error checking code

        if(array.length == 0){
            return new int[0];
        }
        // Write your code here.
        java.util.HashMap<Integer,Integer> sumMap = new java.util.HashMap<Integer,Integer>();

        for(int i =0; i < array.length; i++){
            /*
            * Here we are building a hashmap and checking it
            * */
            int key = targetSum - array[i];
            if(sumMap.containsKey(key)){

                    int[] answer = new int[]{array[i],sumMap.get(array[i])};
                    return answer;

            }else{
                /*
                * The reason we are putting the exact value from the array, rather then
                * the computed different found in the var "key" is because if there is a sum
                * then there are going to be sum pairs
                *
                * so if we have 10 - 3 = 7 where 10 is the target sum and 3 is the array value
                * we will not see the 7 is sumMap yet.
                * However as we keep going through the array we should encounter a 7, if 3 and 7 are sum pairs
                * And when we do we will compute 10 - 7 = 3 and "3" will be in the HashMap. S
                * */
                sumMap.put(array[i],array[i]); //Where we have 10 - 5 = 5 and we put 5 into the hashmap.
            }
        }

        return new int[0]; // they asked for empty should have been empty
    }
}
