package datetimejava07;

import java.util.Calendar;
import java.util.Scanner;

import utils.DateUtils;

public class TheUltimateRelationshipCalculator {

	private static final Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Ngày bắt đầu hẹn hò(yyyy-MM-dd):");

		String startDateString = ip.nextLine();
		Calendar startCalendar = DateUtils.dateToCalendar(DateUtils.parseDateString(startDateString));

		if (startCalendar == null)
			return;

		System.out.println("Ngày chia tay (nếu có) (yyyy-MM-dd), nếu chưa chia tay hãy nhập 'no':");
		String endDateString = ip.nextLine();

		Calendar endCalendar;

		if (endDateString.equalsIgnoreCase("no")) {
			endCalendar = Calendar.getInstance();
		} else {
			endCalendar = DateUtils.dateToCalendar(DateUtils.parseDateString(endDateString));
			if (endCalendar == null)
				return;
		}

		long[] timeDifference = calTimeDifference(startCalendar, endCalendar);
		displayTimeDifference(startCalendar, timeDifference);

	}

	private static long[] calTimeDifference(Calendar startCalendar, Calendar endCalendar) {
		long millisecondsBetween = endCalendar.getTimeInMillis() - startCalendar.getTimeInMillis();
		long secondsBetween = millisecondsBetween / 1000;
		long minutesBetween = secondsBetween / 60;
		long hoursBetween = minutesBetween / 60;
		long daysBetween = hoursBetween / 24;
		return new long[] { daysBetween, hoursBetween % 24, minutesBetween % 60, secondsBetween % 60 };
	}

	private static void displayTimeDifference(Calendar startCalendar, long[] timeDifference) {
		System.out.println("Ngày bắt đầu hẹn hò là ngày thứ " + startCalendar.get(Calendar.DAY_OF_WEEK));
		System.out.println("Mối tình đã bắt đầu được " + timeDifference[0] + " ngày, " + timeDifference[1] + " giờ, "
				+ timeDifference[2] + " phút, " + timeDifference[3] + " giây.");
	}
}
