package localdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class Ex01LocalDate {
	
	/*
	 * LocalDate ---> Ngày tháng năm
	 * 			-->Ngày trong tháng,năm
	 *          -->Tuần
	 *          -->Ngày trong tuần
	 * 	 */
	
	public static void main(String[] args) {
		//util Date --> Date date = new Date();             -->constructor
		//		    -->Calendar c = Calendar.getInstance(); -->singleton
		//LocalDate, LocalTime, LocalDatetime               -->builder pattern
	
		Locale vnLocale=new Locale("vi","vn");
//		Locale usLocale=new Locale("en","us");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy EEEE",vnLocale);
		//LocalDate.now(); -> lấy ngày tháng năm hiện tại theo system
//		LocalDate ldate = LocalDate.now();
		
		//normal class
		//setter --> setField(value) -> return void
		
		//builder patter--> 
		//setter --> withField(value) --> return this
		LocalDate ldate = LocalDate.now()
						.withDayOfMonth(15)
						.withMonth(4);
		System.out.println("ldate-->" + ldate);
		System.out.println("ldate format-->" + dtf.format(ldate));
		System.out.println("\n====================================================\n");
		//c.set(field,value)
		//Calendar.SUNDAY -->1
		
		//DayOfWeek.SUNDAY -->7
		
		LocalDate aDate = LocalDate.of(2024, Month.MARCH, 31)
									.with(ChronoField.DAY_OF_WEEK, 5)  //29/03
									.plusWeeks(2)            //+
									.minusDays(3); // 09/04    -
									//.with(ChronoField.SECOND_OF_MINUTE, 42); -->unsuported field
		
		System.out.println("aDate 1: " + dtf.format(aDate));
		System.out.println("hash(aDate) before: "
				+ System.identityHashCode(aDate));//cập nhật địa chỉ
		
		//Cách 1:
		//plus 1 day ->return this ==> ăn vào this hiện tại aDate
		
		//Cách 2:
		//plus 1 day-> return new object -> ko ăn this hiện tại
//		           --> muốn ăn vào aDate thì phải gán lại
		aDate = aDate.plusDays(1);
		
		System.out.println("aDate 2: " + dtf.format(aDate));
		System.out.println("hash(aDate) after: "
				+ System.identityHashCode(aDate));//cập nhật địa chỉ
		
	}

}
