package localdatetime;

import static Utils.DateUtils.opt;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex04LocalDateTime {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime startDayTime = LocalDateTime.parse("22/03/2024 15:00:10");
		LocalDateTime endDayTime = LocalDateTime.now();
		System.out.println("startDayTime: " + dtf.format(startDayTime));
		System.out.println("endDayTime: " + dtf.format(endDayTime));
		
		if (startDayTime.isAfter(endDayTime)) {
			throw new IllegalArgumentException("StartTime cannot greater than EndTime");
		}
		System.out.println("\n===============\n");
		// preview
		// Hiệu của LocalDate -> Period
		// Hiệu của LocalTime -> Duration
				
		// Hiệu của LocalDateTime -> KHÔNG CÓ(vận dụng Period, Duration để làm)
		// LocalDateTime = LocalDate + LocalTime
				
		// valid data
		
		// xử lý cho ngày tháng năm
		LocalDate startDate = startDayTime.toLocalDate();
		LocalDate endDate = endDayTime.toLocalDate();
		Period period =Period.between(startDate, endDate);
		
		// xử lý cho giờ phút giây
		LocalTime startTime = startDayTime.toLocalTime();
		LocalTime endTime = endDayTime.toLocalTime();
		Duration duration = Duration.between(startTime, endTime);
		
		// startDate ko thể lớn hơn endDay -> dữ liệu sai
		// startTime có thể lớn hơn endTime -> duration bị âm -> mượn 1 day | 24h từ period 
		if(duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		System.out.println("Khoảng thời gian -->" + format(period) + " " + format(duration));
	}
	private static String format(Period period) {
		return String.join(" ", opt(period.getYears() , "year"), 
				opt(period.getMonths(), "month"), opt(period.getDays(), "day"));
	}
	private static String format(Duration duration) {
		return String.join(" ", opt(duration.toHoursPart() , "hour"), 
				opt(duration.toMinutesPart(), "minute"), opt(duration.toSecondsPart(), "second"));
	}

}
