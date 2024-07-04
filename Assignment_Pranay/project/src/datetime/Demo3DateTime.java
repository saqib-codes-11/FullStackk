package datetime;

import java.time.LocalDateTime;

//LocalDate&Time
public class Demo3DateTime {

	public static void main(String[] args) {
		
		LocalDateTime localDateTime = LocalDateTime.now(); 
		System.out.println(localDateTime.toString());      // current date and time
		System.out.println(localDateTime.getDayOfMonth()); // current date
		System.out.println(localDateTime.getHour());       // current hours
		System.out.println(localDateTime.getNano());       // current nano secound
	}
	
}
