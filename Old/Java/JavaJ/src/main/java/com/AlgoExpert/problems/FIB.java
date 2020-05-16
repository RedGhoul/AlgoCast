package com.AlgoExpert.Code;

public class FIB {
    public static int getNthFib(int n) { // this guys makes us go from one
        if(n <= 1){
            return 0;
        }
        if(n == 2){
            return 1;
        }
        return getNthFib(n -2) + getNthFib(n-1);
    }
}
