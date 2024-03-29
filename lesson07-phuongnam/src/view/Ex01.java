package view;

import java.util.Locale;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import util.DateUtils;

public class Ex01 {

	public static void main(String[] args) {
		Locale locale = new Locale("en", "US");
		Scanner ip = new Scanner(System.in);

		String text = null;
		Date date = null;
		Calendar c = null;
		Calendar now = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		do {

			System.out.println("Mời nhập thời gian hẹn hò: ");
			text = ip.nextLine();

			try {
				date = df.parse(text);
				c = DateUtils.toCalendar(date, locale);
				if (c.before(now)) {

					break;
				} else {
					System.out.println("Bạn đã nhập quá thời gian hiện tại");
				}
			} catch (ParseException e) {
				System.out.println("Sai rồi. Hãy nhập đúng định dạng dd/MM/yyyy HH:mm:ss");
			}

		} while (true);

		System.out.println("Thời gian hẹn hò là : " + date);

		System.out.println("c là " + c.get(Calendar.DAY_OF_MONTH));

		System.out.println("Bạn đã chia tay chưa ? Nhấn y/n");
		String isBreakup = null;
		String text2 = null;
		Date breakupTime = null;
		Calendar breakup = null;
		do {
			isBreakup = ip.nextLine();
			switch (isBreakup) {
			case "y":
				do {
					System.out.println("Mời nhập ngày chia tay:");
					try {
						text2 = ip.nextLine();
						breakupTime = df.parse(text2);
						breakup = DateUtils.toCalendar(breakupTime, locale);
						if (breakup.before(now) && breakup.after(c)) {
							System.out.println("Ngày bắt đầu hẹn hò là ngày thứ " + c.get(Calendar.DAY_OF_WEEK));
							System.out.println(
									"Ngày trong tuần dạng chữ - format): " + DateUtils.format(c, "EEEE", locale));
							break;
						}

						else {
							System.out.println("Bạn đã nhập quá thời gian hiện tại hoặc trước ngày bắt đầu hẹn hò");
						}
					} catch (ParseException e) {
						System.out.println("Sai rồi. Hãy nhập đúng định dạng dd/MM/yyyy HH:mm:ss");
					}

				} while (true);
				break;
			case "n":
				System.out.println("Lấy thời gian tới hiện tại");
				breakup = now;
				break;
			default:
				System.out.println("Vui lòng gõ y hoặc n ! ");
				break;

			}
		} while (!isBreakup.equals("y") && !isBreakup.equals("n"));

		ip.close();

		long startInMs = c.getTimeInMillis();
		long breakUpInMs = breakup.getTimeInMillis();
		System.out.println("Thời điểm bắt đầu hẹn hò tính bằng Ms: " + startInMs);

		long duration = breakUpInMs - startInMs;
		System.out.println("Thời gian kéo dài của mối tình tính bằng Ms: " + duration + "(ms)");

		long days = TimeUnit.MILLISECONDS.toDays(duration);

		duration -= TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(duration);

		duration -= TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);

		duration -= TimeUnit.MINUTES.toMillis(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);

		System.out.println("Số ngày = " + days);
		System.out.println("Số giờ = " + hours);
		System.out.println("Số phút = " + minutes);
		System.out.println("Số giây = " + seconds);

		System.out.println("Mối tình đã kéo dài trong : " + days + " ngày, " + hours + " giờ, " + minutes + " phút, "
				+ seconds + " giây.");

	}

}
