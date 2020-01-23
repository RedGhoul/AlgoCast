package com.stephengrider.problems;

import java.util.ArrayList;

public class Pyramid {
	// --- Directions
	// Write a function that accepts a positive number N.
	// The function should console log a pyramid shape
	// with N levels using the # character.  Make sure the
	// pyramid has spaces on both the left *and* right hand sides
	// --- Examples
	//   pyramid(1)
	//	       '#'
		//   pyramid(2)
	//	       ' # '
	//	       '###'
		//   pyramid(4)
	//	      '   #   '
	//	      '  ###  '
	//	      ' ##### '
	//        '#######'
	
	public static void main(String[] args) {
		makePyramid(7);
	}
	/**
	 * The way this was solved was by finding the mathematical relationship
	 * between the final base height and the number of layers.
	 *
	 * Then finding the mid point of the layer. And then for each layer
	 * increasing the number of "#" of each side of the mid point which
	 * already had a "#"
	 * **/
	public static void makePyramid(double height) {
		// error checking code
		if(height == 0) {
			System.out.println("Height was Zero");
		}else if(height == 1){
			System.out.println("#");
		}
		
		double baseSize = (height * 2) -1;// since array starts at index zero
		ArrayList<String> layer = new ArrayList<String>();
		
		for(int i = 0; i < baseSize; i ++) {
			layer.add(" ");
		}
		
		double midPoint = Math.round(baseSize/2) -1;
		
		layer.set((int)midPoint,"#");
		
		int leftP = (int) midPoint - 1;
		int rightP = (int)midPoint + 1;
		
		System.out.println(layer);
		
		for(int i = 1; i < height; i ++) {
			layer.set(leftP,"#");
			layer.set(rightP,"#");
			System.out.println(layer);
			leftP--;
			rightP++;
		}
		
	}
}
