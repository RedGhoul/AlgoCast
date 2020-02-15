package com.coltsteele.problems;

import java.util.HashMap;
import java.util.Map;

/*
* Given two positive numbers find out if the two numbers have the same frequency of digits.
*
*
* How do we handle negatives ?
* I am just going to count "-" as a char
* */
public class sameFrequencyCounter {
    public static void main(String[] args){
        System.out.println(sameFrequencyCounter.isSameFrequency(182,281));
    }

    public static boolean isSameFrequency(int num1, int num2){

        String number1 = Integer.toString(num1);
        String number2 = Integer.toString(num2);

        if(number1.length() != number2.length()){
            return false;
        }
        HashMap<String,Integer> HMNumber1 = sameFrequencyCounter.StringToHM(number1);
        HashMap<String,Integer> HMNumber2 = sameFrequencyCounter.StringToHM(number2);

        for(Map.Entry<String,Integer> entry: HMNumber1.entrySet()){
            if(HMNumber2.containsKey(entry.getKey())){
               if(HMNumber2.get(entry.getKey()) != entry.getValue()){
                   return false;
               }
            }else{
                return false;
            }
        }

        return true;

    }

    public static HashMap<String,Integer> StringToHM(String input){
        HashMap<String,Integer> HMNumber1 = new HashMap<String,Integer>();
        for(int i =0; i < input.length(); i++){
            String currentKey = Character.toString(input.charAt(i));
            if(HMNumber1.containsKey(currentKey)){
                HMNumber1.put(currentKey, HMNumber1.get(currentKey) +1);
            }else{
                HMNumber1.put(currentKey,1);
            }
        }
        return HMNumber1;
    }
}
