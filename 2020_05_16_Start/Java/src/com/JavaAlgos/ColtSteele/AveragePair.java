package com.JavaAlgos.ColtSteele;

public class AveragePair {
    public static void main(String[] args){
        System.out.println(isThereAvgPair(new double[]{1,2,3},2.5));
        System.out.println(isThereAvgPair(new double[]{1,3,3,5,6,7,10,12,19},8));
        System.out.println(isThereAvgPair(new double[]{-1,0,3,4,5,6},4.1));
        System.out.println(isThereAvgPair(new double[]{},4));
    }

    public static boolean isThereAvgPair(double[] array, double target){
        if(array.length == 0) return false;
        int start = 0;
        int end = array.length-1;
        while(start < end){
            double curAvg = computeAvg(array[start],array[end]);
            if(curAvg == target) return true;
            if(curAvg > target){
                end--;
            }else if(curAvg < target){
                start++;
            }
        }
        return false;
    }

    public static double computeAvg(double a, double b){
        return (a+b)/2;
    }
}
