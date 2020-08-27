package com.JavaAlgos.ColtSteele;

public class Factorial {

    public static void main(String[] args){
        System.out.println(FindInterative(23));
        System.out.println(FindRecursivley(23333));

    }

    public static int FindInterative(int num){
        if(num == 0) return 0;
        int finalFac = 1;
        for(int value = 1; value <= num; value++){
            finalFac = finalFac * value;
        }
        return finalFac;
    }

    public static int FindRecursivley(int num){
        if(num <= 1) return 1;
        return num * FindRecursivley(num-1);
    }
}
