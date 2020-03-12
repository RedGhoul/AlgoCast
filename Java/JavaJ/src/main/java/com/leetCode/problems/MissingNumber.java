package com.leetCode.problems;

public class MissingNumber {
    /*
    * Linear time and space
    * comparing the perfect and non perfect sums
    * */
    public int missingNumber(int[] nums) {
        if(nums.length == 0)return 0;
        int perfectSum = 0;
        for(int i = 0; i <= nums.length; i++){
            perfectSum = perfectSum + i;
        }
        int nonPerfectSum = 0;
        for(int i = 0; i < nums.length; i++){
            nonPerfectSum = nonPerfectSum + nums[i];
        }
        return Math.abs(perfectSum - nonPerfectSum);
    }
}
