package com.JavaAlgos.ColtSteele.Recursion;

public class IsPalindrome {
    public static void main(String[] args){
        System.out.println(Check("civic"));
        System.out.println(Check("leg"));
    }

    public static boolean Check(String value){
        if(value.length() == 1) return true;
        if(value.isEmpty()) return false;
        //                          this is the beginning type
        if(value.charAt(0) == value.charAt(value.length()-1)){
        /*
        * We are using the substring method using begin index and end index.
        * There for the end index supplied will not reach the very end. Rather
        * it will reach the value at the index before the end index.
        * */
            return Check(value.substring(1,value.length()-1));
        }
        return false;
    }
}

