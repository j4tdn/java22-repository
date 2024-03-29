package util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateUtils {
	private static final String DMY_DEFAULT_PATTERN = "dd/MM/yyy HH:mm:ss";

	private DateUtils() {
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

	// calendar -> date -> string
	// calendar -> Calendar#getTime -> date -> DateFormat#format(date) -> string

	// string -> date -> calendar
	// string -> DateFormat#parse(string) -> date -> calendar

	public static Date toDate(String text, String pattern) throws Exception {
	    DateFormat df = new SimpleDateFormat(pattern);
	    Date date = df.parse(text);
	    return date;
	}

	public static Calendar toCalendar(String text, String pattern, Locale locale) throws Exception {
		// B1. text -> date
		Date date = toDate(text, pattern);

		// B2. date -> calendar
		Calendar c = Calendar.getInstance(locale);
		c.setTime(date);
		return c;
	}
	public static Calendar toCalendar(String text, String pattern) throws Exception {
		// B1. text -> date
		Date date = toDate(text, pattern);

		// B2. date -> calendar
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c;
	}

	
	public static Calendar getCalendarDmy(int dayOfMonth, int month, int year) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		c.set(Calendar.MONTH, month - 1);
		c.set(Calendar.YEAR, dayOfMonth);
		return c;
	}

	public static Calendar getCalendarHms(int hour, int minute, int second) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.HOUR_OF_DAY, hour);
		c.set(Calendar.MINUTE, minute);
		c.set(Calendar.SECOND, second);
		return c;
	}

	
	public static Calendar getCalendar(int dayOfMonth, int month, int year, int hour, int minute, int second) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		c.set(Calendar.MONTH, month - 1);
		c.set(Calendar.YEAR, year);
		c.set(Calendar.HOUR_OF_DAY, hour);
		c.set(Calendar.MINUTE, minute);
		c.set(Calendar.SECOND, second);
		return c;
	}
	
//Format
	/**
	 * 1. Format date with default pattern
	 */
	public static String format(Date date, Locale locale) {
		return format(date, DMY_DEFAULT_PATTERN, locale);
	}

	/**
	 * 2. Format date with given pattern
	 */
	public static String format(Date date, String pattern, Locale locale) {
		DateFormat df = new SimpleDateFormat(pattern, locale);
		return df.format(date);
	}

	
	
	/**
	 * 3. Format calendar with default pattern
	 */
	public static String format(Calendar c, Locale locale) {
		return format(c, DMY_DEFAULT_PATTERN, locale);
	}

	/**
	 * 4. Format calendar with given pattern
	 */
	public static String format(Calendar c, String pattern, Locale locale) {
		Date convertedDate = c.getTime();
		return format(convertedDate, pattern, locale);
	}

}
