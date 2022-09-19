package week1Thursday;

import java.util.Scanner;

public class exercises {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter number1:  " );
		int number1 = scanner.nextInt();
		System.out.println("please enter number2: ");
		int number2 = scanner.nextInt();
		System.out.println("please enter operator: ");
		char character = scanner.next().charAt(0);
		if (character =='+') {
			System.out.println("your result is : "+ (number1+number2));
			
		}else if (character =='-') {
			System.out.println("your result is : "+ (number1-number2));
			
		}else if (character =='*') {
			System.out.println("your result is : "+ (number1-number2));
		}else if (character =='/') {
			System.out.println("your result is : "+ (double)(number1/number2));
		}else {
			System.out.println("invalid character ");
		}
		
		
	}
	
		
}
