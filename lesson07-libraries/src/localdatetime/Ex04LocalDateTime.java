package localdatetime;

import static utils.DateUtils.opt;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex04LocalDateTime {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		LocalDateTime startDateTime = LocalDateTime.parse("22/03/2024 19:00:10", dtf);
		LocalDateTime endDateTime = LocalDateTime.now();

		System.out.println("startDateTime: " + dtf.format(startDateTime));
		System.out.println("endDateTime: " + dtf.format(endDateTime));
		if (startDateTime.isAfter(endDateTime)) {
			throw new IllegalArgumentException("StartTime cannot greater than EndTime");

		}
		System.out.println("===================================");
		// valid data
		// Hiệu của LocalDate -> Period
		// Hiệu của LocalTime -> Duration

		LocalDate startDate = startDateTime.toLocalDate();
		LocalDate endDate = endDateTime.toLocalDate();

		// Tìm hiệu giữa 2 mốc thời gian (LocalDate)
		Period period = Period.between(startDate, endDate);
		System.out.println("Period:" + format(period));
		
		
		LocalTime startTime = startDateTime.toLocalTime();
		LocalTime endTime = endDateTime.toLocalTime();

		// Tìm khoảng tgian giữa 2 mốc
		Duration duration = Duration.between(startDateTime, endDateTime);
		System.out.println("Duration: " + format(duration));
		
		if(duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		} 
		System.out.println("Khoảng thời gian ->" + format(period) + ""+ format(duration));

	}

	//design pattern: singleton,builder
	//format, math library
	private static String format(Period period) {
		return String.join("", opt(period.getYears(), "year"),
				opt(period.getMonths(), "month"),
				opt(period.getDays(), "day"));
	}

	private static String format(Duration duration) {
		return String.join("", opt(duration.toHoursPart(), "hour"), 
				opt(duration.toMinutesPart(), "minute"),
				opt(duration.toSecondsPart(), "second"));

	}

}
