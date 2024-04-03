package view;

import static util.DateUtilsJava08.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Locale;
import java.util.Scanner;

public class Ex03Java08 {
	private static String[] WEEKDAYS = { "Chủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ Năm", "Thứ Sáu", "Thứ Bảy" };

	public static void main(String[] args) {

		Locale locale = new Locale("en", "US");

		printCurrentTime(locale);
		printLastDayOfMonth();
		printFirstDayAndLastDayOfWeek();
		printPositionOfWeekInYear();
		printDayAfter20DaysFromNow(locale);
		countDaysYouLive(locale);
	}

	private static void printCurrentTime(Locale locale) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss", locale);
		LocalDateTime now = LocalDateTime.now();

		System.out.println("Thời gian thực tại: " + dtf.format(now));

	}

	private static void printLastDayOfMonth() {
		LocalDate now = LocalDate.now();
		System.out.println("\n 2. In ngày cuối cùng của tháng hiện tại ");
		System.out.println(" " + now.lengthOfMonth() + "/" + (now.get(ChronoField.MONTH_OF_YEAR)) + "/"
				+ now.get(ChronoField.YEAR));
	}

	private static void printFirstDayAndLastDayOfWeek() {
		Locale locale = new Locale("en", "US");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy", locale);
		LocalDate now = LocalDate.now();

		LocalDate fdow = now.with(ChronoField.DAY_OF_WEEK, 1);
		LocalDate ldow = now.with(ChronoField.DAY_OF_WEEK, 7);
		System.out.println("Ngày đầu tuần của tuần chứa ngày hiện tại: " + dtf.format(fdow));
		System.out.println("Ngày cuối tuần của tuần chứa ngày hiện tại: " + dtf.format(ldow));

	}

	private static void printPositionOfWeekInYear() {

		LocalDate now = LocalDate.now();
		int posOfWeek = now.get(ChronoField.ALIGNED_WEEK_OF_YEAR);

		System.out.println("\n 4. Ngày hiện tại ở tuần thứ : " + posOfWeek + " trong năm");

	}

	private static void printDayAfter20DaysFromNow(Locale locale) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy", locale);
		LocalDate now = LocalDate.now();
		now = now.plusDays(20);

		String dowAsVnText = WEEKDAYS[now.get(ChronoField.DAY_OF_WEEK)];
		System.out.println("\n 5. Sau 20 ngày nữa sẽ là ngày: " + dtf.format(now) + ", " + dowAsVnText);

	}

	private static void countDaysYouLive(Locale locale) {
		String text = null;
		LocalDate dateOfBirth = null;
		LocalDate now = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy", locale);
		Scanner ip = new Scanner(System.in);
		do {

			System.out.println("\n 6. Mời nhập ngày sinh: ");
			text = ip.nextLine();

			dateOfBirth = toLocalDate(text, "dd/MM/yyyy", locale);

			if (isBeforeNow(dateOfBirth)) {
				break;
			}

		} while (true);
		ip.close();

		Period period = Period.between(dateOfBirth, now);

		System.out.println(" Ngày sinh của bạn là " + dtf.format(dateOfBirth));
		System.out.println(" Bạn đã sống được " + format(period));
	}

	private static String format(Period period) {
		return String.join(" ", opt(period.getYears(), "year"), opt(period.getMonths(), "month"),
				opt(period.getDays(), "day"));
	}
}
