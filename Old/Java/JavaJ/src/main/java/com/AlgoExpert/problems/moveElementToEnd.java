package com.AlgoExpert.problems;

import java.util.ArrayList;
import java.util.List;

public class moveElementToEnd {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        if(array.size() == 0){
            return new ArrayList<Integer>();
        }
        int start = 0;
        int backP = array.size() -1;
        while(start < backP){
            while(start < backP && array.get(backP) == toMove){
                backP--;
            }
            if(array.get(start) == toMove){
                int temp = array.get(backP);
                array.set(backP, array.get(start));
                array.set(start,temp);
            }
            start++;
        }
        return array;
    }
}
