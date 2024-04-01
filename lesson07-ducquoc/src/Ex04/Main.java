package Ex04;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		LocalDate  date = LocalDate.of(2022	, 06,07);
		Locale vnLocale = new Locale("vi", "vn");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy", vnLocale);
		 DayOfWeek dayOfWeek = date.getDayOfWeek();
		 int a = (110-4)/7;
		 int b = (110-4)%7;
		 LocalDate endDay = LocalDate.of(2022, 06,07)
				 .plusDays(a*2+b+2+110+1);
		 System.out.println("ngày "+endDay+" sẽ phải giao sản phẩm");
	}
}
