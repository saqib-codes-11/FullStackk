package datetime;

import java.time.LocalDate;


//LocalDate
public class Demo1DateTime {
	
	public static void main (String [] args) {
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate.toString());                // current day
		System.out.println(localDate.getDayOfWeek().toString()); // current week day
		System.out.println(localDate.getDayOfMonth());           // current date 
		System.out.println(localDate.getDayOfYear());            // from new year to till date number of days
		System.out.println(localDate.isLeapYear());              //false
		System.out.println(localDate.plusDays(12).toString());   //current date + 12 days
		
	}

}
