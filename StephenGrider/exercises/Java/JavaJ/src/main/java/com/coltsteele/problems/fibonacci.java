package com.coltsteele.problems;
/*
* The classic
* */
public class fibonacci {

    public static void main(String[] args){
        System.out.println(fibonacci.computeInter(8));
        System.out.println(fibonacci.computeRecur(8));
    }

    public static Integer computeRecur(Integer number){
        if(number == 0){
            return 0;
        }
        if(number == 1){
            return 1;
        }
        return computeRecur(number-1) + computeRecur(number-2);
    }

    public static Integer computeInter(Integer number){
        int p1 = 0;
        int p2 = 1;
        int answer = 0;
        for(int i = 1; i < number-1; i++){
            answer = p1 + p2;
            p1 = p2;
            p2 = answer;
        }
        return answer;
    }


}
