package com.stephengrider.problems;

import java.util.ArrayList;
import java.util.HashMap;

public class Fibonacci {

	// counting from Zero
	public static void main(String[] args) {
		int input = 200;
//		long startTime = System.currentTimeMillis();
//
//		System.out.println(fibonacci_Find_Recur(input));
//
//		long endTime = System.currentTimeMillis();
//
//		System.out.println("That took " + (endTime - startTime) + " milliseconds + fibonacci_Find_Recur");


		long startTime2 = System.currentTimeMillis();

		System.out.println(fibonacci_Find_Iter(input));

		long endTime2 = System.currentTimeMillis();

		System.out.println("That took " + (endTime2 - startTime2) + " milliseconds + fibonacci_Find_Iter");


		long startTime3 = System.currentTimeMillis();

		System.out.println(fibonacci_Find_Recur_Memo( input,null));

		long endTime3 = System.currentTimeMillis();

		System.out.println("That took " + (endTime3 - startTime3) + " milliseconds + fibonacci_Find_Recur_Memo");


	}

	public static Integer fibonacci_Find_Recur_Memo(int sequenceNumber, HashMap<Integer,Integer> map){
		if(map == null){
			map = new HashMap<Integer, Integer>();
		}
		if(sequenceNumber < 0){
			return null;
		}
		if(sequenceNumber == 0){
			return 0;
		}else if(sequenceNumber == 1){
			return 1;
		}

		if(map.containsKey(sequenceNumber)){
			return map.get(sequenceNumber);
		}

		Integer answer = fibonacci_Find_Recur_Memo(sequenceNumber-1,map) + fibonacci_Find_Recur_Memo(sequenceNumber-2,map);

		map.put(sequenceNumber,answer);

		return answer;
	}
	public static Integer fibonacci_Find_Recur(int number){
		if(number < 0){
			return null;
		}
		if(number == 0) {
			return 0;
		} else if(number == 1){
			return 1;
		}

		return fibonacci_Find_Recur(number-1) + fibonacci_Find_Recur(number-2);
	}

	public static Integer fibonacci_Find_Iter(int number){
		if(number == 0){
			return 0;
		}else if(number == 1){
			return 1;
		}

		Integer first = 0;
		Integer second = 1;
		Integer finalAnswer = 0;
		for(int i =1; i < number; i++){
			finalAnswer = first + second;
			first = second;
			second = finalAnswer;
		}

		return finalAnswer;
	}

}
