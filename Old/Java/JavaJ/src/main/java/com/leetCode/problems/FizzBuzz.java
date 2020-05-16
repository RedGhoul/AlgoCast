package com.leetCode.problems;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<String>();
        if(n == 0) return answer;
        for(int i =1; i < n+1; i++){
            Boolean isM3 = i % 3 == 0;
            Boolean isM5 = i % 5 == 0;
            if(isM3 & isM5){
                answer.add("FizzBuzz");
            }else if (isM3){
                answer.add("Fizz");
            }else if (isM5) {
                answer.add("Buzz");
            }else {
                answer.add(String.valueOf(i));
            }
        }
        return answer;
    }
}
