package com.AlgoExpert.problems;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static List<List<Integer>> getPermutations(List<Integer> array) {
        List<List<Integer>> purs = new ArrayList<List<Integer>>();
        List<Integer> curPur = new ArrayList<Integer>();

        pHelper(array,curPur,purs);
        return purs;
    }

    public static void pHelper(List<Integer> array, List<Integer> curPur, List<List<Integer>> purs){
        if(array.size() == 0 && curPur.size() > 0){
            purs.add(curPur);
        }else{
            for(int i =0; i < array.size(); i++){
                List<Integer> newArr = new ArrayList<Integer>(array);
                newArr.remove(i);
                List<Integer> newCurPur = new ArrayList<Integer>(curPur);
                newCurPur.add(array.get(i));
                pHelper(newArr,newCurPur,purs);
            }
        }
    }
}
