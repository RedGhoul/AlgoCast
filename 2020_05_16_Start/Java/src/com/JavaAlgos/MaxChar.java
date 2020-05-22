package com.JavaAlgos;

import java.util.HashMap; // have to use this, to use HashMPa
import java.util.Map;

public class MaxChar {
    public static void main(String[] args){
        System.out.println(FindMaxChar("abccccccccccd"));
        System.out.println(FindMaxChar("apple 12311111"));
        System.out.println(FindMaxChar("abcdefghijklmnaaaaa"));
        System.out.println(FindMaxChar("ab1c1d1e1f1g1"));
    }

    /*
    * Q: Given a string find the char that appears the most
    * Input: string containing chars
    * Output: string of most commonly used char
    *
    * My Q: What if everything is equal ?
    * What if two chars are tied for the highest ?
    * What about capitals and punctuation and spacing ?
    * */
    public static String FindMaxChar(String input){
        if(input.length() == 0 || input.length() == 1) return input;

        HashMap<Character,Integer> charCount = new HashMap<Character, Integer>();

        char[] InputCharArr = input.toCharArray();

        for(int i =0; i < InputCharArr.length;i++){
            char curChar = InputCharArr[i];
            if(charCount.containsKey(curChar)){
                charCount.put(curChar,charCount.get(curChar)+1);
            }else{
                charCount.put(curChar,1);
            }
        }
        char maxChar = ' ';
        int maxCount = Integer.MIN_VALUE;

        for(Map.Entry<Character,Integer> entry: charCount.entrySet()){
            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        return String.valueOf(maxChar);
    }
}
