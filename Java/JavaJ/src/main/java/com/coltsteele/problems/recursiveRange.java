package com.coltsteele.problems;
/*
* accepts a number and adds up all the number from zero to the number you were given
* */
public class recursiveRange {
    public static void main(String[] args){
        System.out.println(recursiveRange.compute(10));
    }

    public static Integer compute(Integer number){
        if(number == 0){
            return 0;
        }

        return number + compute(number-1);
    }
}
