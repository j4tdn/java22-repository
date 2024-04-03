package localdatetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import static Utils.DateUtils.*;

public class Ex03LocalTime {
	public static void main(String[] args) {
		// 14:20;20
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		LocalTime startTime = LocalTime.of(14, 22, 20);
		LocalTime endTime = LocalTime.parse("17:42:40");
		System.out.println("startTime: " + startTime);
		System.out.println("endTime: " + endTime);
		
		Duration duration = Duration.between(startTime, endTime);
		System.out.println("duration: " + duration);
		
		String format = String.join(" ", opt(duration.toHoursPart() , "hour"), 
				opt(duration.toMinutesPart(), "minute"), opt(duration.toSecondsPart(), "second"));
		System.out.println("Khoảng thời gian: " + format);
	}

}
