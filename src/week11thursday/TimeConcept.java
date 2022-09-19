package week11thursday;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeConcept {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		//default data
		System.out.println(now);
		System.out.println(now.format(DateTimeFormatter.ofPattern("MMM dd yyyy hh mm:ss a")));
		
		//customised local date
		
		LocalDateTime time = LocalDateTime.of(1992, 9,23,10,11);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd yyyy hh mm:ss a");
		String strTime = time.format(formatter);
		System.out.println(strTime);

	}

}
