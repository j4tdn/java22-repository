package util;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class DateUtilsJava8 {
	Locale locale = new Locale("en", "US");

	private DateUtilsJava8() {

	}

	public static LocalDateTime toLocalDateTime(String text, String pattern, Locale locale) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss", locale);
		LocalDateTime dateTime = null;
		try {
			dateTime = LocalDateTime.parse(text, dtf);
		} catch (DateTimeParseException | NullPointerException e) {
			System.out.println("Nhập sai định dạng, mời nhập lại!!");
		}
		return dateTime;
	}

	public static LocalDate toLocalDate(String text, String pattern, Locale locale) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy", locale);
		LocalDate date = null;
		try {
			date = LocalDate.parse(text, dtf);

		} catch (DateTimeParseException | NullPointerException e) {
			System.out.println("Phải nhập đúng định dạng dd/MM/yyyy");
		}

		return date;
	}

	public static boolean isBeforeNow(LocalDateTime dateTime) {
		if (dateTime == null) {
			throw new IllegalArgumentException("Ngày giờ nhập không thể là null");
		}
		LocalDateTime now = LocalDateTime.now();
		if (dateTime.isBefore(now)) {
			return true;
		} else {
			throw new IllegalArgumentException("Thời gian nhập phải trước thời điểm hiện tại");
		}
	}

	public static boolean isBeforeNow(LocalDate date) {
		if (date == null) {
			throw new IllegalArgumentException("Ngày nhập không thể là null");
		}
		LocalDate now = LocalDate.now();
		if (date.isBefore(now)) {
			return true;
		} else {
			throw new IllegalArgumentException("Ngày nhập phải trước ngày hiện tại");
		}
	}

	public static String opt(long val, String unit) {
		if (val < 0) {
			throw new IllegalArgumentException("Thời gian không thể là số âm");
		}
		if (val == 0) {
			return "";
		}
		return val + " " + unit + (val > 1 ? "s" : "");
	}

	public static Period calculatePeriod(LocalDateTime startDateTime, LocalDateTime endDateTime) {
		LocalDate startDate = startDateTime.toLocalDate();
		LocalDate endDate = endDateTime.toLocalDate();
		return Period.between(startDate, endDate);
	}

	public static Duration calculateDuration(LocalDateTime startDateTime, LocalDateTime endDateTime) {
		LocalTime startTime = startDateTime.toLocalTime();
		LocalTime endTime = endDateTime.toLocalTime();
		return Duration.between(startTime, endTime);
	}
}
