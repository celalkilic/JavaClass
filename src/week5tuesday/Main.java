package week5tuesday;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("What is your birth year : ");
		try {
			int birthyear = scanner.nextInt();
			System.out.println("Your age is : " + (2020 - birthyear));
		} catch (InputMismatchException e) {
			System.out.println("Please enter a number");
		}

	}

}
