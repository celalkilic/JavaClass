package week12monday;

import java.sql.Connection;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling_3 {

	public static void main(String[] args) {
		
		Object number = null;

		try {
			System.out.println(number.toString());
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		int[] intArr = { 0, 2, 4 };

		try {
			System.out.println(intArr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter an integer: ");
			int num = scanner.nextInt();
			System.out.println(num);

		} catch (InputMismatchException e) {
			System.out.println("Incorrect input. Enter a number");
		} finally {
			scanner.close();
		}

	}

}