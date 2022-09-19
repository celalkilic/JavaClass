package java_coding_interview;

import java.util.ArrayList;
import java.util.Arrays;

public class Question2 {

	public static void main(String[] args) {
		int a = 9;
		if (a%2==0) {
			System.out.println("a is an even number");
		}else {
			System.out.println("a is an odd number");
		}
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		// print out odd numbers with using numbers.foreach()
		numbers.forEach(num -> {if(num%2==0) {System.out.println(num);}});
		numbers.forEach(num2 -> {if(!((num2%2)==0)) {System.out.println(num2);}});
	}

}
