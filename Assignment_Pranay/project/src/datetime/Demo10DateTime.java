package datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Demo10DateTime {

	public static void main(String[] args) {
		
		 
		DayOfWeek day = DayOfWeek.FRIDAY;
		
		System.out.println(day.getValue());   //5
		
		System.out.println(DayOfWeek.of(2));   //TUESDAY 
		 
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate.with(DayOfWeek.MONDAY)); 
		
	}

}
