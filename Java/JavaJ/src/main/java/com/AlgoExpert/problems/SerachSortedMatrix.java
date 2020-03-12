package com.AlgoExpert.problems;

public class SerachSortedMatrix {
    public static void main(String[] args){

    }

    public static int[] searchInSortedMatrix(int[][] matrix, int target) {
        int col = matrix[0].length-1;
        int row = 0;

        while(col >= 0 && row < matrix.length){
            int currentVal = matrix[row][col];
            if(currentVal > target){
                col--;
            }else if(currentVal < target){
                row++;
            }else {
                return new int[]{row,col};
            }
        }

        return new int[]{-1,-1};
    }
}
