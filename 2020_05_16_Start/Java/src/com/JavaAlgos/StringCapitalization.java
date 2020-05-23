package com.JavaAlgos;

public class StringCapitalization {
    public static void main(String[] args){
        System.out.println(StringCap("hi there, how is it going?"));
        System.out.println(StringCap("i love breakfast at bill miller bbq"));
    }

    /*
    * Q: Capitalize the first letter of each word in the string,
    * and then return string.
    * Input: String
    * Output: String
    * My Q: what to do if the string is null ?
    *
    * */
    public static String StringCap(String input){
        if(input == null) return null;
        if(input.isEmpty() || input.isBlank()) return input;

        String[] inputArr = input.split(" ");
        for(int i = 0; i < inputArr.length; i++){
            String curString = inputArr[i];
            if(curString.length() > 1){
                // substring goes all the way from the start to 1- the end value you give
                // so substring(0,1) is just going to give you the first value
                // the second value will all ways represent the length of values you want to get
                // Whereas substring(1) will get you all the stuff from the start to the very end of the string
                curString = curString.substring(0,1).toUpperCase() + curString.substring(1);
            }else{
                curString = curString.toUpperCase();
            }
            inputArr[i] = curString;
        }

        return String.join(" ", inputArr);
    }
}
