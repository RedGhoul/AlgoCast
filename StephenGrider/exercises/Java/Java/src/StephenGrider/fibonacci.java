package StephenGrider;

import java.util.ArrayList;
import java.util.HashMap;

public class fibonacci {

	public static void main(String[] args) {
		System.out.println(recursive_Fibonacci_Memo(29, null));
	}
	
	public static Integer recursive_Fibonacci(Integer number) {
		if(number == 0) {
			return 0;
		}else if(number == 1) {
			return 1;
		}
		
		return recursive_Fibonacci(number - 1) + 
			   recursive_Fibonacci(number - 2);
	}
	
	public static Integer recursive_Fibonacci_Memo(Integer number, HashMap<Integer,Integer> memory) {
		if(memory == null) {
			memory = new HashMap<Integer,Integer>();
		}
		
		if(memory.containsKey(number)) {
			return memory.get(number);
		}
		else if(number == 0) {
			return 0;
		}else if(number == 1) {
			return 1;
		}
		
		Integer answer = recursive_Fibonacci_Memo(number - 1, memory) + 
				recursive_Fibonacci_Memo(number - 2,memory);
		
		memory.put(number, answer);
		
		System.out.println(answer);
		
		return answer;
	}
}
