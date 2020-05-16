package com.leetCode.problems;

public class Numberof1Bits {
    public static void main(String[] args){
        System.out.println("you".substring(1));
    }
    public int hammingWeight(int n) {
        //String[] tt = Integer.toString(n).split("");
        int bit = 0;
        int mask = 1;
        for(int i = 0; i < 32; i++){
            if((n & mask) != 0){
                bit++;
            }
            mask = mask << 1;
        }

        return bit;
    }
}
