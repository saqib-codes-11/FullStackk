package datetime;



import java.time.Duration;
import java.time.LocalTime;

 class UseDuration {

    public LocalTime modifyDates(LocalTime localTime, Duration duration) {
        return localTime.plus(duration);
    }

    public Duration getDifferenceBetweenDates(LocalTime localTime1, LocalTime localTime2) {
        return Duration.between(localTime1, localTime2);
    }
}


public class Demo6DateTime
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
