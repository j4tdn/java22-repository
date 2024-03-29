package exercises;

import java.text.SimpleDateFormat;

import java.util.Calendar;

import java.util.Date;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		lastdayOfMonth();

		firstlastdayOfWeek();

		after20Days();

		weekofyear();

		calculateDate();

	}

	public static void timeZone() {

	}

	public static void lastdayOfMonth() {

		Calendar calendar = Calendar.getInstance();

		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));

		Date lastDayOfMonth = calendar.getTime();

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Ngày cuối cùng của tháng hiện tại: " + dateFormat.format(lastDayOfMonth));

	}

	public static void firstlastdayOfWeek() {

		Calendar calendar = Calendar.getInstance();

		calendar.set(Calendar.DAY_OF_WEEK, calendar.getFirstDayOfWeek());

//ngay dau

		Date firstDayOfWeek = calendar.getTime();

//cong them 6 de ra ngay cuoi tuan

		calendar.add(Calendar.DAY_OF_WEEK, 6);

		Date lastDayOfWeek = calendar.getTime();

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Ngày đầu tiên của tuần hiện tại: " + dateFormat.format(firstDayOfWeek));

		System.out.println("Ngày cuối cùng của tuần hiện tại: " + dateFormat.format(lastDayOfWeek));

	}

	public static void after20Days() {

		Calendar calendar = Calendar.getInstance();

		calendar.add(Calendar.DAY_OF_MONTH, 20);

		Date dayAfter20Days = calendar.getTime();

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy (E)");

		System.out.println("Sau 20 ngày nữa là ngày: " + dateFormat.format(dayAfter20Days));

	}

	public static void weekofyear() {

		Calendar calendar = Calendar.getInstance();

		int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);

		System.out.println("Ngày hiện tại đang ở tuần thứ: " + weekOfYear);

	}

	public static void calculateDate() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập vào ngày tháng năm sinh (dd/MM/yyyy): ");

		String input = scanner.nextLine();

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		Calendar birthDateCalendar = Calendar.getInstance();

		try {

			Date birthDate = dateFormat.parse(input);

			birthDateCalendar.setTime(birthDate);

			Calendar currentDateCalendar = Calendar.getInstance();

			long days = daysBetween(birthDateCalendar, currentDateCalendar);

			System.out.println("Số ngày bạn đã sống: " + days + " ngày.");

		} catch (Exception e) {

			System.out.println("Định dạng không hợp lệ!");

		} finally {

			scanner.close();

		}

	}

	public static long daysBetween(Calendar startDate, Calendar endDate) {

		Calendar date = (Calendar) startDate.clone();

		long daysBetween = 0;

		while (date.before(endDate)) {

			date.add(Calendar.DAY_OF_MONTH, 1);

			daysBetween++;

		}

		return daysBetween;

	}

}
