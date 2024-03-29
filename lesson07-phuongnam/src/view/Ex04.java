package view;

import java.util.Calendar;
import java.util.Locale;
import common.Holiday;
import util.DateUtils;

public class Ex04 {

	public static void main(String[] args) {
		Locale locale = new Locale("en", "US");
		Calendar c = Calendar.getInstance();

		c.set(Calendar.DAY_OF_MONTH, 7);
		c.set(Calendar.MONTH, Calendar.JUNE);
		c.set(Calendar.YEAR, 2022);

		System.out.println("Ngày bắt đầu: " + DateUtils.format(c, locale));

		int duration = 110;
		while (true) {

			if (!isWeekend(c) && !isHoliday(c)) {
				duration--;
			}

			if (duration == 0) {
				break;
			}
			c.add(Calendar.DAY_OF_MONTH, 1);

		}

		System.out.println("Ngày phải hoàn thành dự án: " + DateUtils.format(c, locale));
	}

	private static boolean isWeekend(Calendar c) {
		if (c.get(Calendar.DAY_OF_WEEK) == 1 || c.get(Calendar.DAY_OF_WEEK) == 7) {
			return true;
		}
		return false;
	}

	private static boolean isHoliday(Calendar c) {
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH) + 1;
		Holiday[] listHolidays = Holiday.values();
		for (Holiday holiday : listHolidays) {

			if (holiday.getDay() == day && holiday.getMonth() == month) {
				return true;
			}
		}

		return false;
	}
}
