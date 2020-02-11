package com.AlgoExpert.problems;

public class isPalindrome {

    public static boolean isPalindromeA(String str) {
        if(str.length() == 0){
            return false;
        }
        int start = 0;
        int end = str.length() - 1;
        while (start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
