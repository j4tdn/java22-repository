package localdatetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static utils.DateUtils.*;

public class Ex03LocalTime {
	
	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		
		LocalTime startTime = LocalTime.of(14, 20, 20); 
		LocalTime endTime = LocalTime.parse("17:42:40", dtf);
		
		System.out.println("startTime: " + startTime);
		System.out.println("endtime: "+endTime);
		
		//Tìm khoảng tgian giữa 2 mốc
		Duration duration = Duration.between(startTime, endTime);
		System.out.println("Duration: " + duration);
		
		String format = String.join("", 
				opt(duration.toHoursPart(), "hour"),
				opt(duration.toMinutesPart(), "minute"),
				opt(duration.toSecondsPart() , "second"));

		System.out.println("Khoảng thời gian: " + format);
		
				
	}

}
