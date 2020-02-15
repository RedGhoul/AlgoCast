package com.joseportilla.problems;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ArrayPairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> input = new ArrayList<Integer>(
				Arrays.asList(1,3,2,2)
				);
		
		System.out.println(outputAllUniquePairs(input,4));
	}
	
	public static HashMap<Integer,Integer> outputAllUniquePairs(ArrayList<Integer> arrayIn, int targetSum) {
		if(arrayIn.size() == 0) {
			return null;
		}
		
		HashMap<Integer,Integer> index = new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> output = new HashMap<Integer,Integer>();
		for(int i = 0; i < arrayIn.size(); i++) {
			Integer diff = Math.abs(arrayIn.get(i) - targetSum);
			index.put(diff,arrayIn.get(i));
		}
		
		for(int j = 0; j < arrayIn.size(); j++) {
			if(index.containsKey(arrayIn.get(j))) {
				if(!output.containsValue(arrayIn.get(j)) &&
						!output.containsKey(arrayIn.get(j))) {
					output.put(arrayIn.get(j), index.get(arrayIn.get(j)));
				}
			}
		}
		
		return output;
	}

}
