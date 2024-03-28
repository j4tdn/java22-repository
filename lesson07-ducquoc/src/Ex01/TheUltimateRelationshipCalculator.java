package Ex01;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.text.ParseException;

public class TheUltimateRelationshipCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean inputValid = false;
		Date dateTime = null;
		Date endDate = null;
		int years = 0;
		int months = 0;
		int days = 0;

		while (!inputValid) {
			System.out.println("Nhập ngày kỉ niệm yêu nhau của 2 bạn: ");
			String inputDate = sc.nextLine();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			try {
				dateTime = dateFormat.parse(inputDate);
				System.out.println("Ngày bạn nhập là: " + dateTime);
				inputValid = true;
			} catch (ParseException e) {
				System.out.println("Định dạng ngày không hợp lệ. Vui lòng nhập lại!");
			}
		}

		System.out.println("Hai bạn vẫn còn yêu nhau? (y/n)");
		String check = sc.nextLine();

		if (check.equalsIgnoreCase("n")) {
			System.out.println("Nhập ngày chia tay: ");
			String inputDateEnd = sc.nextLine();
			SimpleDateFormat dateFormatEnd = new SimpleDateFormat("dd/MM/yyyy");

			try {
				endDate = dateFormatEnd.parse(inputDateEnd);

			} catch (ParseException e) {
				System.out.println("Định dạng ngày không hợp lệ. Vui lòng nhập lại!");
			}
			LocalDate startLocalDate = dateTime.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			LocalDate endLocalDate = endDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

			Period period = Period.between(startLocalDate, endLocalDate);

			years = period.getYears();
			months = period.getMonths();
			days = period.getDays();

			System.out.println("Khoảng thời gian đã yêu: " + years + " năm " + months + " tháng " + days + " ngày");

		} else {
			System.out.println("hai bạn thật hạnh phúc ");
			LocalDate startLocalDate = dateTime.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			LocalDate now = LocalDate.now();
			Period period = Period.between(startLocalDate, now);
			years = period.getYears();
			months = period.getMonths();
			days = period.getDays();
			System.out.println(" các bạn đã yêu nhau được " + years + " năm " + months + " tháng " + days + " ngày");
		}
		LocalDate dateTimeStart = dateTime.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

		DayOfWeek dayOfWeek = dateTimeStart.getDayOfWeek();
		System.out.println(" ngày các bạn hẹn hò là ngaỳ thứ : " + dayOfWeek);
		sc.close();
	}
}
