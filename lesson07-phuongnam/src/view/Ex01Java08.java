package view;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoField;
import java.util.Locale;
import java.util.Scanner;
import util.DateUtilsJava08;
import static util.DateUtilsJava08.*;

public class Ex01Java08 {

	private static String[] WEEKDAYS = { "Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ Năm", "Thứ Sáu", "Thứ Bảy", "Chủ Nhật" };

	public static void main(String[] args) {
		Locale vnLocale = new Locale("vi", "vn");
		Scanner ip = new Scanner(System.in);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss", vnLocale);
		String text = null;
		LocalDateTime startDatingTime = null;
		LocalDateTime now = LocalDateTime.now();

		do {
			System.out.println("Mời nhập thời gian hẹn hò: ");
			text = ip.nextLine();

			startDatingTime = toLocalDateTime(text, "dd/MM/yyyy HH:mm:ss", vnLocale);

			if (isBeforeNow(startDatingTime)) {
				break;
			}

		} while (true);

		System.out.println("Thời gian hẹn hò bắt đầu vào: " + dtf.format(startDatingTime));

		int dowAsNumber = startDatingTime.get(ChronoField.DAY_OF_WEEK);
		String dowAsVnText = WEEKDAYS[dowAsNumber - 1];
		System.out.println("Ngày hẹn hò là ngày " + dowAsVnText);

		System.out.println("Bạn đã chia tay chưa ? Nhấn y/n");
		String text2 = null;
		LocalDateTime breakUpTime = null;
		String choose = null;

		do {
			choose = ip.nextLine();
			switch (choose) {
			case "y":
				do {
					System.out.println("Mời nhập ngày chia tay:");
					try {
						text2 = ip.nextLine();
						breakUpTime = toLocalDateTime(text2, "dd/MM/yyyy HH:mm:ss", vnLocale);

						System.out.println("Ngày chia tay là : " + dtf.format(breakUpTime));

						if (breakUpTime.isBefore(now) && breakUpTime.isAfter(startDatingTime)) {

							Period period = DateUtilsJava08.calculatePeriod(startDatingTime, breakUpTime);

							Duration duration = DateUtilsJava08.calculateDuration(startDatingTime, breakUpTime);

							if (duration.isNegative()) {
								duration = duration.plusDays(1);
								period = period.minusDays(1);
							}

							System.out.println("Khoảng thời gian là --> " + format(period) + " " + format(duration));
							break;
						}

						else {
							System.out.println("Bạn đã nhập quá thời gian hiện tại hoặc trước ngày bắt đầu hẹn hò");
						}

					} catch (DateTimeParseException e) {
						System.out.println("Sai rồi. Hãy nhập đúng định dạng dd/MM/yyyy HH:mm:ss");
					}

				} while (true);
				break;
			case "n":
				System.out.println("Lấy thời gian tới hiện tại");

				Period period = DateUtilsJava08.calculatePeriod(startDatingTime, now);
				Duration duration = DateUtilsJava08.calculateDuration(startDatingTime, now);

				if (duration.isNegative()) {
					duration = duration.plusDays(1);
					period = period.minusDays(1);
				}

				System.out.println("Khoảng thời gian là --> " + format(period) + " " + format(duration));

				break;
			default:
				System.out.println("Vui lòng gõ y hoặc n ! ");
				break;

			}
		} while (!choose.equals("y") && !choose.equals("n"));

		ip.close();
	}

	private static String format(Period period) {
		return String.join(" ", opt(period.getYears(), "year"), opt(period.getMonths(), "month"),
				opt(period.getDays(), "day"));
	}

	private static String format(Duration duration) {
		return String.join(" ", opt(duration.toHoursPart(), "hour"), opt(duration.toMinutesPart(), "minute"),
				opt(duration.toSecondsPart(), "second"));
	}
}
