package com.stephengrider.problems;

/*
* Basic idea. If my current element is great then the one next to it
* then switch positions. But then do that till the end of the array.
* And do it for each element.
* */
public class BubbleSort {

    public static void main(String[] args){
        int[] arr = BubbleSort.Sort(new int[]{10,-30,97,0,5});
        for (int i: arr) {
            System.out.print(" "+i);
        }
    }

    public static int[] Sort(int[] input){
        int arrayLength = input.length;

        for(int index =0; index < arrayLength; index++){

            // array length Minus one since you are always adding one
            // to index2.you reduce the search space by index every time
            // since you already found the next highest number
            for(int index2 =0; index2 < arrayLength-index-1; index2++){
                if(input[index2] > input[index2+1]){
                    int temp = input[index2];
                    input[index2] = input[index2+1];
                    input[index2+1] = temp;
                }
            }
        }


        return input;
    }
}
