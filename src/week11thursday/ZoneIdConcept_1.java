package week11thursday;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIdConcept_1 {

	public static void main(String[] args) {
		Instant timeStamp = Instant.now();
		System.out.println(timeStamp);
		
		
		//timestamp in zone : America/los_angeles
		ZonedDateTime zonedDateTime = timeStamp.atZone(ZoneId.of("America/New_York"));
		System.out.println("losangeles time : "+ zonedDateTime);
	}

}
