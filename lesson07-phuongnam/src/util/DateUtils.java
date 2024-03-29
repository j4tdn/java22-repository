package util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Date;

public class DateUtils {

	private static final String DMY_DEFAULT_PATTERN = "dd/MM/yyyy";

	private DateUtils() {

	}

	public static Calendar clone(Calendar source) {
		Calendar target = Calendar.getInstance();
		target.setTimeInMillis(source.getTimeInMillis());
		return target;
	}

	public static Calendar toCalendar(Date date, Locale locale) {

		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c;

	}

	public static String format(Calendar c, Locale locale) {
		return format(c, DMY_DEFAULT_PATTERN, locale);
	}

	public static String format(Calendar c, String pattern, Locale locale) {
		Date convertedDate = c.getTime();
		return format(convertedDate, pattern, locale);

	}

	public static String format(Date date, String pattern, Locale locale) {

		DateFormat df = new SimpleDateFormat(pattern, locale);
		return df.format(date);
	}
}
