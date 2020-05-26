package com.JavaAlgos;

public class FindVowels {
    public static void main(String[] args){
        System.out.println(GetVowels("Hi There!"));
        System.out.println(GetVowels("Why do you ask?"));
        System.out.println(GetVowels("Why?"));
    }
    /**
     * Q: Given a string, return the number of vowels in a string.
     * Input: String
     * Output: Int
     * My Q: What about punctuation and upper case letters ?
     * I guess you don't need to care about punctuation. But definitely upper case.
     */
    public static Integer GetVowels(String input) {
        if(input.length() == 0) return 0;
        int numOfInts = 0;
        char[] inputArr = input.toCharArray();
        for(char val: inputArr){
            String valS = String.valueOf(val).toLowerCase();
            val = valS.charAt(0);
            if(val == 'a' || val == 'e' || val == 'i' || val == 'o' || val == 'u'){
                numOfInts++;
            }
        }
        return numOfInts;
    }
}
