package com.leetCode.problems;
import java.util.*;
public class ClimbingStairs {
    /*
    * Tabular approach
    * Time: O(n)
    * Space: O(n)
    * Could have also done this recursively
    * */
    public int climbStairs(int n) {
        if(n == 0) return 1;
        List<Integer> answers = new ArrayList<Integer>();
        answers.add(0);
        answers.add(1);
        answers.add(2);
        if (n >= 3){
            for(int i = 3; i < n+1; i++){
                int lastOne = answers.get(i-2);
                int lastSec = answers.get(i-1);
                answers.add(lastOne + lastSec);
            }
        }

        return answers.get(n);
    }
}
