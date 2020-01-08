package StephenGrider;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {  
	// --- Directions
	// Check to see if two provided strings are anagrams of each other.
	// One string is an anagram of another if it uses the same characters
	// in the same quantity. Only consider characters, not spaces
	// or punctuation.  Consider capital letters to be the same as lower case
	// --- Examples
	//   anagrams('rail safety', 'fairy tales') --> True
	//   anagrams('RAIL! SAFETY!', 'fairy tales') --> True
	//   anagrams('Hi there', 'Bye there') --> False
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] one = {"rail safety", "RAIL! SAFETY!","Hi there"};
		String[] two = {"fairy tales", "fairy tales","Bye there"};
		
		for (int i =0; i < one.length; i ++) {
			System.out.println(anagramCheck(one[i],two[i]));
		}

		
		
	}
	
	public static HashMap<String,Integer> getHashMapOfString(String string){
		HashMap<String,Integer> S1HashMap = new HashMap<String,Integer>();
		
		for(int i = 0; i < string.length(); i++) {
			String letter = Character.toString(string.charAt(i));
			
			if(S1HashMap.containsKey(letter)) {
				S1HashMap.put(letter,S1HashMap.get(letter) + 1);
			}else {
				S1HashMap.put(letter,1);
			}
			
		}
		return S1HashMap;
	}
	
	public static boolean anagramCheck(String S1, String S2) {
		if(S1.length() == 0 || S2.length() == 0) {
			return false;
		}

		HashMap<String,Integer> S1HashMap = getHashMapOfString(S1);
		HashMap<String,Integer> S2HashMap = getHashMapOfString(S2);
		
		
		for(Map.Entry<String,Integer> entry: S1HashMap.entrySet()) {
			if(S2HashMap.containsKey(entry.getKey())) {
				if(S2HashMap.get(entry.getKey()) != entry.getValue()) {
					return false;
				}
			}else {
				return false;
			}
		}
		
		return true;
	}

}
