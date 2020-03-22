package com.leetCode.problems;

public class HouseRobber {
    //https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/
    // dynamic-programming/576/discuss/156523/From-good-to-great.-How-to-approach-most-of-DP-problems.
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        int last = 0;
        int lastToLast = 0;
        for (int current : nums) {
            int tmp = last;
            last = Math.max(lastToLast + current, last);
            lastToLast = tmp;
        }
        return last;
    }
}
