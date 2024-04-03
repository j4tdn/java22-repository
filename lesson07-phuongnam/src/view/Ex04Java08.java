package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Locale;
import common.Holiday;

public class Ex04Java08 {

	public static void main(String[] args) {
		Locale locale = new Locale("vi", "VN");
		LocalDate startDay = LocalDate.now().withDayOfMonth(7).withMonth(6).withYear(2022);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy", locale);
		System.out.println("Ngày bắt đầu dự án: " + dtf.format(startDay));

		int duration = 110;

		while (true) {

			if (!isWeekend(startDay) && !isHoliday(startDay)) {
				duration--;
			}

			if (duration == 0) {
				break;
			}
			startDay = startDay.plusDays(1);

		}

		System.out.println("Ngày phải hoàn thành dự án: " + dtf.format(startDay));
	}

	private static boolean isWeekend(LocalDate day) {
		if (day.get(ChronoField.DAY_OF_WEEK) == 6 || day.get(ChronoField.DAY_OF_WEEK) == 7) {
			return true;
		}
		return false;
	}

	private static boolean isHoliday(LocalDate checkDay) {
		int day = checkDay.get(ChronoField.DAY_OF_MONTH);
		int month = checkDay.get(ChronoField.MONTH_OF_YEAR);

		Holiday[] listHolidays = Holiday.values();
		for (Holiday holiday : listHolidays) {

			if (holiday.getDay() == day && holiday.getMonth() == month) {
				return true;
			}
		}

		return false;
	}
}
