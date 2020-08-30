package com.JavaAlgos.ColtSteele.Recursion;

public class RecursiveRange {
    public static void main(String[] args){
        System.out.println(RecursiveRangeAdder(6));
        System.out.println(RecursiveRangeAdder(10));
    }

    public static int RecursiveRangeAdder(int value){
        if(value <= 0) return 0;
        return value + RecursiveRangeAdder(value -1);
    }
}
