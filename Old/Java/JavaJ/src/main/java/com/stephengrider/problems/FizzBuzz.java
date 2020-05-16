package com.stephengrider.problems;
// --- Directions
// Write a program that console logs the numbers
// from 1 to n. But for multiples of three print
// “fizz” instead of the number and for the multiples
// of five print “buzz”. For numbers which are multiples
// of both three and five print “fizzbuzz”.
// --- Example
//   fizzBuzz(5);
//   1
//   2
//   fizz
//   4
//   buzz
public class FizzBuzz {

    public static void main(String[] args){
        DoFizzBuzz(5);
        DoFizzBuzz(15);
    }

    public static void DoFizzBuzz(int n){
        for(int index =1; index < n+1; index++){
            boolean isMultipleOfFive = index % 5 == 0;
            boolean isMultipleOfThree = index % 3 ==0;
            if(isMultipleOfFive && isMultipleOfThree){
                System.out.println("fizzbuzz");
            }else if (isMultipleOfFive){
                System.out.println("buzz");
            }else if (isMultipleOfThree){
                System.out.println("fizz");
            }else{
                System.out.println(index);
            }
        }
    }
}
