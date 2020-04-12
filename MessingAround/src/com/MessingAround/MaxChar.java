package com.MessingAround;
import java.util.*;
public class MaxChar {
    public static void main(String[] args){
        System.out.println(findMaxChars("abcdefghijklmnaaaaa"));
        System.out.println(findMaxChars("ab1c1d1e1f1g1"));
    }

    public static String findMaxChars(String input){
        if(input.isEmpty())return input;
        HashMap<Character, Integer> bag = new HashMap<Character, Integer>();
        char[] inputArray = input.toCharArray();
        for (char val: inputArray) {
            if(bag.containsKey(val)){
                bag.put(val,bag.get(val)+1);
            }else{
                bag.put(val,1);
            }
        }
        int curMaxInt = Integer.MIN_VALUE;
        String curMaxString = "";
        for(Map.Entry<Character,Integer> entry: bag.entrySet()){
            if(entry.getValue() > curMaxInt){
                curMaxInt = entry.getValue();
                curMaxString = Character.toString(entry.getKey());
            }
        }
        return curMaxString;
    }
}
