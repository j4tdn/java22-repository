package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Locale;
import java.util.Scanner;

import static util.DateUtilsJava08.*;

public class Ex02Java08 {

	private static String[] WEEKDAYS = { "Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ Năm", "Thứ Sáu", "Thứ Bảy", "Chủ Nhật" };

	public static void main(String[] args) {

		Locale locale = new Locale("en", "US");
		Scanner ip = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy", locale);
		String text = null;
		LocalDate dateOfBirth = null;

		do {

			System.out.println("Mời nhập ngay sinh: ");
			text = ip.nextLine();

			dateOfBirth = toLocalDate(text, "dd/MM/yyyy", locale);

			if (isBeforeNow(dateOfBirth)) {
				break;
			}

		} while (true);
		ip.close();

		System.out.println("\n Thông tin của ngày sinh: " + dtf.format(dateOfBirth));

		int dowAsNumber = dateOfBirth.get(ChronoField.DAY_OF_WEEK);

		String dowAsVnText = WEEKDAYS[dowAsNumber - 1];
		System.out.println("\n Ngày sinh của bạn là: " + dowAsVnText);

		System.out
				.println("\n Ngày sinh của bạn là ngày thứ " + dateOfBirth.get(ChronoField.DAY_OF_YEAR) + " trong năm");

		int numberOfDaysLeftOfYear = dateOfBirth.lengthOfYear() - dateOfBirth.get(ChronoField.DAY_OF_YEAR);
		System.out.println(" Còn lại " + numberOfDaysLeftOfYear + " ngay là hết năm ");

		findPositionOfWeekdayInYear(dateOfBirth, dowAsVnText);

		int month = dateOfBirth.get(ChronoField.MONTH_OF_YEAR);
		int daysOfMonth = dateOfBirth.lengthOfMonth();
		System.out.println("\n Tháng sinh là: " + month);
		System.out.println(" Số ngày trong tháng là " + daysOfMonth);

		findPositionOfWeekdayInMonth(dateOfBirth, dowAsVnText);

		System.out.println(
				"\n Năm " + dateOfBirth.get(ChronoField.YEAR) + " có " + dateOfBirth.lengthOfYear() + " ngày. ");
		System.out.println(" Tháng " + (dateOfBirth.get(ChronoField.MONTH_OF_YEAR)) + " năm "
				+ dateOfBirth.get(ChronoField.YEAR) + " có " + dateOfBirth.lengthOfMonth() + " ngày. ");
	}

	private static void findPositionOfWeekdayInYear(LocalDate dateOfBirth, String dowAsVnText) { // Hàm xác định ngày
																									// sinh
																									// là ngày thứ mấy
																									// trong tuần và vị
																									// trí của nó trong
																									// số các ngày cùng
																									// cấp trong năm
		int count = 0;
		LocalDate d = dateOfBirth;
		for (int day = 1; day <= dateOfBirth.lengthOfYear(); day++) {
			LocalDate e = d.withDayOfYear(day);
			if (e.get(ChronoField.DAY_OF_WEEK) == dateOfBirth.get(ChronoField.DAY_OF_WEEK)) {
				count++;
				if ((e.get(ChronoField.DAY_OF_MONTH) == dateOfBirth.get(ChronoField.DAY_OF_MONTH))
						&& (e.get(ChronoField.MONTH_OF_YEAR) == dateOfBirth.get(ChronoField.MONTH_OF_YEAR))) {
					System.out.println("\n Đây là ngày " + dowAsVnText + " thứ " + count + " trong năm. ");
				}
			}
		}
		System.out.println(" Tổng cộng : " + count + " ngày " + dowAsVnText);
	}

	private static void findPositionOfWeekdayInMonth(LocalDate dateOfBirth, String dowAsVnText) { // Hàm xác định ngày
																									// sinh
																									// là ngày thứ mấy
																									// trong tuần và vị
																									// trí của của nó
																									// trong số các ngày
																									// cùng cấp trong
																									// tháng
		int count = 0;
		LocalDate d = dateOfBirth;
		for (int i = 1; i <= dateOfBirth.lengthOfMonth(); i++) {
			LocalDate e = d.withDayOfMonth(i);

			if (e.get(ChronoField.DAY_OF_WEEK) == dateOfBirth.get(ChronoField.DAY_OF_WEEK)) {
				count++;

				if (e.get(ChronoField.DAY_OF_MONTH) == dateOfBirth.get(ChronoField.DAY_OF_MONTH)) {
					System.out.println("\n Đây là ngày " + dowAsVnText + " ở vị trí thứ " + count);
				}
			}
		}

		System.out.println("Trong đó có tất cả " + count + " ngày " + dowAsVnText + " trong tháng "
				+ (dateOfBirth.get(ChronoField.MONTH_OF_YEAR)));
	}
}
