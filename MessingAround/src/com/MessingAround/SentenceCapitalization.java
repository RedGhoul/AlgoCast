package com.MessingAround;

public class SentenceCapitalization {
    /*
    * Didn't care about special chars at the beginning
    * */
    public static void main(String[] args){
        System.out.println(capitalize("hi there, how is it going?"));
    }

    public static String capitalize(String input){
        if(input.length() == 0) return input;
        String[] splitStr = input.split(" ");
        for(int i =0; i < splitStr.length; i++){
            splitStr[i] = splitStr[i].substring(0,1).toUpperCase() + splitStr[i].substring(1);
        }

        return String.join(" ",splitStr);
    }
}
