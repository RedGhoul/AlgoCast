package com.joseportilla.problems;

import java.util.ArrayList;

//Considered Dynamic Programming
public class LargestContinuousSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findLargestConinuousSum(new int[] {1,2,-1,3,4,10,10,-10,-1}));
		System.out.println(findLargestConinuousSumProper(new int[] {1,2,-1,3,4,10,10,-10,-1}));
		
		System.out.println(findLargestConinuousSum(new int[] {-2,-3,4,-1,-2,1,5,-3}));
		System.out.println(findLargestConinuousSumProper(new int[] {-2,-3,4,-1,-2,1,5,-3}));

	}
	public static int findLargestConinuousSumProper(int[] inputArray) {
		int finalMax = 0;
		int runningSum = 0;
		
		for(int i = 0; i < inputArray.length; i++) {
			runningSum = runningSum + inputArray[i];
			/*
			 * If you keep adding things that are soo negative 
			 * that the whole sum becomes negative then
			 * there is no point. So now you have to reset
			 * **/
			if(runningSum < 0) {
				runningSum =0;
			}
			
			/*
			 * You can only update the max if the current running sum is
			 * bigger
			 * **/
			
			if(runningSum > finalMax) {
				finalMax = runningSum;
			}
			
			
		}
		
		return finalMax;
	}
	
	public static int findLargestConinuousSum(int[] inputArray) {
		
		int currentMax = 0;
		int arraySize = inputArray.length -1;
		int startP = 0;
		int endP = startP + 1;
		while( startP != arraySize) {
			int tempMax = computeSum(inputArray,startP,endP);
			if(currentMax < tempMax) {
				currentMax = tempMax;
			}
			if(endP == arraySize) {
				startP++;
				endP = startP + 1;
			}
			else {
				endP++;
			}
			
		}
		
		return currentMax;
	}
	
	public static int computeSum(int[] input, int start, int end) {
		int sum = 0;
		for(int i = start; i < end; i++) {
			sum = sum + input[i];
		}
		
		return sum;
	}

}
