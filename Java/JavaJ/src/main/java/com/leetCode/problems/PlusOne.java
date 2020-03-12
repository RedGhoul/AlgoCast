package com.leetCode.problems;

import java.util.ArrayList;

public class PlusOne {
    /*
    * Non elegant Solution still linear run time
    * */
    public int[] plusOneAva(int[] digits) {
        ArrayList<Integer> gg = new ArrayList<Integer>();
        int leftover = 1;
        for(int i = digits.length-1; i >= 0 ; i--){
            int newDigit = digits[i] + leftover;
            if(newDigit >= 10){
                gg.add(0, newDigit % 10);
                if(digits.length == 1){
                    leftover = newDigit /10;
                    gg.add(0, leftover);
                    break;
                }else{
                    leftover = newDigit /10;
                }
            }else{
                gg.add(0, newDigit);
                leftover = 0;
            }
        }
        if(digits.length != 1 && leftover != 0){
            gg.add(0,leftover);
        }
        int[] x = new int[gg.size()];
        for(int y = 0; y <x.length; y++){
            x[y] = gg.get(y);
        }

        return x;

    }
    /*
    * Very Elegant Solution
    * */
    public int[] plusOne(int[] nums) {
        for(int i = nums.length - 1; i >= 0; i--){
            if(nums[i] == 9) {
                nums[i] = 0;
            }
            else {
                nums[i] += 1;
                return nums;
            }
        }

        if(nums[0] == 0){
            int[] result = new int[nums.length + 1];
            result[0] = 1;
            return result;
        }

        return new int[0];
    }
}
