package com.leetCode.problems;

import java.util.Random;

public class ShuffleAnArray {
    class Solution {

        private int[] initalState;
        private Random rand;
        public Solution(int[] nums) {
            initalState = nums;
            rand = new Random();
        }
        private int randRange(int min, int max) {
            return rand.nextInt(max - min) + min;
        }
        /** Resets the array to its original configuration and return it. */
        public int[] reset() {
            return initalState;
        }

        /** Returns a random shuffling of the array. */
        public int[] shuffle() {
            int[] output = initalState.clone();
            for(int i =0; i < initalState.length; i++){

                swap(i, randRange(i, initalState.length),output);
            }
            return output;
        }
        // Could put into something else
        private void swap(int a, int b, int[]num){
            int temp = num[a];
            num[a] = num[b];
            num[b] = temp;
        }
    }
}
