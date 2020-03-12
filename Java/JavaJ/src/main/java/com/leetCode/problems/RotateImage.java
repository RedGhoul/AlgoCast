package com.leetCode.problems;

public class RotateImage {
    public void rotate(int[][] matrix) {
        // Doing the transpose
        for(int row = 0; row < matrix.length; row++){
            /*
            * you want col set to row, or you start to undo alot of the
            * switching you did
            * */
            for(int col = row; col < matrix.length; col++){
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }

        // then reverse each row
        for(int row = 0; row < matrix.length; row++){
            reverse(matrix[row]);
        }
    }

    public static void reverse(int[] arr){
        int i =0;
        int j = arr.length-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
