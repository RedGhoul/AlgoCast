package com.stephengrider.problems;

import java.util.ArrayList;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(reverseAString1("apple"));
		System.out.println(reverseAString1("Greetings!"));
		
		
		System.out.println(reverseAString2("apple"));
		System.out.println(reverseAString2("Greetings!"));
	}
	
	public static String reverseAString1(String input) {
		
		ArrayList<String> output = new ArrayList<String>();
		
		for(int i = input.length(); i >= 0; i--) {
			
			if(i == input.length()) {
				output.add(input.substring(i));
			}
			else {
				output.add(input.substring(i,i+1));
			}
		}
				
		
		return String.join("", output);

	}
	
	public static String reverseAString2(String input) {
		String output = "";
		
		
		for(int x = 0; x < input.length(); x++) {
			output = input.substring(x,x+1) + output;
		}
		
		return output;
	}

}
