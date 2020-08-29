package com.JavaAlgos.ColtSteele.Recursion;

import java.util.Arrays;

public class ProductOfArray {
    public static void main(String[] args){
        System.out.println(findProductOfArray(new int[]{1,2,3,10}));
    }

    public static int findProductOfArray(int[] curArray){
        if(curArray.length == 1) return curArray[0];
        if(curArray.length == 0) return 0;
        // copy range needs one more then the full length of the array to copy everything
        return curArray[0] * findProductOfArray(Arrays.copyOfRange(curArray,1,curArray.length));
    }
}
