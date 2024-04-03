package util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateUtils {
	private static final String DMY_DEFAULT_PATTERN = "dd/MM/yyyy";
	private DateUtils() {
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
	public static Calendar clone(Calendar source) {
		Calendar target = Calendar.getInstance();
		target.setTimeInMillis(source.getTimeInMillis());
		return target;
	}
	
	public static Calendar clone(Calendar source, Locale locale) {
		Calendar target = Calendar.getInstance(locale);
		target.setTimeInMillis(source.getTimeInMillis());
		return target;
	}
	public static Date toDate(String text, String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			date = df.parse(text);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	public static Calendar toCalendar(String text, String pattern, Locale locale) {

		Date date = toDate(text, pattern);
		
		Calendar c = Calendar.getInstance(locale);
		c.setTime(date);
		return c;
	}
	public static Calendar toCalendar(String text, String pattern) {
		Date date = toDate(text, pattern);
		
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c;
	}
	public static Calendar getCalendar(int dayOfMonth, int month, int year, int hour, int minute, int second) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		c.set(Calendar.MONTH, month - 1);
		c.set(Calendar.YEAR, dayOfMonth);
		c.set(Calendar.HOUR_OF_DAY, hour);
		c.set(Calendar.MINUTE, minute);
		c.set(Calendar.SECOND, second);
		return c;
	}
	public static String format(Date date, String pattern, Locale locale) {
		DateFormat df = new SimpleDateFormat(pattern, locale);
		return df.format(date);
	}
	public static String format(Calendar c, Locale locale) {
		return format(c, DMY_DEFAULT_PATTERN, locale);
	}
	public static String format(Date date, Locale locale) {
		return format(date, DMY_DEFAULT_PATTERN, locale);
	}
	public static String format(Calendar c, String pattern, Locale locale) {
		Date convertedDate = c.getTime();
		return format(convertedDate, pattern, locale);
	}

}
