package com.AlgoExpert.problems;

public class BinarySerach {

    public static void main(String[] args){
        int temps = Math.round(1 /2);
        int[] input = new int[] {22,23};
        //System.out.println(binarySearch(input, ,0,input.length-1));
    }

    /*
    * Like WTF did you get this to work is this really a binary serach.
    * You just got to subtract the array by one
    * if less then middle minus 1 is the end
    * if greater then middle + 1 is the start
    * then you keep finding the mid by start + end / 2
    *
    *
    * -> the sort of methodology you used in the start - Arrays.copyOf(array, start , end);
    * // have to add one to the end to get the actual end you want
    * */
    public static int binarySearch(int[] array, int target, int start,int end) {
        if(end-start == 1 && array[end] ==target){
            return end;
        }
        if(end-start == 1 && array[start] == target){
            return start;
        }
        int middle = (end-start) / 2;

        if(end-start == 1 && array[start] != target){
            return -1;
        }
        if(end-start == 1 && array[end] !=target){
            return -1;
        }
        if(target < array[middle+start]){ // going to the right
            return binarySearch(array,target,start,middle+start);
        }else if (target > array[middle+start]){ // going to the left
            return binarySearch(array,target,middle+start,end);
        }else if(target == array[middle+start]){
            return middle+start;
        }
        return -1;
    }

    public static int binarySearchProper(int[] array, int target, int start, int end){
        if(start > end){
            return -1;
        }

        int mid = (start + end) / 2;

        int potentialMatch = array[mid];

        if(potentialMatch == target){
            return mid;
        }else if(target > potentialMatch){
            return binarySearchProper(array,target,mid+1,end); // greater then case
        }else {
            return binarySearchProper(array,target,start,mid-1); // less then case
        }
    }

}
