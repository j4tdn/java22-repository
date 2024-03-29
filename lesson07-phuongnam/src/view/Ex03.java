package view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

import util.DateUtils;

public class Ex03 {

	private static String[] WEEKDAYS = { "Chủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ Năm", "Thứ Sáu", "Thứ Bảy" };

	public static void main(String[] args) {

		Locale locale = new Locale("en", "US");
		Calendar now = Calendar.getInstance();

		TimeZone timeZone = TimeZone.getTimeZone("Asia/Tokyo");
		now.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));

		printCurrentTimeOfOtherCountry(timeZone);
		printLastDayOfMonth(now);
		printFirstDayAndLastDayOfWeek(now);

		printPositionOfDayInYear(now);
		printDayAfter20DaysFromNow(now, locale);
		countDaysYouLive(locale);
	}

	private static void printCurrentTimeOfOtherCountry(TimeZone timeZone) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Calendar now = Calendar.getInstance();
		df.setTimeZone(timeZone);
		Date covDate = now.getTime();
		String formatted = df.format(covDate);
		System.out.println(" 1. Hiển thị ngày giờ Tokyo -> " + formatted);
	}

	private static void printLastDayOfMonth(Calendar now) {
		System.out.println("\n 2. In ngày cuối cùng của tháng hiện tại ");
		System.out.println(" " + now.getActualMaximum(Calendar.DAY_OF_MONTH) + "/" + (now.get(Calendar.MONTH) + 1) + "/"
				+ now.get(Calendar.YEAR));
	}

	private static void printFirstDayAndLastDayOfWeek(Calendar c) {
		Locale locale = new Locale("en", "US");
		Calendar cloned = DateUtils.clone(c);
		int currentDay = cloned.get(Calendar.DAY_OF_WEEK);

		int fdow = cloned.getFirstDayOfWeek();

		Calendar beginningDayOfWeek = DateUtils.clone(c);
		beginningDayOfWeek.add(Calendar.DAY_OF_MONTH, fdow - currentDay);

		Calendar finalDayOfWeek = DateUtils.clone(beginningDayOfWeek);
		finalDayOfWeek.add(Calendar.DAY_OF_WEEK, 6);

		System.out.println(
				"\n 3. Ngày đầu tiên của tuần chứa ngày hiện tại --> " + DateUtils.format(beginningDayOfWeek, locale));
		System.out
				.println(" Ngày cuối cùng của tuần chứa ngày hiện tại --> " + DateUtils.format(finalDayOfWeek, locale));
	}

	private static void printPositionOfDayInYear(Calendar c) {

		Calendar cloned = DateUtils.clone(c);
		int posOfWeek = cloned.get(Calendar.WEEK_OF_YEAR);

		System.out.println("\n 4. Ngày hiện tại ở tuần thứ : " + posOfWeek + " trong năm");

	}

	private static void printDayAfter20DaysFromNow(Calendar c, Locale locale) {
		Calendar cloned = DateUtils.clone(c);
		cloned.add(Calendar.DAY_OF_MONTH, 20);

		String dowAsVnText = WEEKDAYS[cloned.get(Calendar.DAY_OF_WEEK) - 1];
		System.out
				.println("\n 5. Sau 20 ngày nữa sẽ là ngày: " + DateUtils.format(cloned, locale) + ", " + dowAsVnText);

	}

	private static void countDaysYouLive(Locale locale) {
		String text = null;
		Date date = null;
		Calendar dateOfBirth = null;
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Scanner ip = new Scanner(System.in);
		do {

			System.out.println("\n 6. Mời nhập ngay sinh: ");
			text = ip.nextLine();
			try {
				date = format.parse(text);
				dateOfBirth = DateUtils.toCalendar(date, locale);
				break;
			} catch (NullPointerException e) {
				System.out.println("Da co loi xay ra");
			} catch (ParseException e) {
				System.out.println("Hay nhap dung dinh dang");
			}

		} while (true);
		ip.close();
		Calendar cloned = DateUtils.clone(dateOfBirth);
		Calendar currentTime = Calendar.getInstance();

		long birthInMs = cloned.getTimeInMillis();
		long currentInMs = currentTime.getTimeInMillis();

		long distance = currentInMs - birthInMs;

		long daysAlive = distance / (1000 * 60 * 60 * 24);

		System.out.println(" Số ngày bạn đã sống là " + daysAlive);
	}
}
