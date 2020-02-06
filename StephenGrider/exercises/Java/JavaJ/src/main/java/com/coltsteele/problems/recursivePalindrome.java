package com.coltsteele.problems;
/*
* String that is the same forwards and backwards
*
* An example of a palindrome is "tacocat"
* */
public class recursivePalindrome {
    public static void main(String[] args){
        System.out.println(recursivePalindrome.isPalindrome("tacocat"));
        System.out.println(recursivePalindrome.isPalindrome("amanaplanacanalpanama"));
    }

    public static Boolean isPalindrome(String input){
        if(input.length() == 0 || input.length() == 1){
            // I guess in this case it wouldn't properly handle
            // an error input where the string would be empty
            // but I guess you can say that an empty string is a palindrome
            // you could get rid of this by just calling it in another function
            // with error checking
            return true;
        }
        if(input.charAt(0) != input.charAt(input.length()-1)){
            return false;
        }
        return isPalindrome(input.substring(1,input.length()-1));
    }
}
