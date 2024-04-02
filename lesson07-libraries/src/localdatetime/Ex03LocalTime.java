package localdatetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import static util.DateUtils.*;;
public class Ex03LocalTime {

	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		LocalTime startTime = LocalTime.of(14, 22, 20);
		
		LocalTime endTime = LocalTime.parse("17:42:40", dtf);
		
		System.out.println("startTime: " + startTime);
		System.out.println("endTime: " + endTime);
		
		Duration duration = Duration.between(startTime, endTime);
		System.out.println("duration: " + duration);
		
		String format = String.join(" ", 
				opt(duration.toHoursPart(), "hour"),
				opt(duration.toMinutesPart(), "minute"),
				opt(duration.toSecondsPart(), "second"));
		
		System.out.println("Khoang thoi gian:" + format);
	}
}
