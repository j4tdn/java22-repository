package util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateUtil {
	private static final String defaultDMY ="dd/MM/yyyy";
	private static final String defaultDMYHMS ="dd/MM/yyyy HH:mm:ss";
	
	private DateUtil() {
		
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
	
	public static Date toDate(String text, String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		Date date =null;
		try {
			date = df.parse(text);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	public static Calendar toCalendar(String text, String pattern , Locale locale) {
		Date date =toDate(text,pattern);
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c;
	}
		
	public static String format(Calendar c, Locale locale , String zone) {
		Date convertedDate = c.getTime();
		return format(convertedDate,defaultDMYHMS, locale, zone);
	}
	
	public static String format(Date date,String pattern, Locale locale, String zone) {
		DateFormat df = new SimpleDateFormat(pattern, locale);
		df.setTimeZone(TimeZone.getTimeZone(zone));
		return df.format(date);
	}
	
	
}
