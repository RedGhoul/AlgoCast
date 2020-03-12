package com.leetCode.problems;
import java.util.*;
public class PascalsTriangle {
    /*
    * No real way to do it other than the way you did it
    * */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        List<Integer> top = new ArrayList<Integer>();
        if(numRows == 0) {
            return answer;
        }
        top.add(1);
        answer.add(top);

        if(numRows == 1){
            return answer;
        }
        top = new ArrayList<Integer>();
        top.add(1);
        top.add(1);
        answer.add(top);
        for(int i = 2; i < numRows; i++){
            top = new ArrayList<Integer>();
            List<Integer> prevList = answer.get(i-1);
            int newLen = prevList.size() - 1;
            for(int j = 0; j < newLen; j++){
                int first = prevList.get(j);
                int sec = prevList.get(j+1);
                top.add(first+sec);
            }
            top.add(1);
            top.add(0,1);
            answer.add(top);
        }

        return answer;
    }
}
