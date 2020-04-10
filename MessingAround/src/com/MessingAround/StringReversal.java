package com.MessingAround;

public class StringReversal {
    /*
    * Assuming Case does not matter
    * */
    public static void main(String[] args){
        System.out.println(StringReversal.reversal("abcd"));
        System.out.println(StringReversal.reversal("  abcd"));
        System.out.println(StringReversal.reversal("apple"));
        System.out.println(StringReversal.reversal("Greetings!"));
    }

    public static String reversal(String input){
        if(input.length()-1 < 2) return input; // looking at length
        input = input.replace(" ",""); // string sanitization
        char[] inputArray = input.toCharArray();
        int start = 0;
        int end = input.length()-1;
        while(start < end){
            char temp = inputArray[start];
            inputArray[start] = inputArray[end];
            inputArray[end] = temp;
            start++;
            end--;
        }
        return new String(inputArray);
    }
}
