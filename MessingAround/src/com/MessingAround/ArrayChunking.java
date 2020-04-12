package com.MessingAround;

import java.util.ArrayList;

public class ArrayChunking {
    public static void main(String[] args){
        //Chunk(new int[]{1, 2, 3, 4},2);
        Chunk(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13},5);
    }

    public static ArrayList<ArrayList<Integer>> Chunk(int[] array, int size){
        if(size > array.length - 1){
            return new ArrayList<ArrayList<Integer>>();
        }
        ArrayList<Integer> curArray = new ArrayList<Integer>();
        for(int i =0; i < array.length; i++){
            curArray.add(array[i]);
        }
        ArrayList<ArrayList<Integer>> outArray = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> subOutArray = new ArrayList<Integer>();
        for(int i =1; i < curArray.size()+1; i++){

            if(i % size == 0){
                subOutArray.add(curArray.get(i-1));
                outArray.add(subOutArray);
                subOutArray = new ArrayList<Integer>();
            }else{
                subOutArray.add(curArray.get(i-1));
            }
        }
        if(subOutArray.size() > 0){
            outArray.add(subOutArray);
        }
        return outArray;
    }
}
