package com.MessingAround;

public class FizzBuzz {
    public static void main(String[] args){
        FizzBuxx(15);
    }

    public static void FizzBuxx(int input){
        if(input == 0) return;
        for(int i = 1; i < input+1; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("fizzbuzz");
            }else if(i % 3 == 0){
                System.out.println("fizz");
            }else if(i % 5 == 0){
                System.out.println("buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
