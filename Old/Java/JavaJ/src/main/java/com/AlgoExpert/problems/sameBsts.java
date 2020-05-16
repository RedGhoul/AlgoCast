package com.AlgoExpert.problems;

import java.util.ArrayList;
import java.util.List;

public class sameBsts {
    /*
    * If given two arrays of INTs. Do they represent the same bst ?
    *
    * do the first elements match ? - cause you want them to have the same root node
    * are they the same length ? - cause they both need to contain the same number of elements
    * now find me everything lower then the root
    * now find me everything higher then the root
    *
    * not keep repeating me for every higher and lower array
    * */
    public static boolean sameBsts(List<Integer> arrayOne, List<Integer> arrayTwo) {
        if(arrayOne.size() != arrayTwo.size()){
            return false;
        }

        if(arrayOne.size() == 0 && arrayTwo.size() == 0){
            return true;
        }

        if(arrayOne.get(0).intValue() != arrayTwo.get(0).intValue()){
            return false;
        }

        List<Integer> leftOne = getSmaller(arrayOne);
        List<Integer> leftTwo = getSmaller(arrayTwo);

        List<Integer> rightOne = getBiggerOrEqual(arrayOne);
        List<Integer> rightTwo = getBiggerOrEqual(arrayTwo);

        return sameBsts(leftOne,leftTwo) && sameBsts(rightOne,rightTwo);
    }

    public static List<Integer> getSmaller(List<Integer> array){
        List<Integer> tempList = new ArrayList<Integer>();
        for(int i =1; i < array.size(); i++){
            if(array.get(i).intValue() < array.get(0).intValue() ){
                tempList.add(array.get(i));
            }
        }
        return tempList;
    }

    public static List<Integer> getBiggerOrEqual(List<Integer> array){
        List<Integer> tempList = new ArrayList<Integer>();
        for(int i =1; i < array.size(); i++){
            if(array.get(i).intValue()  >= array.get(0).intValue() ){
                tempList.add(array.get(i));
            }
        }
        return tempList;
    }
}
