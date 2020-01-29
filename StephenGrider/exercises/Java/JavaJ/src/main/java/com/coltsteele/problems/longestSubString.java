package com.coltsteele.problems;

import java.util.ArrayList;
import java.util.HashMap;

/*
* returns length of the longest Substring
* */
public class longestSubString {
    public static void main(String[] args){
        System.out.println(longestSubString.findLongestSubString("rithmschool"));

    }

    /*
    * Assuming that I have to respect the case of the letters
    * */
    public static Integer findLongestSubString(String input){
        if(input == null || input.isEmpty()){
            return 0;
        }
        int currentUniqueCount = 0;
        int maxUniqueCount =0;

        HashMap<Character,Integer> bagOfChars = new HashMap<Character,Integer>();

        for(int i =0; i < input.length(); i++){
            Character currentChar = input.charAt(i);
            if(bagOfChars.containsKey(currentChar)){
                if(currentUniqueCount > maxUniqueCount){
                    maxUniqueCount =currentUniqueCount;
                }
                currentUniqueCount = 0;
                bagOfChars.clear();
                bagOfChars.put(currentChar,1);
                currentUniqueCount++;
            }else{
                bagOfChars.put(currentChar,1);
                currentUniqueCount++;
            }
        }

        return maxUniqueCount;
    }

}
