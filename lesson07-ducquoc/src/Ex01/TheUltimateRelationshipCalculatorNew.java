package Ex01;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Locale;
import java.util.Scanner;
import static utils.DateUtils.*;

public class TheUltimateRelationshipCalculatorNew {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("hãy nhập ngày hẹn hò ");
		String a = sc.nextLine();
		Locale vnLocale = new Locale("vi", "vn");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy", vnLocale);
		LocalDate aDate = LocalDate.parse(a, dtf);
		System.out.println(" hai bạn đã chia tay chưa 'y/n'");
		String b = sc.nextLine();
		if (b.equalsIgnoreCase("y")) {
			System.out.println("Nhập ngày chia tay ");
			String c = sc.nextLine();
			LocalDate cDate = LocalDate.parse(c, dtf);
			Period period = Period.between(aDate, cDate);
			String format = String.join(" ", opt(period.getYears(), "year"), opt(period.getMonths(), "month"),
					opt(period.getDays(), "day"));

			System.out.println("Khoảng thời gian:" + format);
		}
		else if (b.equalsIgnoreCase("n")) {
			LocalDate dDate = LocalDate.now();
			Period period = Period.between(aDate, dDate);
			String formatDate = String.join(" ", opt(period.getYears(), "year"), opt(period.getMonths(), "month"),
					opt(period.getDays(), "day"));
			Duration duration = Duration.between(aDate, dDate);
			String formatTime = String.join(" ", opt(duration.toHoursPart(), "hour"),
					opt(duration.toMinutesPart(), "minute"), opt(duration.toSecondsPart(), "second"));
			System.out.println("hai bạn đã yêu nhau được " + formatDate + formatTime);

		}
		DayOfWeek dayOfWeek = aDate.getDayOfWeek();
		System.out.println("ngày hẹn hò là ngày " + dayOfWeek);
	}
}
