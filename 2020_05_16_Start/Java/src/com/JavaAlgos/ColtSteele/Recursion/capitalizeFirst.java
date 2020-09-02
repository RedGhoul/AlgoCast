package com.JavaAlgos.ColtSteele.Recursion;

import java.util.Arrays;

public class capitalizeFirst {
    /***
     * Not considering puncuation
     * @param args
     */
    public static void main(String[] args){
        System.out.println(Arrays.toString(capFirst(new String[] {"c","hat","mat"})));
    }

    public static String[] capFirst(String[] arr){
        if(arr.length == 0) return null;
        return capFirstHelper(arr, 0);
    }

    public static String[] capFirstHelper(String[] arr,int index){
        if(index > arr.length-1) return arr;
        arr[index] = arr[index].substring(0,1).toUpperCase() + arr[index].substring(1);
        return capFirstHelper(arr,index+1);
    }
}