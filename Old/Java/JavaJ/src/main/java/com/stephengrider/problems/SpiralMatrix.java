package com.stephengrider.problems;
// --- Directions
// Write a function that accepts an integer N
// and returns a NxN spiral matrix.
// --- Examples
//   matrix(2)
//     [[1, 2],
//     [4, 3]]
//   matrix(3)
//     [[1, 2, 3],
//     [8, 9, 4],
//     [7, 6, 5]]
//  matrix(4)
//     [[1,   2,  3, 4],
//     [12, 13, 14, 5],
//     [11, 16, 15, 6],
//     [10,  9,  8, 7]]
public class SpiralMatrix {
    public static void main(String[] args){

        System.out.println(SpiralMatrix.spiralMatrixGenerator(4));
    }

    public static int[][] spiralMatrixGenerator(int Size){

        int[][] sprial = new int[Size][Size];

        int maxCol = Size - 1;
        int minCol = 0;

        int maxRow = Size - 1;
        int minRow = 0;

        int count =1;
        /*
        * The whole idea of this solution is that you have a bunch of little loops
        * inside of one bit loop. Each iteration of the big loop builds up one layer
        * of the spiral. And each little loop builds up one edge of the layer.
        * */
        while(minCol <= maxCol && minRow <= maxRow){
            /*
            * Doing the first row full of numbers
            * */
            for(int col = minCol; col <= maxCol; col++){

                sprial[minRow][col] = count;
                count++;
            }
            /*
            * Since we just did the first row we now have to
            * Set a new MinRow since we need to start from one row
            * down to make the new col
            * */
            minRow++;

            /*
            * Here we go through making the col, and we stop at the max row
            * */
            for(int row = minRow; row <= maxRow; row++){

                sprial[row][maxCol] = count;
                count++;
            }
            /*
            * Since just completed a col all the way to the end. We need to reduce
            * what the max Col is since we just reduced it, cause we just made that col
            * */
            maxCol--;

            /*
            * Here we just go through the last bottom row filling stuff in.
            * Since we need to go from right to left we use a decrement for loop
            * where the maxCol (the thing we just reduced) is where is starts.
            * And it stops at the minCol
            * */
            for(int col=maxCol; col >= minCol; col--){

                sprial[maxRow][col] = count;
                count++;
            }
            /*
            * Since we just completely filled in the lowest row of the matrix
            * we need to set the maxRow one less.
            * */
            maxRow--;
            /*
            * Now we need to build the left col. Since we are starting from the bottom
            * we need to use a subtracting for loop, and using the minCol and decreasing
            * the row each loop till we hit the max
            * */
            for(int row = maxRow; row >= minRow; row--){

                sprial[row][minCol] = count;
                count++;
            }
            /*
            * Since we just filled in the last minCol. We need to increment it by one
            * */
            minCol++;
        }

        return sprial;
    }

}
