package com.coltsteele.problems;

public class factorial {
    public static void main(String[] args){
        System.out.println(factorial.computeFactorialIter(7));
        System.out.println(factorial.computeFactorialRecur(7,null));
    }

    public static Integer computeFactorialRecur(Integer number, Integer currentProduct){
        if(number == 0){
            return currentProduct;
        }
        if(currentProduct == null){
            currentProduct = 1;
        }
        currentProduct = currentProduct * number;
        return computeFactorialRecur(number-1,currentProduct);
    }

    public static Integer computeFactorialIter(int number){
        int currentProduct = 1;

        for(int i =1; i <= number; i++){
            currentProduct = currentProduct * i;
        }

        return currentProduct;
    }
}
