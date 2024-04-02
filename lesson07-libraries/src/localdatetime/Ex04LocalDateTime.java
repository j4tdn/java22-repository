package localdatetime;

import static util.DateUtils.opt;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex04LocalDateTime {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		LocalDateTime startDateTime = LocalDateTime.parse("22/03/2024 21:00:10", dtf);
		LocalDateTime endDateTime = LocalDateTime.now();

		if (startDateTime.isAfter(endDateTime)) {
			throw new IllegalArgumentException("StartTime cannot greater than end endTime !!!");
		}

		LocalDate startDate = startDateTime.toLocalDate();
		LocalDate endDate = endDateTime.toLocalDate();
		LocalTime startTime = startDateTime.toLocalTime();
		LocalTime endTime = endDateTime.toLocalTime();

		Period period = Period.between(startDate, endDate);
		Duration duration = Duration.between(startDateTime, endDateTime);
		
		if(duration.isNegative()) {
			duration.plusDays(1);
			period.minusDays(1);
		}

		System.out.println(" Khoảng thời gian: " + format(duration) + format(period));
	}
	private static String format(Period period) {
		return String.join(" ", 
				opt(period.getYears(), "year"), 
				opt(period.getMonths(), "month"),
				opt(period.getDays(), "day"));
	}
	private static String format(Duration duration) {
		return String.join(" ", 
				opt(duration.toHoursPart(), "hour"), 
				opt(duration.toMinutesPart(), "minute"),
				opt(duration.toSecondsPart(), "second"));
	}
}
