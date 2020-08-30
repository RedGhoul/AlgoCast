package com.JavaAlgos.ColtSteele.Recursion;

public class FibonacciSequence {
    public static void main(String[] args){
        System.out.println(FindValueAtFibIndex(4));
        System.out.println(FindValueAtFibIndex(10));
        System.out.println(FindValueAtFibIndex(28));
        System.out.println(FindValueAtFibIndex(35));
    }

    public static int FindValueAtFibIndex(int index){
        if(index == 1) return 1;
        if(index == 0) return 0;
        return FindValueAtFibIndex(index -2) + FindValueAtFibIndex(index-1);
    }
}
