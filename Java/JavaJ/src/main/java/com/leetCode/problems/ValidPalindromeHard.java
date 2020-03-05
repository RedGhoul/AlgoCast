package com.leetCode.problems;

public class ValidPalindromeHard {
    //string have punctuation :(
    // Only Alphanumeric
    public boolean isPalindrome(String s) {
        char[] array = s.toCharArray();

        int start = 0;
        int end = array.length - 1;

        while(start < end){
            char firstChar = array[start];
            char secChar = array[end];
            if((Character.isDigit(firstChar) || Character.isDigit(secChar)) && array.length == 2 && firstChar != secChar){
                return false;
            }
            if((Character.isLetter(firstChar) && Character.isLetter(secChar))){
                if(Character.toLowerCase(firstChar) != Character.toLowerCase(secChar)){
                    return false;
                }else{
                    start++;
                    end--;
                }
            }
            else if((Character.isDigit(firstChar) && Character.isDigit(secChar))){
                if(firstChar != secChar){
                    return false;
                }else{
                    start++;
                    end--;
                }
            }else if((Character.isDigit(firstChar) || Character.isLetter(firstChar)) && (Character.isDigit(secChar) || Character.isLetter(secChar))) {
                if(firstChar != secChar){
                    return false;
                }else{
                    start++;
                    end--;
                }
            }
            if(!Character.isLetter(firstChar) && !Character.isDigit(firstChar)){
                start++;
            }
            if(!Character.isLetter(secChar) && !Character.isDigit(secChar)){
                end--;
            }

        }

        return true;
    }
}
