package week9Thursday;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// Collection type which works in last-in-first-out data structure
		//stack is subclass of vector
		//stack is holding all the rules and methods of vector 
		//if there is a condition which developer needed the last closed data more frequently, stack is the best option
		
		Stack<String> stack = new Stack<String>();
		stack.push("silicone");
		stack.push("labs");
		stack.push("school");
		stack.pop();
		stack.pop();
		for (String string : stack) {
			System.out.println(string);
		}

	}

}
