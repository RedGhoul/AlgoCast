package com.MessingAround;

import java.util.HashMap;
import java.util.Map;

public class AnagramCheck {
    /*
    *
    * Didn't consider punctuation
    * */
    public static void main(String[] args){
        System.out.println(checkAnagram("hello","llohe"));
        System.out.println(checkAnagram("One One","Two two two"));
        System.out.println(checkAnagram("Whoa! Hi!","Hi! Whoa!"));
    }

    public static boolean checkAnagram(String String1, String String2){
        HashMap<Character,Integer> bag = new HashMap<Character, Integer>();
        for(int i =0; i < String1.length(); i++){
            Character Key = String1.charAt(i);
            if(!bag.containsKey(Key)){
                bag.put(Key,1);
            }else {
                bag.put(Key, bag.get(Key)+1);
            }
        }

        for(int i=0; i < String2.length(); i++){
            Character key = String2.charAt(i);
            if(bag.containsKey(key)){
                bag.put(key,bag.get(key)-1);
            }else {
                return false;
            }
        }

        for(Map.Entry<Character,Integer> entry: bag.entrySet()){
            if(entry.getValue() != 0 || entry.getValue() < 0){
                return false;
            }
        }
        return true;
    }
}
