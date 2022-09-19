package week11thursday;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateConcept_2 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(1984, 01, 01);
		System.out.println(date);
		
		String dateString = date.format(DateTimeFormatter.ofPattern("MMMM dd yyyy Q E"));
		System.out.println(dateString);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd yyyy Q E");
		System.out.println(date.format(formatter));

	}

}
