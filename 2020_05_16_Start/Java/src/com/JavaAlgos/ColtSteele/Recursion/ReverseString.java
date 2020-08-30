package com.JavaAlgos.ColtSteele.Recursion;

public class ReverseString {
    public static void main(String[] args){
        System.out.println(Reverse("checks"));
        System.out.println(Reverse("Backend"));
    }

    public static String Reverse(String value){
        if(value.isEmpty()) return "";
        return value.substring(value.length()-1) + Reverse(value.substring(0,value.length()-1));
    }
}
