package util;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateUtils {
	
	private static final String DMY_DEFAULT_PATTERN = "dd/MM/yyyy";
	
	private static String[] WEEKDAYS = {"Chủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ Năm", "Thứ Sáu ", "Thứ Bảy "};

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
		Calendar target = Calendar.getInstance();
		target.setTimeInMillis(source.getTimeInMillis());
		return target;
	}
	
	//calendar -> date -> string
	//calendar -> #getTime ->date -> df.format() -> string 
	//string -> date -> calendar
	
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
	
	public static Calendar toCalendar(String text, String pattern ) {
		//B1. text -> date
		Date date = toDate(text, pattern);
		
		//B2. date -> calendar
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c;
	}
	
	public static Calendar getCalendarDmy(int dayOfMonth, int month, int year) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		c.set(Calendar.MONTH, month - 1);
		
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
		System.out.println("default locale: " + Locale.getDefault());
		DateFormat df = new SimpleDateFormat(pattern, new Locale("vi", "VN"));
		return df.format(date);
	}
	
	
	public static String format(Calendar c, Locale locale) {
		return format(c, DMY_DEFAULT_PATTERN, locale);
	}
	
	//Format date with given pattern 
	
	public static String format(Calendar c, String pattern, Locale locale) {
//		DateFormat df = new SimpleDateFormat(DMY_DEFAULT_PATTERN);
//		return df.format(date);
		Date convertedDate = c.getTime();
		return format(convertedDate, pattern, locale);
	}
	
	//Format calendar with given pattern
	
	public static String format(Date date, Locale locale) {
//		Date convertedDate = c.getTime();
		return format(date, DMY_DEFAULT_PATTERN, locale);
	}
	
	public static String format(Calendar c, String pattern, TimeZone timezone) {
		Date convertedDate = c.getTime();
		
		DateFormat df= new SimpleDateFormat(pattern);
		df.setTimeZone(timezone);
		
		return df.format(convertedDate);
	}
	

}
