package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	public static Date parseDateString(String dateString) {
		try {
			return dateFormat.parse(dateString);
		} catch (ParseException e) {
			System.out.println("Định dạng ngày không hợp lệ. Sử dụng định dạng yyyy-MM-dd.");
			return null;
		}
	}

	public static Calendar dateToCalendar(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar;
	}

}
