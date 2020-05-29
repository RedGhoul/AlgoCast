package com.JavaAlgos;

public class Fibonacci {
    public static void main(String[] args){
        System.out.println(firstTimeRun(12));
        System.out.println(iteractiveRun(12));
    }

    public static int firstTimeRun(int n){
        if(n <= 1) return n;
        return firstTimeRun(n-1) + firstTimeRun(n-2);
    }

    public static int iteractiveRun(int n){
        if(n <= 1) return n;
        int P1 = 0;
        int P2 = 1;
        int curAnswer = 0;
        for(int i = 0; i < n-1;i++){
            curAnswer = P1 + P2;
            P1 = P2;
            P2 = curAnswer;
        }
        return curAnswer;
    }
}
