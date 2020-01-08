package StephenGrider;

import java.util.ArrayList;

public class pyramid {
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
