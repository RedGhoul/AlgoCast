package com.JavaAlgos.StephenGrider;

import java.util.ArrayList;
import java.util.HashMap;

public class Fibonacci {
    public static void main(String[] args){
        int input = 50;
        long startTime = System.currentTimeMillis();
        System.out.println(firstTimeRun(input)); // exponential Run Time
        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");

        startTime = System.currentTimeMillis();
        System.out.println(iterativeRun(input));
        endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");

        startTime = System.currentTimeMillis();
        System.out.println(iterativeArrayRun(input));
        endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");

        startTime = System.currentTimeMillis();
        System.out.println(memoization(input,null));
        endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");

    }

    public static int firstTimeRun(int n){
        if(n <= 1) return n;
        return firstTimeRun(n-1) + firstTimeRun(n-2);
    }

    public static int memoization(int n, HashMap<Integer,Integer> hash){
        if(hash == null){
            hash = new HashMap<Integer, Integer>();
        }
        if(n <= 1) return n;
        if(hash.containsKey(n)){
            return hash.get(n);
        }else{
            Integer answer = memoization(n-1,hash) + memoization(n-2,hash);
            hash.put(n,answer);
            return answer;
        }
    }

    public static int iterativeRun(int n){
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

    public static int iterativeArrayRun(int n){
        if(n<= 1)return n;
        ArrayList<Integer> fibArray = new ArrayList<Integer>();
        fibArray.add(0);
        fibArray.add(1);
        for(int i = 2; i <= n; i++){
            Integer p1 = fibArray.get(i-1);
            Integer p2 = fibArray.get(i-2);
            Integer newNum = p1+p2;
            fibArray.add(newNum);
        }
        return fibArray.get(n);
    }
}
