package Random;

public class AddBinaryStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addBinaryBitWise(10, 119);
	}
	
	// How to add two numbers adding bit wise manipulation
	public static void addBinaryBitWise(int number1, int number2) {
        // Iterate till there is no carry
		int carryNumber = 1;
		int total = 0;
		// Keep doing while the carryNumber is Zero  
        while (carryNumber != 0) 
        { 
        	// Add the two numbers, without a carry using a XOR
            total = number1 ^ number2;
  
            carryNumber = number1 & number2;
            
            // Shift the carry number by one to add 
            // it to the total later on "<<"
            carryNumber = carryNumber << 1; 
            
            number1 = total;
            number2 = carryNumber;
        } 
        System.out.println(total);
	}

}
