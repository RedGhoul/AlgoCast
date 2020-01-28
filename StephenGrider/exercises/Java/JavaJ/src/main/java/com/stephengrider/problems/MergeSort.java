package com.stephengrider.problems;


import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args){

    }

    /*
    * Is the slicer. The way you get that pyramid down is by, is be
    * making "sort" slice arrays into two and calling it recursively within another
    * function
    * */
    public static ArrayList<Integer> sort(ArrayList<Integer> input){
        if(input.size() == 1){ // base case
            return input;
        }

        int center = (int)Math.floor(input.size()/2);
        ArrayList<Integer> left = new ArrayList<Integer>(input.subList(0,center));
        ArrayList<Integer> right = new ArrayList<Integer>(input.subList(center,input.size()));

        return merge(sort(left),sort(right));
        /*
        * Each time it recursively calls its self its further sub dividing its self
        * And when it get to the end, the merge function kicks in and starts stitching
        * the two piece together till you have the final merge call, that has two big
        * sorted arrays
        * */
    }

    /*
    * Combiner
    * */
    public static ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer>  right){

        ArrayList<Integer> answer = new ArrayList<Integer>();

        while(left.size() != 0 && right.size() != 0){
            if(left.get(0) < right.get(0)){
                answer.add(left.remove(0));
            }else{
                answer.add(right.remove(0));
            }
        }

        if(left.size() != 0){
            for(Integer i: left){
                answer.add(i);
            }
        }
        if(right.size() != 0){
            for(Integer i: right){
                answer.add(i);
            }
        }

        return answer;
    }
}
