package com.AlgoExpert.problems;

import java.util.ArrayList;
import java.util.List;

public class zigzagTraverse {
    public static List<Integer> zigzagTraverse(List<List<Integer>> array) {
        int height = array.size() -1; // max amount of rows
        int width = array.get(0).size() - 1; // max amount of cols

        List<Integer> result = new ArrayList<Integer>();

        int row = 0;
        int col = 0;
        boolean goingDown = true;

        while(!isOutOfBounds(row,col,height,width)){
            result.add(array.get(row).get(col));
            if(goingDown){
                if(col == 0 || row == height){
                    goingDown = false;
                    if(row == height){ // its the max height aka the bottom row
                        col++;
                    }else{
                        row++;
                    }
                }else { // I am just going to be going down in general
                    col--;
                    row++;
                }
            } else {
                if(row == 0 || col == width){
                    goingDown = true;
                    if(col == width){
                        row++;
                    }else{
                        col++;
                    }
                }else{ // if I am not in the top right perimeter then I am going to be going up
                    row--;
                    col++;
                }
            }


        }
        return result;
    }
    public static boolean isOutOfBounds(int row, int col, int height, int width){
        return row < 0 || row > height || col < 0 || col > width;
    }
}
