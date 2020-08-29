package com.JavaAlgos.ColtSteele.Recursion;

public class Factorial {
    public static void main(String[] args){
        System.out.println(findFactorial(8));
    }

    public static int findFactorial(int value){
        if(value <= 1) return 1;
        return value * findFactorial(value - 1);
    }
}
