package com.stephengrider.problems;

import java.util.ArrayList;
import java.util.List;

public class ArrayChunks {
	// --- Directions
	// Given an array and chunk size, divide the array into many subarrays
	// where each subarray is of length size
	// --- Examples
	// chunk([1, 2, 3, 4], 2) --> [[ 1, 2], [3, 4]]
	// chunk([1, 2, 3, 4, 5], 2) --> [[ 1, 2], [3, 4], [5]]
	// chunk([1, 2, 3, 4, 5, 6, 7, 8], 3) --> [[ 1, 2, 3], [4, 5, 6], [7, 8]]
	// chunk([1, 2, 3, 4, 5], 4) --> [[ 1, 2, 3, 4], [5]]
	// chunk([1, 2, 3, 4, 5], 10) --> [[ 1, 2, 3, 4, 5]]
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> input = new ArrayList<Integer>() {{
			add(1);
			add(2);
			add(3);
			add(4);
		}};
		
		System.out.println(createChunks(input,2));
		
		
		ArrayList<Integer> input3 = new ArrayList<Integer>() {{
			add(1);
			add(2);
			add(3);
			add(4);
			add(5);
		}};
		
		System.out.println(createChunks(input3,2));
		
		ArrayList<Integer> input2 = new ArrayList<Integer>() {{
			add(1);
			add(2);
			add(3);
			add(4);
			add(5);
			add(6);
			add(7);
			add(8);
		}};
		
		System.out.println(createChunks(input2,3));

		
		ArrayList<Integer> input6 = new ArrayList<Integer>() {{
			add(1);
			add(2);
			add(3);
			add(4);
			add(5);
			add(6);
			add(7);
			add(8);
		}};
		
		System.out.println(createChunks(input6,10));
	}
	/*
	* Assuming we are getting an array list in
	* */
	public static ArrayList<ArrayList<Integer>> createChunks(ArrayList<Integer> input, int size){
		
		ArrayList<ArrayList<Integer>> answer = new ArrayList<ArrayList<Integer>>();
		if(size == 0 || size > input.size()) {
			answer.add(input);
			return answer;
		}
		
		ArrayList<Integer> tempBuffer = new ArrayList<Integer>();
		
		for(int i = 0; i < input.size(); i++) {
			/*
			We check if the "i" is equal to the size.
			if it isn't then we keep adding each element to the
			temp buffer.

			Once we get an "i" to our size we add what we have in out tempbuffer
			to the arrayList of arrayLists. Then we set the tempbuffer to a
			new arrayList. And then we add the current element to the new
			tempbuffer.
			 */
			if (i % size ==0 && i != 0) {
				answer.add(tempBuffer);
				tempBuffer = new ArrayList<Integer>();
				tempBuffer.add(input.get(i));
			}else {
				tempBuffer.add(input.get(i));
			}
		}

		/*
		* Once we finished with the array. We check to see if we have
		* anything else in the tempBuffer. If we do then it is the left
		* over that could not form an array to the size criteria. So we
		* add what ever is left to the answer array and return it
		* */
		if(tempBuffer.size() > 0) {
			answer.add(tempBuffer);
		}
		
		return answer;
		
		
	}

}
