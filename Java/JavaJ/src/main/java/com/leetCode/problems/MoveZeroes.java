package com.leetCode.problems;

public class MoveZeroes{

    /*
    * Time: O(n)
    * Space: O(1) In place
    * */
    public void moveZeroes(int[] nums) {

        int backP = 0;
        for(int i =1; i < nums.length; i++){
            /*
            * You only want to make the swap, once you know that
            * i is pointing to a non zero num
            * j is pointing to a zero num
            * then at the very end you inc backP
            *
            * Section B
            * However you also want to account for the case where
            * that isn't true and backP is pointing to a non zero
            * in that case you want to make sure backP is incremented
            * */
            if(nums[i] != 0 && nums[backP] == 0){
                int temp = nums[i];
                nums[i] = nums[backP];
                nums[backP] = temp;
                backP++;
            }else if(nums[backP] != 0){ //Section B
                backP++;
            }
        }

    }
}
