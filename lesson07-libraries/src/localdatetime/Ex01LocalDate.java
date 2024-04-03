package localdatetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class Ex01LocalDate {
	/*
	 LocalDate --> Ngày, Tháng, Năm
	           --> Ngày trong tháng, năm
	           --> Tuần trong tháng, năm
	           --> Ngày trong tuần
	 */
	public static void main(String[] args) {
		// util Date --> Date date = new Date();              --> constructor
		//           --> Calendar c = Calendar.getInstance(); --> singleton pattern
		// LocalDate, LocalTime, LocalDateTime                --> builder pattern
		
		Locale vnLocale = new Locale("vi", "VN");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy EEEE", vnLocale);
		// LocalDate.now() -> lấy ngày tháng năm hiện tại theo system time
		// LocalDate ldate = LocalDate.now();
				
		// normal class
		// setter --> setField(value) -> return void
				
		// builder pattern
		// setter --> withField(value) -> return this
		LocalDate ldate = LocalDate.now()// -> lấy ngày, tháng năm hiện tại theo system time
		                   .withDayOfMonth(15)// gán ngày
		                   .withMonth(4);// gán tháng
		System.out.println("ldate -> " + ldate);
		System.out.println("ldate format -> " + dtf.format(ldate));
		System.out.println("\n===============\n");
		// Calendar.SUNDAY -> 1
		// Calendar.MONDAY -> 2
				
		// DayOfWeek.Monday  -> 1
		// DayOfWeek.Tuesday -> 2
		LocalDate aDate = LocalDate.of(2024, Month.MARCH, 31)
				               .with(ChronoField.DAY_OF_WEEK, 5)
				               .plusWeeks(2)
				               .minusDays(3);
		System.out.println("aDate format -> " + dtf.format(aDate));
		
		System.out.println("hash(aDate): " + System.identityHashCode(aDate));
		// Cách 1: plus 1 day -> return this ==> ăn vào this hiện tại aDate
		// C2: plus 1 day -> return new object(Localdate) => ko ăn vào this hiện tại aDate
		//                -> muốn ăn vào aDate hiện tại thì phải gán lại
		aDate = aDate.plusDays(1);
		
		
	}

}
