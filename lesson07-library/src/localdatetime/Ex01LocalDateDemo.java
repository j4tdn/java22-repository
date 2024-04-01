package localdatetime;

import java.awt.SystemColor;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class Ex01LocalDateDemo {
	public static void main(String[] args) {
		
		// local date localtime  ----> builder pattern
		Locale vnLocale = new Locale("vi","vn");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy EEEE",vnLocale);
//		LocalDate ldate = LocalDate.now();
		LocalDate ldate = LocalDate.now()
									.withDayOfMonth(15)
									.withMonth(4);
		// lấy cái thười gianm hiện tại theo system time 
		System.out.println(ldate);
		
		System.out.println(dtf.format(ldate));
		
		System.out.println("=======================================");
		
		LocalDate aDate = LocalDate.of(2024,Month.MARCH,31)
							.with(ChronoField.DAY_OF_WEEK,5)
							.plusWeeks(2)
							.minusDays(3);
		System.out.println(System.identityHashCode(aDate));
		System.out.println(dtf.format(aDate));
		aDate = aDate.plusDays(1);
		
		System.out.println(dtf.format(aDate));
		}
}
