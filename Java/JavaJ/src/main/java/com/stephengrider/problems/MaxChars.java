package com.stephengrider.problems;

import java.util.HashMap;
import java.util.Map;

// --- Directions
// Given a string, return the character that is most
// commonly used in the string.
// --- Examples
// maxChar("abcccccccd") === "c"
// maxChar("apple 1231111") === "1"
public class MaxChars {

    public static void main(String[] args){

    }
    /*
    * Make a distinction between capitals and lower case letters
    * */
    public static String maxChar(String input){
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for(int index =0; index < input.length(); index++){
            String currentChar = Character.toString(input.charAt(index));
            if(map.containsKey(currentChar)){
                map.put(currentChar, map.get(currentChar) + 1);
            }else{
                map.put(currentChar,1);
            }
        }

        Integer maxCount = Integer.MIN_VALUE;
        String maxCountChar = "";
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
                maxCountChar = entry.getKey();
            }
        }

        return maxCountChar;
    }

}
