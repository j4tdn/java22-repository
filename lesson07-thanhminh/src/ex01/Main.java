package ex01;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import static util.DateUtils.*;

public class Main {
	public static void main(String[] args) {
		Locale vnLocale = new Locale("vi", "VN");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy", vnLocale);
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập thời gian bắt đầu hẹn hò(dd/MM/yyy):");
		String startDateStr = sc.nextLine();
		LocalDate startDate = LocalDate.parse(startDateStr, dtf);
		
		System.out.println("Nhập thời gian chia tay(dd/MM/yyyy):");
		String endDateStr = sc.nextLine();
		LocalDate endDate;
		if (endDateStr.isEmpty()) {
			endDate = LocalDate.now();
		} else {
			endDate = LocalDate.parse(endDateStr, dtf);
		}
		Period period = Period.between(startDate, endDate);
		System.out.println("period: " + period);
		
		String format = String.join(" ", 
				opt(period.getYears() , "year"),
				opt(period.getMonths(), "month"), 
				opt(period.getDays()  , "day"));
		
		System.out.println("Khoảng thời gian hẹn hò:" + format);
		
		DayOfWeek dOW = startDate.getDayOfWeek();
		System.out.println("Ngày hẹn hò là ngày " + dOW);
	}

}
