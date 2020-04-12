package com.MessingAround;

public class StepsQuestion {
    public static void main(String[] args){
        PrintSteps(4);
    }

    public static void PrintSteps(int numberOfSteps){
        String[] steps = new String[numberOfSteps];
        for(int i =0; i < numberOfSteps; i++){
            steps[i] = " ";
        }
        for(int i =0; i < numberOfSteps; i++){
            steps[i] = "#";
            System.out.println(String.join("",steps));
        }

    }
}
