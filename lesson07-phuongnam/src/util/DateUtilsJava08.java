package util;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class DateUtilsJava08 {

	Locale locale = new Locale("en", "US");

	private DateUtilsJava08() {
	}

	public static LocalDateTime toLocalDateTime(String text, String pattern, Locale locale) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss", locale);
		LocalDateTime dateTime = null;
		try {
			dateTime = LocalDateTime.parse(text, dtf);
		} catch (DateTimeParseException | NullPointerException e) {
			System.out.println("Nhập sai định dạng , mời nhập lại !");
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

	public static boolean isBeforeNow(LocalDateTime datetime) {

		LocalDateTime now = LocalDateTime.now();
		try {
			if (datetime.isBefore(now)) {
				return true;
			} else {
				System.out.println("Thời gian bắt đầu hẹn hò bị quá thực tại !");
				return false;
			}
		} catch (NullPointerException e) {
			System.out.println("Phải nhập đúng định dạng dd/MM/yyyy HH:mm:ss !");
		}
		return false;

	}

	public static boolean isBeforeNow(LocalDate datetime) {
		LocalDate now = LocalDate.now();
		try {
			if (datetime.isBefore(now)) {
				return true;
			} else {
				System.out.println("Ngày sinh bị vượt quá thời gian hiện tại !");
				return false;
			}
		} catch (NullPointerException e) {
			System.out.println("Mời nhập lại ngày sinh ");
		}
		return false;
	}

	public static String opt(long val, String unit) {
		if (val < 0) {
			throw new IllegalArgumentException("Date Time cannot be negative");
		}
		if (val == 0) {
			return "";
		}
		return val + " " + unit + optPlural(val);
	}

	public static String optPlural(long val) {
		return val > 1 ? "s" : "";
	}

	public static Period calculatePeriod(LocalDateTime startDatingTime, LocalDateTime breakUpTime) {

		LocalDate startDate = startDatingTime.toLocalDate();
		LocalDate endDate = breakUpTime.toLocalDate();
		Period period = Period.between(startDate, endDate);

		return period;
	}

	public static Duration calculateDuration(LocalDateTime startDatingTime, LocalDateTime breakUpTime) {
		LocalTime startTime = startDatingTime.toLocalTime();
		LocalTime endTime = breakUpTime.toLocalTime();
		Duration duration = Duration.between(startTime, endTime);
		return duration;
	}
}
