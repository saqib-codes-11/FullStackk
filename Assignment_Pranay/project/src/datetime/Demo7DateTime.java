package datetime;


import java.time.Duration;
import java.time.Instant;

public class Demo7DateTime {

	public static void main(String[] args) {
		
		Duration duration = Duration.ofMillis(5000);
		System.out.println(duration.toString());     //PT5S  == 5 sec
		 
		duration = Duration.ofSeconds(60);
		System.out.println(duration.toString());     //PT1M == 1 minutes
		
		duration = Duration.ofMinutes(10);
		System.out.println(duration.toString());     //PT10M == 10 minutes
		 
		duration = Duration.ofHours(2);
		System.out.println(duration.toString());     //PT2H  == 2 hours
		 
		duration = Duration.between(Instant.now(), Instant.now().plus(Duration.ofMinutes(10)));
		System.out.println(duration.toString());  //PT10M  
		
		// Here "PT" is the standard ISO-8601 notation for durations / periods.
		
	}

}
