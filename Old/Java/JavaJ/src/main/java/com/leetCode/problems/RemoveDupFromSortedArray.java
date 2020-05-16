package com.leetCode.problems;

public class RemoveDupFromSortedArray {
    /*
    * Remember that you can always just over write an array elements
    * Time:O(n)
    * Space:O(1)
    * */
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int start = 0;
        for(int end = start +1; end < nums.length; end++){
            if(nums[start] != nums[end]){
                start++;
                nums[start] = nums[end];
            }
        }
        return start+1;
    }
}
