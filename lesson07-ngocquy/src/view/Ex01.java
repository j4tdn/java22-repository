package view;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import common.WKD_EGVN;
import util.DateUtils;

public class Ex01 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		Locale locale = new Locale("en", "US");
		System.out.println("Nhập thời gian hẹn hò của bạn <3");
		Calendar beginDay = input();
		Calendar endDay = Calendar.getInstance();
		boolean hasBrokenUp = false;
		System.out.println("Bạn đã chia tay chưa:( Y/N");
		while (true) {
			String answer = ip.nextLine();
			if ("Y".equals(answer)) {
				System.out.println("Nhập ngày chia tay: ");
				endDay = input();
				hasBrokenUp = true;
				break;
			} else if ("N".equals(answer)) {
				break;
			} else {
				System.out.println("Vui lòng trả lời thành thật không gian dối:) Y/N");
			}
		}
		System.out.println("Nhập thành công!!");
		System.out.println("1. In thông tin ngày hẹn hò: " + DateUtils.format(beginDay, locale));
		if (hasBrokenUp) {
			System.out.println("2. In thông tin ngày chia tay: " + DateUtils.format(endDay, locale));
			// timeCaculating(beginDay, endDay);
		} else {
			System.out.println("Đã chia tay đâu mà đòi in!");
		}
		int dowAsNumber = beginDay.get(Calendar.DAY_OF_WEEK);
		WKD_EGVN[] wkds = WKD_EGVN.values();
		WKD_EGVN dowAsEnum = wkds[dowAsNumber - 1];
		System.out.println("3. Ngày 2 bạn hẹn hò là ngày: " + dowAsEnum.getVnText());
		System.out.println("4. Thời gian 2 bạn yêu nhau là: ");
		timeCaculating(beginDay, endDay);
	}

	private static Calendar input() {
		Calendar currentTime = Calendar.getInstance();
		Calendar dayC = Calendar.getInstance();
		String dayStr = "";
		while (true) {
			dayStr = ip.nextLine();
			if ("Y".equalsIgnoreCase(dayStr) || "N".equalsIgnoreCase(dayStr)) {
				break;
			}
			try {
				dayC = DateUtils.toCalendar(dayStr, "dd/MM/yyyy HH:mm:ss");
				if (dayC.after(currentTime)) {
					System.out.println("Thời gian bạn nhập vào chưa đến. Vui lòng nhập lại:");
					continue;
				}
				break;
			} catch (Exception e) {
				System.out.println("Sai định dạng 'dd/MM/yyyy HH:mm:ss'");
				System.out.println("--> Vui lòng nhập lại ");
			}
		}
		return dayC;
	}

	private static void timeCaculating(Calendar start, Calendar end) {
		long startInMs = start.getTimeInMillis();
		long endInMs = end.getTimeInMillis();

		long duration = endInMs - startInMs;
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		duration -= TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(duration);

		duration -= TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);

		duration -= TimeUnit.MINUTES.toMillis(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);

		System.out.println("\tSố ngày = " + days);
		System.out.println("\tSố giờ = " + hours);
		System.out.println("\tSố phút = " + minutes);
		System.out.println("\tSố giây = " + seconds);
	}
}
