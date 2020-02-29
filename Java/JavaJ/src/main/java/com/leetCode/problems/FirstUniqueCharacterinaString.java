package com.leetCode.problems;

import java.util.HashMap;

public class FirstUniqueCharacterinaString {
    // you can use an array as a map to make everything go even faster
    public int firstUniqChar(String s) {
        // some error handling here
        if(s.length() == 0){
            return -1;
        }

        HashMap<String,Integer> bag = new HashMap<String,Integer>();
        String[] array = s.split("");

        for(int i = 0; i < array.length; i++){
            if(bag.containsKey(array[i])){
                bag.put(array[i], bag.get(array[i]) + 1);
            }else{
                bag.put(array[i], 1);
            }
        }

        for(int i = 0; i < array.length; i++){
            if(bag.get(array[i]) == 1){
                return i;
            }
        }

        return -1;

    }
}
