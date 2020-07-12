package com.JavaAlgos.StephenGrider;

public class FizzBuzz {
    public static void main(String[] args){
        FizzBuzz.Run(15);
        FizzBuzz.Run(5);
    }

    /*
    * Q: Classic Fizz Buzz kind of Q. 1 -> N(input).
    * Multiples of 3 print "fizz".
    * Multiples of 5 print "buzz".
    * Multiples of both print "fizzbuzz".
    * if not a Multiple of either just print the number.
    *
    * Q: What is the output for Zero ?
    * */
    public static void Run(int n){
        if(n == 0 || n == 1) System.out.println(n);
        for(int i = 1; i <= n; i++){
            boolean isNotZero = i != 0;
            boolean isMultipleOfFive = i % 5 == 0;
            boolean isMultipleOfThree = i % 3 == 0;

            if(isNotZero && isMultipleOfFive && isMultipleOfThree){
                System.out.println("fizzbuzz");
            }else if (isNotZero && isMultipleOfFive){
                System.out.println("buzz");
            }else if (isNotZero && isMultipleOfThree){
                System.out.println("fizz");
            }else {
                System.out.println(i);
            }
        }
    }
}
