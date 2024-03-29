package Ultils;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;

public class DateUtils {
private static final String DMY_DEFAULT_PATTERN = "dd/MM/yyyy";
	
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
	public static String format(Calendar c, String pattern, Locale locale) {
        DateFormat df = new SimpleDateFormat(pattern, locale);
        return df.format(c.getTime());
    }
	public static String getCurrentDateTimeInZone(String zoneId, String pattern) {
        LocalDateTime currentDateTime = LocalDateTime.now(ZoneId.of(zoneId));
        return currentDateTime.format(DateTimeFormatter.ofPattern(pattern));
    }

	public static Date toDate(String text, String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			date = (Date) df.parse(text);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	public static Calendar toCalendar(String text, String pattern, Locale locale) {
		// B1. text -> date
		Date date = toDate(text, pattern);
		
		// B2. date -> calendar
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
		c.set(Calendar.YEAR, dayOfMonth);
		c.set(Calendar.HOUR_OF_DAY, hour);
		c.set(Calendar.MINUTE, minute);
		c.set(Calendar.SECOND, second);
		return c;
	}
	

	public static String format(Date date, Locale locale) {
		return format(date, DMY_DEFAULT_PATTERN, locale);
	}
	

	public static String format(Date date, String pattern, Locale locale) {

		DateFormat df = new SimpleDateFormat(pattern, locale);
		return df.format(date);
	}

	public static String format(Calendar c, Locale locale) {
		return format(c, DMY_DEFAULT_PATTERN, locale);
	}

//	public static String format(Calendar c, String pattern, Locale locale) {
//		Date convertedDate = (Date) c.getTime();
//		return format(convertedDate, pattern, locale);
//	}
}