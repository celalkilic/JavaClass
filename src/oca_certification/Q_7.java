package oca_certification;

import java.time.Year;

public class Q_7 {

	public static void main(String[] args) {
		// Create a program which finds out if a year is leap or not. 
		
		// 2020 : isLeap
		// 2021 : isNotLeap
				
		/*
		* Leap Years are any year that can be exactly divided by 4 (such as 2016, 2020, 2024, etc)
		 not	except if it can be exactly divided by 100, then it isn’t (such as 2100, 2200, etc)
		 yes	except if it can be exactly divided by 400, then it is (such as 2000, 2400)
		*/
				
		int year = 2020;
		if ((year % 4==0) || (year %400==0)) {
			System.out.println("Leap Year");
		}
		else if (year %100==0) {
			System.out.println("Not a leap year");
		}
		else {
			System.out.println("Not a leap year");
		}
				
		// Finding if a year is leap with time.Year concept
		Year year2 = Year.of(year);
		System.out.println(year2.isLeap());

	}

}
