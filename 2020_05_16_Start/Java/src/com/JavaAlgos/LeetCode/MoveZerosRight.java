package com.JavaAlgos.LeetCode;

import java.util.Arrays;

public class MoveZerosRight {
    public static void main(String[] args){
        System.out.println(Arrays.toString(moveZeroes(new int[] {1,0,0,0,3})));
        System.out.println(Arrays.toString(moveZeroes(new int[] {0,0,0,0,0,220,0,20,2})));
    }
    /*
    Leet Code - 283. Move Zeroes
    Given an array of ints move all zeros to the right while keeping
    the original order of elements
    * */
    public static int[] moveZeroes(int[] nums) {
        if(nums == null || nums.length <= 1) return null;
        int p2 = 0;
        for(int p1 = 1; p1 < nums.length; p1++){
            if(nums[p2] == 0 && nums[p1] != 0){
                swap(nums,p2,p1);
                p2++;
            }
            else if(nums[p2] != 0){
                p2++;
            }
        }
        return nums;
    }
    
    public static void swap(int[] nums, int a, int b){
        int aa = nums[a];
        nums[a] = nums[b];
        nums[b] = aa;
    }
}
