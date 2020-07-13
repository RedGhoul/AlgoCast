package com.JavaAlgos.ColtSteele;

public class FindMaxSubArraySum {
    public static void main(String[] args){
        System.out.println(findSingleLoop(new double[]{100,200,300,400},2));
        System.out.println(findSingleLoop(new double[]{1,4,2,10,23,3,1,0,20},4));
        System.out.println(findSingleLoop(new double[]{-3,4,0,-2,6,-1},2));
        System.out.println(findSingleLoop(new double[]{3,-2,7,-4,1,-1,4,-2,1},2));
        System.out.println(findSingleLoop(new double[]{2,3},3));
    }

    public static double find(double[] arrayIn, int subArraySize){
        if(subArraySize > arrayIn.length-1) return 0;
        if(arrayIn.length-1 == 1) return arrayIn[0];
        double maxSum = Double.MIN_VALUE;

        int curStart = 1;
        int curEnd = subArraySize;
        double curValue = 0;

        for(int i = 0; i < subArraySize; i++){
            curValue = curValue + arrayIn[i];
        }
        if(curValue > maxSum){
            maxSum = curValue;
        }
        while(curEnd < arrayIn.length){
            curValue = curValue - arrayIn[curStart-1];
            curValue = curValue + arrayIn[curEnd];
            if(curValue > maxSum){
                maxSum = curValue;
            }
            curStart++;
            curEnd++;
        }
        if(maxSum == Double.MIN_VALUE) return curValue;
        return maxSum;
    }

    public static double findSingleLoop(double[] arrayIn, int windowSize){
        if(arrayIn.length -1 < windowSize) return 0;
        double curMax = Double.MIN_VALUE;
        double curValue = 0;
        for(int i =0; i < arrayIn.length; i++){
            curValue = curValue + arrayIn[i];

            if(i == windowSize-1){
                curMax = Math.max(curMax,curValue);
            }

            if(i > windowSize-1){
                curValue = curValue - arrayIn[i - windowSize];
                /**
                 * Now your three places forward. And need to remove the last one
                 * at back.
                 * **/
                curMax = Math.max(curMax,curValue);
            }
        }
        return curMax;
    }
}
