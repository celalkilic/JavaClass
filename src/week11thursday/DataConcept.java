package week11thursday;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataConcept {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		//current date
		System.out.println("Today's Date : "+today);
		//tomorrow
		System.out.println("Tomorrow date's : " + today.plusDays(1) );
		//yesterday
		System.out.println("yesterday date's : " + today.minusDays(1));
		//the length of the year
		System.out.println("the length of the year : "+today.minusYears(1).lengthOfYear());
		//create customize date
		LocalDate date = LocalDate.of(1994, 9, 23);
		System.out.println(date);
		System.out.println(today.format(DateTimeFormatter.ofPattern("MMMM dd yyyy Q")));
		

	}

}
