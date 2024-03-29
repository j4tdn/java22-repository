package Ex03;
import Ultils.DateUtils;
import common.WKD_EGVN;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class CheckTime {
	public static void main(String[] args) {
		lastDayOfThisMonth();
		currentDate();
		showTime();
	}

	public static void showTime() {
		Calendar currentDate = Calendar.getInstance();
		currentDate.add(Calendar.DAY_OF_MONTH, 20);
		int dayOfMonth = currentDate.get(Calendar.DAY_OF_MONTH);
		int month = currentDate.get(Calendar.MONTH) + 1; 
		int year = currentDate.get(Calendar.YEAR);
		int dayOfWeek = currentDate.get(Calendar.DAY_OF_WEEK);
		WKD_EGVN day = WKD_EGVN.values()[dayOfWeek - 1];
		System.out.println("20 ngày sau: " + day.getVnText() + ", ngày " + dayOfMonth + "/" + month + "/" + year);
	}

	public static void lastDayOfThisMonth() {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; 
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		int lastDay = cal.get(Calendar.DAY_OF_MONTH); 
		System.out.println("2. Ngày cuối của tháng hiện tại, tức tháng " + month + ": " + lastDay);
	}

	public static void currentDate() {
		Calendar cal = Calendar.getInstance();
		int date = cal.get(Calendar.WEEK_OF_YEAR);
		System.out.println("4. Ngày hiện tại thuộc tuần thứ: " + date);
	}
}
