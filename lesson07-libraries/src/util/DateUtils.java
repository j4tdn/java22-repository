package util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateUtils {
	private static final String DMY_DEFAULT_PATTERN = "dd/MM/yyyy";

	public DateUtils() {
		// TODO Auto-generated constructor stub
	}

	// từ calendar -> date -> string
	// => từ string -> date -> calendar
	public static Calendar toCalendar (String text, String pattern) {
		//b1: text -> date
		Date date = toDate(text, pattern);
		
		//b2: date => calendar
		Calendar c =  Calendar.getInstance();
		c.setTime(date);
		return c;
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
	
	
	public static Calendar getCalendarDmy(int dayOfMonth, int month,int year) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.MONTH, month-1);
		c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		c.set(Calendar.YEAR, year);
		return c;
	}
	public static Calendar getCalendarHms(int hour, int minute, int second) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.HOUR_OF_DAY, hour);
		c.set(Calendar.MINUTE, minute);
		c.set(Calendar.SECOND, second);
		return c;
	}
	public static Calendar getCalendar(int dayOfMonth, int month,int year,int hour, int minute, int second) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.MONTH, month-1);
		c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		c.set(Calendar.YEAR, year);
		c.set(Calendar.HOUR_OF_DAY, hour);
		c.set(Calendar.MINUTE, minute);
		c.set(Calendar.SECOND, second);
		return c;
	}

	public static String format(Date date) {
		return format(date, DMY_DEFAULT_PATTERN);
	}

	public static String format(Calendar c) {
		return format(c, DMY_DEFAULT_PATTERN);
	}

	/*
	 * 
	 */
	public static String format(Date date, String pattern) {
//		 DateFormat df = new SimpleDateFormat(pattern);
//		 DateFormat df = new SimpleDateFormat(pattern, Locale.KOREA);
		DateFormat df = new SimpleDateFormat(pattern, new Locale("vi", "VN"));
		return df.format(date);
	}

	public static String format(Calendar c, String pattern) {
		Date convertedDate = c.getTime();
		return format(convertedDate, pattern);
	}
}
