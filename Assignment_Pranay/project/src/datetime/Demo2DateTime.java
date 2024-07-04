package datetime;

import java.time.LocalTime;


//LocalTime
public class Demo2DateTime {

	public static void main(String[] args) {

		 LocalTime localTime = LocalTime.now();     
		 
	//	LocalTime localTime = LocalTime.of(12, 20);  // anotherway also to create localtime object
		System.out.println(localTime.toString());    //12:20
		System.out.println(localTime.getHour());     //12
		System.out.println(localTime.getMinute());   //20
		System.out.println(localTime.getSecond());   //0
		System.out.println(localTime.MIDNIGHT);      //00:00
		System.out.println(localTime.NOON);          //12:00
		

	}

}
