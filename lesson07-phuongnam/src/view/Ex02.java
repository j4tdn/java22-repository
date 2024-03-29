package view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import util.DateUtils;

public class Ex02 {

	private static String[] WEEKDAYS = { "Chủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ Năm", "Thứ Sáu", "Thứ Bảy" };

	public static void main(String[] args) {

		Locale locale = new Locale("en", "US");
		Scanner ip = new Scanner(System.in);

		String text = null;
		Date date = null;
		Calendar dateOfBirth = null;
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		do {

			System.out.println("Mời nhập ngay sinh: ");
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

		System.out.println("\n Thông tin của ngày sinh: " + DateUtils.format(dateOfBirth, locale));
		System.out.println("\n Ngày sinh của bạn là: " + DateUtils.format(dateOfBirth, "EEEE", locale));
		int dowAsNumber = dateOfBirth.get(Calendar.DAY_OF_WEEK);

		String dowAsVnText = WEEKDAYS[dowAsNumber - 1];
		System.out.println("\n Ngày sinh của bạn là: " + dowAsVnText);

		System.out.println("\n Ngày sinh của bạn là ngày thứ " + dateOfBirth.get(Calendar.DAY_OF_YEAR) + " trong năm");

		int numberOfDaysLeftOfYear = dateOfBirth.getActualMaximum(Calendar.DAY_OF_YEAR)
				- dateOfBirth.get(Calendar.DAY_OF_YEAR);
		System.out.println(" Còn lại " + numberOfDaysLeftOfYear + " ngay là hết năm ");

		Calendar c = Calendar.getInstance();
		Calendar d = Calendar.getInstance();
		c.set(Calendar.YEAR, dateOfBirth.get(Calendar.YEAR));
		d.set(Calendar.YEAR, dateOfBirth.get(Calendar.YEAR));
		System.out.println(" Năm sinh là : " + c.get(Calendar.YEAR));
		c.set(Calendar.DAY_OF_YEAR, 1);
		int lastDayOfYear = d.getActualMaximum(Calendar.DAY_OF_YEAR);

		int count = 0;
		for (int day = 1; day <= lastDayOfYear; day++) {

			d.set(Calendar.DAY_OF_YEAR, day);
			if (d.get(Calendar.DAY_OF_WEEK) == dateOfBirth.get(Calendar.DAY_OF_WEEK)) {

				count++;
				if ((d.get(Calendar.DAY_OF_MONTH) == dateOfBirth.get(Calendar.DAY_OF_MONTH))
						&& ((d.get(Calendar.MONTH) == dateOfBirth.get(Calendar.MONTH)))) {
					System.out.println("\n Đây là ngày " + dowAsVnText + " thứ " + count + " trong năm. ");
				}

			}
		}

		System.out.println(" Tổng cộng : " + count + " ngày " + dowAsVnText);

		Calendar e = Calendar.getInstance();
		e.set(Calendar.YEAR, dateOfBirth.get(Calendar.YEAR));
		e.set(Calendar.MONTH, dateOfBirth.get(Calendar.MONTH));
		int month = dateOfBirth.get(Calendar.MONTH) + 1;
		int daysOfMonth = dateOfBirth.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("\n Tháng sinh là: " + month);
		System.out.println(" Số ngày trong tháng là " + daysOfMonth);

		int countSameWeekday = 0;
		for (int i = 1; i <= daysOfMonth; i++) {
			e.set(Calendar.DAY_OF_MONTH, i);

			if (e.get(Calendar.DAY_OF_WEEK) == dateOfBirth.get(Calendar.DAY_OF_WEEK)) {
				countSameWeekday++;

				if (e.get(Calendar.DAY_OF_MONTH) == dateOfBirth.get(Calendar.DAY_OF_MONTH)) {
					System.out.println("\n Đây là ngày " + dowAsVnText + " ở vị trí thứ " + countSameWeekday);
				}
			}
		}
		System.out.println(" Có tất cả " + countSameWeekday + " ngày " + dowAsVnText + " trong tháng "
				+ (dateOfBirth.get(Calendar.MONTH) + 1));

		System.out.println("\n Năm " + dateOfBirth.get(Calendar.YEAR) + " có "
				+ dateOfBirth.getActualMaximum(Calendar.DAY_OF_YEAR) + " ngày. ");
		System.out.println(" Tháng " + (dateOfBirth.get(Calendar.MONTH) + 1) + " năm " + dateOfBirth.get(Calendar.YEAR)
				+ " có " + dateOfBirth.getActualMaximum(Calendar.DAY_OF_MONTH) + " ngày. ");
	}

}
