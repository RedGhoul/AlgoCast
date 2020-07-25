package com.JavaAlgos.ColtSteele;
import java.util.*;
public class isSubsequence {
    public static void main(String[] args){
        System.out.println(isXSubOfY("hello","hello world"));
        System.out.println(isXSubOfY("sing","sting"));
        System.out.println(isXSubOfY("abc","abracadabra"));
        System.out.println(isXSubOfY("abc","acb"));
        System.out.println(isXSubOfY("sing me song","sting me spong"));
    }

    /**
     * takes two string and checks wherther the chars in the first string form a sub
     * sequence of the chars in the second string. The order matters for the second string(pattern).
     *
     * cares about capitals and punctuation
     * does not care about spaces
     * **/
    public static boolean isXSubOfY(String pattern, String pool){
        pattern = pattern.replace(" ","");
        pool = pool.replace(" ","");
        if(pattern.length() == 0 || pool.length() == 0) return false;
        if(pattern.length() > pool.length()) return false;
        int patternPointer = 0;
        int poolPointer = 0;
        char[] patternArray = pattern.toCharArray();
        char[] poolArray = pool.toCharArray();
        while(true){

            if(patternArray[patternPointer] != poolArray[poolPointer]){
                poolPointer++;
            }else{
                poolPointer++;
                patternPointer++;
            }
            if(patternPointer == patternArray.length-1 && poolPointer == poolArray.length-1){
                return true;
            }
            if(poolPointer > poolArray.length-1){
                return false;
            }
            if(patternPointer > patternArray.length-1){
                return true;
            }

        }
    }
}
