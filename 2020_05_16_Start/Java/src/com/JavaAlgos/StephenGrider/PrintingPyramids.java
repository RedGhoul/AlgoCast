package com.JavaAlgos.StephenGrider;

import java.util.ArrayList;
import java.util.List;

public class PrintingPyramids {
    public static void main(String[] args){
        printPyramids(23);
    }

    /**
     * Q: Accepts a positive number N. Then prints a pyramid shape
     * with N levels using the "#" character. Make sure the pyramid
     * has spaces on the left and right.
     * Input: Integer level
     * Output: Pyramid printed to the screen
     * Ideas: Could use arrays lists - Arrays
     */
    public static void printPyramids(int level){
        if(level == 0) System.out.println("");
        if(level == 1) System.out.println("#");
        char[] answer = new char[findMaxLevelSize(level)];
        int mid = ((answer.length-1)/2);
        answer[mid] = '#';
        System.out.println(answer);
        int right = mid+1;
        int left = mid-1;
        for(int i = 1; i < level; i++){
            answer[right] = '#';
            answer[left] = '#';
            System.out.println(answer);
            right++;
            left--;
        }
    }

    public static int findMaxLevelSize(int level){
        if(level == 0) return 0;
        return 1 + ((level-1)*2);
    }
}
