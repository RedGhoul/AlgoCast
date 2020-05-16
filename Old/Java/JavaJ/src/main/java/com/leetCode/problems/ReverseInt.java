package com.leetCode.problems;

public class ReverseInt {
    public int reverse(int x) {
        if(x < 10 && x > -10){
            return x;
        }
        String[] array = null;

        if(x > 0){
            array = Integer.toString(x).split("");
        }else{
            array = Integer.toString(x).substring(1).split("");
        }

        int start = 0;
        int end = array.length - 1;
        while(start < end){
            String temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        String currentIntString = String.join("",array);

        if(Long.parseLong(currentIntString) > Integer.MAX_VALUE){
            return 0;
        }

        if(Integer.MIN_VALUE > Long.parseLong(currentIntString)){
            return 0;
        }

        if(x < 0){
            return -1 * Integer.parseInt(currentIntString);
        }else{
            return Integer.parseInt(currentIntString);
        }

    }
}
