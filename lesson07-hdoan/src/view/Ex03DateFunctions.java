package view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Ex03DateFunctions {

	private static final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		getCurrentDateTime("Asia/Ho_Chi_Minh");
		getLastDayOfMonth();
		getFirstAndLastDayOfWeek();
		getCurrentWeekNumber();
		checkDateAfterTwentyDays();
		calculateDaysAlive();
	}

	public static void getCurrentDateTime(String timeZone) {
		DateFormat dateTimeFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		dateTimeFormat.setTimeZone(TimeZone.getTimeZone(timeZone));
		String currentDateTime = dateTimeFormat.format(new Date());
		System.out.println("Thời gian hiện tại ở khu vực " + timeZone + ": " + currentDateTime);
	}

	public static void getLastDayOfMonth() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		String lastDayOfMonth = dateFormat.format(calendar.getTime());
		System.out.println("Ngày cuối cùng của tháng hiện tại: " + lastDayOfMonth);
	}

	public static void getFirstAndLastDayOfWeek() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_WEEK, calendar.getFirstDayOfWeek());
		String firstDayOfWeek = dateFormat.format(calendar.getTime());

		calendar.add(Calendar.DAY_OF_WEEK, 6);
		String lastDayOfWeek = dateFormat.format(calendar.getTime());

		System.out.println("Ngày đầu tiên của tuần hiện tại: " + firstDayOfWeek);
		System.out.println("Ngày cuối cùng của tuần hiện tại: " + lastDayOfWeek);
	}

	public static void getCurrentWeekNumber() {
		Calendar calendar = Calendar.getInstance();
		int weekNumber = calendar.get(Calendar.WEEK_OF_YEAR);
		System.out.println("Tuần thứ " + weekNumber + " trong năm");
	}

	public static void checkDateAfterTwentyDays() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, 20);
		DateFormat dayOfWeekFormat = new SimpleDateFormat("dd/MM/yyyy EEEE");
		String dateAfterTwentyDays = dayOfWeekFormat.format(calendar.getTime());
		System.out.println("Sau 20 ngày là ngày " + dateAfterTwentyDays);
	}

	public static void calculateDaysAlive() {
		System.out.println("Nhập ngày tháng năm sinh (dd/MM/yyyy): ");
		String dobString = scanner.nextLine();
		try {
			Date dob = dateFormat.parse(dobString);
			Date currentDate = new Date();

			long diff = currentDate.getTime() - dob.getTime();
			long daysAlive = diff / (1000 * 60 * 60 * 24);

			System.out.println("Bạn đã sống được " + daysAlive + " ngày.");
		} catch (ParseException e) {
			System.out.println("Định dạng ngày không hợp lệ. Vui lòng nhập lại theo định dạng dd/MM/yyyy");
		}
	}
}
