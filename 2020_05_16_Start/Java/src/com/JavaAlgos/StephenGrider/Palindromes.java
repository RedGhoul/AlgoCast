package com.JavaAlgos.StephenGrider;

public class Palindromes {
    public static void main(String[] args){
        System.out.println(palindromeCheck("abba"));
        System.out.println(palindromeCheck("abcdefg"));
        System.out.println(palindromeCheck("aba"));
        System.out.println(palindromeCheck(" aba"));
        System.out.println(palindromeCheck("aba "));
        System.out.println(palindromeCheck("greetings"));
        System.out.println(palindromeCheck("1000000001"));
        System.out.println(palindromeCheck("Fish hsif"));
        System.out.println(palindromeCheck("pennep"));
        System.out.println(palindromeCheck(""));
        System.out.println(palindromeCheck("a"));
        System.out.println(palindromeCheck(null));
    }
    /*
    * Q: Check if something is a palindrome
    * Input: string as input
    * Output: boolean (true is palindrome, false is NOT a palindrome)
    * - It does care about capitalization and punctuation
    * - Was not given much guidance on empty string or single char string,
    * so assuming that it would be false
    * */
    public static boolean palindromeCheck(String input){
        if(input == null || input.length() == 0 || input.length() == 1) return false;
        char[] inputArr = input.toCharArray();
        int p1 = 0;
        int p2 = inputArr.length -1;
        while(p1 < p2){
            if(inputArr[p1] != inputArr[p2]){
                return false;
            }
            p1++;
            p2--;
        }
        return true;
    }
}
