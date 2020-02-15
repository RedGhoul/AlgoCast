package com.AlgoExpert.Code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductSum {

    public static void main(String[] args){
        List<Object> test = new ArrayList<Object>();
        test.add(new ArrayList<Object>(
                Arrays.asList(
                        new ArrayList<Object>(
                                Arrays.asList(
                                        new ArrayList<Object>(
                                                Arrays.asList(
                                                        new ArrayList<Object>(Arrays.asList(5))
                                                )
                                        )
                                )
                        )
                )
        ));

        System.out.println(productSum(test));
    }
    public static int productSum(List<Object> array) {
        return productSumHelper(array,1);
    }

    public static int productSumHelper(List<Object> array, int currentDepth){
        int currentSum = 0;
        for(int i =0; i < array.size(); i++){
            if(array.get(i) instanceof List){
                currentSum = currentSum + productSumHelper((List<Object>)array.get(i), currentDepth+1);
            }else{
                currentSum = currentSum + (currentDepth *(int)array.get(i));
            }
        }
        return  currentSum; // everything was right, just forgot about basic BEDMASS
    }

}
