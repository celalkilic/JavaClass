package week11thursday;

import java.time.Month;
import java.time.Year;
import java.time.YearMonth;

public class YearConcept {

	public static void main(String[] args) {
		Year year = Year.of(1992);
		Year year2 = Year.of(1993);
		
		//default year
		System.out.println(year);
		
		//check if year is leap year
		System.out.println(year.isLeap());
		
		//check before after
		System.out.println(year.isAfter(year2));
		System.out.println(year.isBefore(year2));
		
		YearMonth date = YearMonth.now();
		System.out.println(date.getMonthValue());
		YearMonth date2 = YearMonth.of(1990, Month.FEBRUARY);
		System.out.printf("%s : %d%n", date2, date2.lengthOfMonth());

	}

}
