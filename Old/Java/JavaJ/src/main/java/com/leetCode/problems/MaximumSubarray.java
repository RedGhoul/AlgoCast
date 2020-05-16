package com.leetCode.problems;

public class MaximumSubarray {
    /*
    * Basically implementing Kadane algorithm
    * */
    public int maxSubArray(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        int curSum = 0;
        int curMax = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(curSum < 0){
                curSum = 0;
            }
            curSum = curSum + nums[i];
            if(curSum > curMax){
                curMax = curSum;
            }
        }

        return curMax;
    }
}
