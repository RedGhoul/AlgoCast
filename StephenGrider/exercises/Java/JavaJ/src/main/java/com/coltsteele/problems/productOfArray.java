package com.coltsteele.problems;

/*
* given an array of numbers return the product of them all
* */
public class productOfArray {

    public static void main(String[] args){
        System.out.println(productOfArray.compute(new Integer[]{1,2,3,10},null));
    }

    public static Integer compute(Integer[] input, Integer index){
        if(index == null){
            index = 0;
        }
        if(index > input.length-1){
            return 1;
        }

        return input[index] * compute(input,index + 1);
    }
}
