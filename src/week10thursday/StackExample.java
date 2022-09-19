package week10thursday;

import java.util.Stack;

import week4Tuesday.forLooprecap;

public class StackExample {

	public static void main(String[] args) {
		// collection type which works in last - in - first - out data structure.
		//stack is the subclass of vector
		//stack is holding all the rules and methods that vector has
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
