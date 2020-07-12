package com.JavaAlgos.StephenGrider;

import java.util.ArrayList;

public class MatrixSpirals {
    public static void main(String[] args){
        System.out.println(genrateSpiral(60));
    }

    /**
     * Q: Given a integer N, return a N by N spiral matrix
     * Input: Int N
     * Output: N by N matrix
     * */
    public static int[][] genrateSpiral(int N){
        //Setup current Col and Row size - Use a while loop
        int MaxCol = N-1;
        int MaxRow = N-1;
        int MinCol = 0;
        int MinRow = 0;
        int curCol = 0;
        int curRow = 0;
        int[][] answer = new int[N][N];
        int counter = 1;
        while(counter <= N*N){
            //making the top row
            for(int i =MinCol; i <= MaxCol; i++){
                answer[MinRow][i] = counter;
                counter++;
                curCol++;
            }
            curRow++;
            MinRow++;
            //Making right hand side down
            for(int i = MinRow; i <= MaxRow; i++){
                answer[i][MaxCol] = counter;
                counter++;
                curRow++;
            }
            curCol--;
            MaxCol--;
            //Making bottom going left
            for(int i = MaxCol; i >= MinCol; i--){
                answer[MaxRow][i] = counter;
                counter++;
                curCol--;
            }
            curRow--;
            MaxRow--;
            //Making Left Hand side going up
            for(int i = MaxRow; i >= MinRow; i--){
                answer[i][MinCol] = counter;
                counter++;
                curRow--;
            }
            curCol++;
            MinCol++;
        }
        return answer;

    }
}
