package localdatetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class Ex01LocalDate {
	
	/*
	 * LocalDate: ngày/ tháng/ năm
	 * 				ngày trong tháng, năm
	 * 				tuần trong tháng, năm
	 * 				ngày trong tuần 
	 */
	public static void main(String[] args) {
		// util Date --> Date date = new Date();              --> constructor
				//           --> Calendar c = Calendar.getInstance(); --> singleton pattern
				// LocalDate, LocalTime, LocalDatetime                --> builder pattern
						
//		Locale vnLocale = new Locale("vi","VN");
		Locale vnLocale = new Locale("en","US");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy EEEE",vnLocale);
		
//		LocalDate ldate = LocalDate.now();// lấy ngày tháng năm hiện tại theo system time
		LocalDate ldate = LocalDate.now()
				.withDayOfMonth(15)
				.withMonth(4);// thay vì trả về void như setter thì hàm này trả về 1 đối tượng kiểu localDate
		System.out.println("ldate: "+ ldate);
		System.out.println("ldate: "+ dtf.format(ldate));
		
		System.out.println("==============================================");
		LocalDate aDate = LocalDate.of(2024, Month.MARCH, 31)
				.with(ChronoField.DAY_OF_WEEK,5)
				.plusWeeks(2)
				.minusDays(3);
		
				// unsuported .with(ChronoField.SECOND_OF_MINUTE, 42);
		System.out.println("hash(sDate) before: "+ System.identityHashCode(aDate));
		System.out.println("adate before :"+ dtf.format(aDate));
		aDate = aDate.plusDays(1);
		System.out.println("hash(sDate) after: "+ System.identityHashCode(aDate));
		System.out.println("adate after  : "+ dtf.format(aDate));
		

	}
}
