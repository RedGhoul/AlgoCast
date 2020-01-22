package com.stephengrider.problems;
//--- Directions
//Write a function that accepts a string.  The function should
//capitalize the first letter of each word in the string then
//return the capitalized string.
//--- Examples
//capitalize('a short sentence') --> 'A Short Sentence'
//capitalize('a lazy fox') --> 'A Lazy Fox'
//capitalize('look, it is working!') --> 'Look, It Is Working!'
public class Capitalize {
	
	public static void main(String[] args) {
		
		String[] tests = {"a short sentence","a lazy fox","look, it is working!"};
		for (int i =0; i < tests.length; i++) {
			System.out.println("Input: => " + tests[i]);
			System.out.println(capitalizeSentance(tests[i]));
		}
		
	}
	
	public static String capitalizeSentance(String sentence) {
		// Error checking
		if(sentence.length() == 0) {// string require () but arrays don't require it
			return "String is empty";
		}
		String[] pieces = sentence.split(" ");
		
		for(int i =0; i < pieces.length; i++) {
			// got to use substring to figure out what to change and 
			// how to change it
			String one = pieces[i].substring(0,1).toUpperCase();
			String two = pieces[i].substring(1);
			pieces[i] = one + two;
		}
		
		return String.join(" ", pieces);
		
		
	}

}
