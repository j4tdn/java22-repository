package exercises;

import java.util.Calendar;

import java.util.Date;

public class Ex04 {

	public static void main(String[] args) {

		Calendar startDay = Calendar.getInstance();

		startDay.set(2022, Calendar.JUNE, 7);

		int completeDay = 110;

		Date finishDay = calculateEndDate(startDay, completeDay);

		System.out.println("Ngày bàn giao sản phẩm cho khách hàng: " + finishDay);

	}

	public static Date calculateEndDate(Calendar startDay, int completeDay) {

//ban sao, ko anh huong den startDay

		Calendar currentDate = (Calendar) startDay.clone();

		while (completeDay > 0) {

			if (currentDate.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY

					|| currentDate.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {

				currentDate.add(Calendar.DAY_OF_MONTH, 1);

				continue;

			}

			completeDay--;

			currentDate.add(Calendar.DAY_OF_MONTH, 1);

		}

		return currentDate.getTime();

	}

}