package datetime;


import java.time.Duration;
import java.time.Instant;

public class Demo9DateTime {

	public static void main(String[] args) {
		
		Instant instant = Instant.now();
		
		System.out.println(instant.toString());        //Current date and time
		
		System.out.println(instant.plus(Duration.ofMillis(5000)).toString());   //Adding 5 second to current date and time
		System.out.println(instant.minus(Duration.ofMillis(5000)).toString());  //reducing minus 5 second from current date and time
		System.out.println(instant.minusSeconds(10).toString());  // reducing minus 10 second from current date and time

	}

}
