package week8wednsday;

import java.util.Scanner;

public class Question2test {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the day");
		int day = scanner.nextInt();
		
		System.out.println("Enter the month");
		int month = scanner.nextInt();
		
		System.out.println("Enter the year");
		int year = scanner.nextInt();
		
		Date date = new Date(12, 12, 2020);
		date.DisplayDate();
		
		Date date2 = new Date();
		date2.setDay(day);
		date2.setMonth(month);
		date2.setYear(year);
		
		date2.DisplayDate();

	}

}
