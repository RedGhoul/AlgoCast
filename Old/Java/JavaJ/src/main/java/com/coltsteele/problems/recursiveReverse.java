package com.coltsteele.problems;

/*
* accepts a string and returns a new string in reverse
* */
public class recursiveReverse {
    public static void main(String[] args){
        System.out.println(recursiveReverse.reverse("hello"));
    }

    public static String reverse(String input){
        if(input.length() == 0){
            return "";
        }
        return input.charAt(input.length()-1) + reverse(input.substring(0,input.length()-1));
    }
}
