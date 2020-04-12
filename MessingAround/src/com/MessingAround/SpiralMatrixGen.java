package com.MessingAround;

public class SpiralMatrixGen {
    public static void main(String[] args){
        generateSpiral(4);
    }

    public static  int[][] generateSpiral(int size){
        int[][] sprial = new int[size][size];

        int count = 0;
        int end = size * size;
        int currentRow = 0;
        int currentCol = 0;
        int maxRow = size-1;
        int minRow = 0;
        int maxCol = size-1;
        int minCol = 0;
        while(count < end){
            if(currentRow == minRow){
                for(int i =minCol; i <= maxCol; i++){
                    count++;
                    currentCol = i;
                    sprial[currentRow][i] = count;
                }
                currentRow++;
            }
            if(currentRow > minRow && currentCol == maxCol){
                for(int row=currentRow; row <= maxRow; row++){
                    count++;
                    sprial[row][currentCol] = count;
                    currentRow = row;
                }
                currentCol--;
            }
            if(currentRow == maxRow && currentCol == maxCol-1){
                for(int col = currentCol; col >= minCol; col--){
                    count++;
                    sprial[currentRow][col] = count;
                    currentCol = col;
                }
                currentRow--;
            }
            if(currentCol == minCol){
                for(int row = currentRow; row > minRow;row--){
                    count++;
                    sprial[row][currentCol] = count;
                    currentRow = row;
                }
                currentCol++;
            }
            minCol++;
            minRow++;
            maxCol--;
            maxRow--;

        }

        return sprial;
    }
}
