package datetime;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Demo4DateTime {

	public static void main(String[] args) {


		OffsetDateTime offsetDateTime = OffsetDateTime.now();
		System.out.println(offsetDateTime.toString()+ "\n");              //current zone date and time
		 
		
		offsetDateTime = OffsetDateTime.now(ZoneId.of("+05:30"));
		System.out.println(offsetDateTime.toString()+ "\n");              // current specific zone pass 
		 
		offsetDateTime = OffsetDateTime.now(ZoneId.of("-06:30"));
		System.out.println(offsetDateTime.toString()+ "\n");              // Another specific zone pass
		 
		ZonedDateTime zonedDateTime = 
		                ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println(zonedDateTime.toString()+ "\n");               //Another specific zone name pass

	}

}
