package com.JavaAlgos.ColtSteele.Recursion;

public class Power {
    public static void main(String[] args){
        System.out.println(findPower(2,0));
        System.out.println(findPower(2,2));
        System.out.println(findPower(2,4));
        System.out.println(findPower(2,100));
    }

    public static int findPower(int base, int expo){
        if(expo == 0) return 1;
        return base*findPower(base,expo-1);
    }
}
