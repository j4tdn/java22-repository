package localdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Locale;

import javax.swing.text.DateFormatter;

public class Ex01LocalDateDemo {

	/*
	 LocalDate --> Ngay, thang, nam  
	  		   --> Ngày trong tháng , năm 
	  		   -->Tuần trong tháng, năm
	  		   --> Ngày trong tuần
	  		   
	  		   
	 
	 
	 */
	
	public static void main(String[] args) {
		
		
		//LocalDate.now() -> Lấy ngày tháng năm hiện tại theo system time
		
		Locale vnLocale = new Locale("vi", "VN");
		
//		Locale usLocale = new Locale("en", "us");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy EEEE", vnLocale);
		
		LocalDate ldate = LocalDate.now().withDayOfMonth(15).withMonth(4);
			;
		
		System.out.println("ldate ->" + ldate );
		System.out.println("ldate format -> " + dtf.format(ldate));
		
		System.out.println("\n===========================\n");
		//c.set(field, value)
		
		//Calendar.SUNDAY -> 1
		//Carlendar.MONDAY -> 2
		//DayOfWeek.Mnday -> 1
		
		LocalDate aDate = LocalDate.of(2024, Month.MARCH, 31)
							.with(ChronoField.DAY_OF_WEEK, 5)
							.plusWeeks(2)
							.minusDays(3);  
							
//							unsupported field
//							.with(ChronoField.SECOND_OF_MINUTE, 42);
		
		System.out.println("aDate before: " + dtf.format(aDate));
		System.out.println("hash(aDate) before:" + System.identityHashCode(aDate));
		
		aDate = aDate.plusDays(1);
		
		System.out.println("aDate after: " + dtf.format(aDate));
		
		System.out.println("hash(aDate) after:" + System.identityHashCode(aDate));
	}
}
