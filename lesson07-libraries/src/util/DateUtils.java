package util;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class DateUtils {
	private static final String DMY_DEFAULT_PATTERN = "dd/MM/yyyy";
	private DateUtils() {

	}
	/*
	 * Format date with given pattern
	 */
	public static String format(Date date, String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		return df.format(date);
	}
	/*
	 * Format calendar with default pattern
	 */
	public static String format(Calendar c) {
		return format(c, DMY_DEFAULT_PATTERN);
	}
	public static String format (Calendar c, String pattern) {
		Date convertedDate = c.getTime();
		return format(convertedDate, pattern);  
	}
	public static Date toDate(String text, String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		Date date=null;
		try {
			date=df.parse(text);
			
		} catch(ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	public static Calendar getCalendarDmy(int dayOfMont, int month, int year) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, dayOfMont);
		c.set(Calendar.MONTH, month-1);
		c.set(Calendar.YEAR, dayOfMont);
		return c;
	}
	public static Calendar getCalendarHms(int hour, int minute, int second) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.HOUR_OF_DAY, hour);
		c.set(Calendar.MINUTE, minute);
		c.set(Calendar.SECOND, second);
		return c;
	}
}
