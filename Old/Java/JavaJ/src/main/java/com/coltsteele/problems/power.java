package com.coltsteele.problems;
/*
* implement the math.power function
* */
public class power {
    public static void main(String[] args){
        System.out.println(power.computePower(8,2));
    }

    public static Integer computePower(Integer base, Integer exponent){
        if(exponent == 1){
            return base;
        }
        return base * computePower(base,exponent-1);
    }
}
