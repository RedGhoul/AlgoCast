package com.AlgoExpert.problems;

import java.util.ArrayList;
import java.util.List;

public class powerset {

    public static void main(String[] args){

        String s = "ADD ME NOW ROOF";
        String[] things = s.split(" ");
        int p1 = 0;
        int p2 = things.length-1;
        while(p1 < p2){
            String temp = things[p1];
            things[p1] = things[p2];
            things[p2] = temp;
            p1++;
            p2--;
        }
        System.out.println(String.join(" ",things));
    }
    public static List<List<Integer>> getPowerSet(List<Integer> array) {
        List<List<Integer>> pSet = new ArrayList<List<Integer>>();

        pSet.add(new ArrayList<Integer>());

        for(int i =0; i < array.size(); i++){
            int currentNum = array.get(i);
            int pSetSize = pSet.size();// have to get the length of the interation from the outside.
            // since if we just did it from the inside it would keep changing
            // every time we added anything to it. And would result in a infinite loop

            for(int p =0; p <pSetSize; p++){
                List<Integer> current = pSet.get(p);
                List<Integer> newPSubSet = new ArrayList<Integer>(current);
                newPSubSet.add(currentNum);
                pSet.add(newPSubSet);
            }
        }

        return pSet;
    }
}
