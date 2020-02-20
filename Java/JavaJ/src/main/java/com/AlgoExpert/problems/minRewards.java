package com.AlgoExpert.problems;

import java.util.Arrays;

public class minRewards {
    public static int getMinRewards(int[] scores) {
        int[] rewards = new int[scores.length];
        Arrays.fill(rewards,1);

        for(int i =1;i < scores.length;i++){
            if(scores[i] > scores[i-1]){
                rewards[i] = rewards[i-1] + 1;
            }
        }
        // -2 to give you one minus length aka 2nd last item
        for(int i = scores.length-2; i >= 0;i--){
            if(scores[i] > scores[i+1]){
                rewards[i] = Math.max(rewards[i], rewards[i+1]+1);
            }
        }
        return Arrays.stream(rewards).sum();
    }
}
