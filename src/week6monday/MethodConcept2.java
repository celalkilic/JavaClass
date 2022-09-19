package week6monday;

import java.util.Scanner;

public class MethodConcept2 {
	public static void printTime(int hour, int minute) {
		System.out.print(hour);
		System.out.print(":");
		System.out.print(minute);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int hour = scanner.nextInt();
		int minute = scanner.nextInt();
		
		printTime(hour, minute);

	}

}
