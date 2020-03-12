package com.leetCode.problems;

public class arrayRotation {
    /*
    * Time: O(n)
    * Space: O(n) since your building out a new array
    * */
    public static void main(String[] args){
        rotate(new int[]{1,2,3,4,5,6,7},3);
    }
    public static void rotate(int[] nums, int k) {
        if(nums.length == 0){
            return;
        }
        if(k == 0){
            return;
        }
        int[] newArr = new int[nums.length];
        for(int curIndex =0; curIndex < nums.length; curIndex++){
            int newIndex = (curIndex + k) % nums.length;
            newArr[newIndex] = nums[curIndex];
        }
        nums = newArr;
    }
}
