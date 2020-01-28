package com.coltsteele.problems;

import java.util.HashMap;

/*
* Checks to see if there are any duplicates among the arguments passed in
* */
public class areThereDuplicates {
    public static void main(String[] args){

        System.out.println(areThereDuplicates.check(new int[]{1,2,3,4,5,6,7,8,1}));
    }

    public static boolean check(int[] input){
        HashMap<Integer,Integer> HM = new HashMap<Integer, Integer>();

        for(int i =0; i < input.length; i++){
            if(HM.containsKey(input[i])){
                HM.put(input[i],HM.get(input[i]) +1);
            }else{
                HM.put(input[i],1);
            }
            if(HM.get(input[i]) > 1){
                return true;
            }
        }
        return false;
    }
}
