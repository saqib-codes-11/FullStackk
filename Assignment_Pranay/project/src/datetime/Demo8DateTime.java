package datetime;


import java.time.LocalDate;
import java.time.Period;

public class Demo8DateTime {

	public static void main(String[] args) {
		
		Period period = Period.ofDays(6);
		System.out.println(period.toString());    //P6D
		 
		period = Period.ofMonths(6);
		System.out.println(period.toString());    //P6M
		
		period = Period.between(LocalDate.now(), 
	            LocalDate.now().plusDays(32)); 
		
	// current date (plus)+ no.of days which we pass, that will display month and days, 
		//  difference to be fill from current date.  
	
		System.out.println(period.toString());   //
		   
		}
	}


