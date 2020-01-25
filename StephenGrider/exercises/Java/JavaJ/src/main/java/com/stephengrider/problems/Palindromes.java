package com.stephengrider.problems;

//--- Directions
//Given a string, return true if the string is a palindrome
//or false if it is not.  Palindromes are strings that
//form the same word if it is reversed. *Do* include spaces
//and punctuation in determining if the string is a palindrome.
//--- Examples:
//palindrome("abba") === true
//palindrome("abcdefg") === false
public class Palindromes {

	public static void main(String[] args) {
		System.out.println(isPalindromeV1("abba"));
		System.out.println(isPalindromeV1("abcdefg"));
		System.out.println(isPalindromeV1("pennep"));
		
		System.out.println(isPalindromeV2("abba"));
		System.out.println(isPalindromeV2("abcdefg"));
		System.out.println(isPalindromeV2("pennep"));
	}
	/*
	 * Reversing a string and then comparing it
	 * */
	public static boolean isPalindromeV1(String input) {
		if(input == null || input.equals("")) { // error input handling
			return false;
		}
		String reversedInput = "";
		
		for(int index = 0; index < input.length(); index++) {
			reversedInput = Character.toString(input.charAt(index)) + reversedInput;
		}
		
		if(input.equals(reversedInput)) {
			return true;
		}
		return false;
	}
	
	/*
	 * Using the two pointer method, and comparing what each one is pointing to
	 * They should both always be the same
	 * */
	public static boolean isPalindromeV2(String input) {
		if(input == null || input.equals("")) {
			return false;
		}
		
		int p1 = 0;
		int p2 = input.length()-1;
		
		while(p1 < p2) {
			if(input.charAt(p1) != input.charAt(p2)) { // you can do this since they primative data types
				return false;
			}else {
				p1++;
				p2--;
			}
		}
		
		return true;
	}
	
}
