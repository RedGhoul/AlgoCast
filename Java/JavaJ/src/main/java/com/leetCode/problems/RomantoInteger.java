package com.leetCode.problems;

import java.util.HashMap;
import java.util.Map;

public class RomantoInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        char[] chars = s.toCharArray();
        int result = 0;
        int i = 0, j = 1;
        /*
        * And here we increment i & j
        * */
        for(; j < chars.length; i++, j++) {
            /*
            * If the first thing is greater than the sec thing we don't have to
            * worry about the subtraction cases. And we just add the current value
            * */
            if (map.get(chars[i]) >= map.get(chars[j])) {
                result += map.get(chars[i]);
            } else {
                /*
                * In this case the first thing was smaller than the last thing so
                * we subtract its value from the total
                * */
                result -= map.get(chars[i]);
            }
        }
        result += map.get(chars[i]); // we incremented J 1 ahead of J so we need to add the last char in the array
        return result;
    }
}
