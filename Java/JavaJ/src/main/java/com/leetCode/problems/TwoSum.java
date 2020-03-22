package com.leetCode.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args){
        twoSum(new int[]{3,2,3},6);
    }

    /*
    * Elegant solution
    * */
    public int[] twoSume(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashh = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){

            hashh.put(target-nums[i],nums[i]);
        }

        HashMap<Integer,Integer> hashhs = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            hashhs.put(nums[i],i);
        }

        for(int x = 0; x <nums.length; x++){
            if(hashh.containsKey(nums[x])){
                int oppSumEle = hashh.get(nums[x]);
                if((oppSumEle + nums[x] == target) && oppSumEle != nums[x]){
                    return new int[] {x,hashhs.get(oppSumEle)};
                }else if((oppSumEle + nums[x] == target) && x != hashhs.get(oppSumEle)){
                    return new int[] {x,hashhs.get(oppSumEle)};
                }
            }
        }
        return new int[]{0,0};

    }
    public int[] twoSumTwoPointer(int[] nums, int target) {
        HashMap<Integer, Integer> hashh = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            hashh.put(nums[i], i);
        }
        Arrays.sort(nums);
        int startP = 0;
        int endP = nums.length - 1;
        int sum = 0;
        while (startP < endP) {
            sum = nums[startP] + nums[endP];
            if (sum == target) {
                break;
            } else if (sum > target) {
                endP--;
            } else if (sum < target) {
                startP++;
            }

        }

        return new int[]{hashh.get(nums[startP]), hashh.get(nums[endP])};
    }
}
