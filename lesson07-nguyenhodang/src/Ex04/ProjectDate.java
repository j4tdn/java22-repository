package Ex04;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class ProjectDate {

	
	public static void main(String[] args) {

		Locale vnLocale = new Locale("vi", "vn");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy EEEE", vnLocale);

		
		LocalDate startDate = LocalDate.now().withYear(2022)
							.withDayOfMonth(07)
							.withMonth(6);
		System.out.println("Hôm nay ngày: " + dtf.format(startDate));
        int projectDuration = 110;
        LocalDate endDate = startDate.plus(Period.ofDays(projectDuration));

        while (endDate.getDayOfWeek() == DayOfWeek.SATURDAY || endDate.getDayOfWeek() == DayOfWeek.SUNDAY) {
            endDate = endDate.plusDays(1);
        }

        System.out.println("Ngày dự kiến bàn giao sản phẩm: " + dtf.format(endDate));
		
	}
	
}