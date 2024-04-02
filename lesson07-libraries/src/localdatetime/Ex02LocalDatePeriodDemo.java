package localdatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex02LocalDatePeriodDemo {

	public static void main(String[] args) {
		
		//LocalDate.parse(...) -> default pattern ISO_LOCAL_DATE : yyyy/MM/dd
		//LocalDate.parse(string , dtf) -> patter from dtf
		//dtf.parse(string)

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		
		LocalDate startDate = LocalDate.parse("25/04/2022", dtf);
		LocalDate endDate = LocalDate.parse("31/05/2024", dtf);
		
		
//		//Tìm hiệu giữa 2 mốc thời gian (LocalDate)
		Period period = Period.between(startDate, endDate);
		
		System.out.println("period: " + period);
		
		String format = period.getYears() + " year(s)"
					  + period.getMonths() + " month(s)"
					  + period.getDays() + " day(s)";
		
		System.out.println("Khoảng thời gian: " + format);
 	}
	
	
}
