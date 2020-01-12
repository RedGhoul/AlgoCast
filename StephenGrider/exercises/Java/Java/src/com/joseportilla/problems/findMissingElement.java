package com.joseportilla.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class findMissingElement {

	public static void main(String[] args) {
		
		System.out.println(findMissing(new ArrayList<Integer>() {{
					add(1);
					add(1);
					add(1);
					add(2);
					add(3);
					add(4);
					add(5);
					add(6);
					add(7);
				  }},
				new ArrayList<Integer>() {{
					add(3);
					add(7);
					add(2);
					add(1);
					add(4);
					add(6);
				  }}
				));

	}
	
	public static HashMap<Integer, Integer> createHashFromArrayList(ArrayList<Integer> input){
		HashMap<Integer, Integer> hash = new HashMap<Integer,Integer>();
			
			for(int i = 0; i < input.size(); i++) {
				Integer key = input.get(i);
				if(hash.containsKey(key)) {
					hash.put(key, hash.get(key) + 1);
				}else {
					hash.put(key,1);
				}
			}
		return hash;
	}
	// accounts for dups
	public static ArrayList<Integer> findMissing(ArrayList<Integer> unMod, ArrayList<Integer> mod){
		
		HashMap<Integer, Integer> unModHash = createHashFromArrayList(unMod);
		HashMap<Integer, Integer> modHash = createHashFromArrayList(mod);
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(Map.Entry<Integer,Integer> entry: unModHash.entrySet()) {
			if(modHash.containsKey(entry.getKey())) {
			  Integer numModHash = modHash.get(entry.getKey());
			  Integer numUnModHash = unModHash.get(entry.getKey());
			  
			  if(numModHash != numUnModHash) {
				  Integer diff = Math.abs(numModHash-numUnModHash);
				  
				  for(int i = 0; i < diff; i++) {
					  result.add(entry.getKey());
				  }
			  }
			}else {
				result.add(entry.getKey());
			}
		}
		
		return result;
		
		
	}

}
