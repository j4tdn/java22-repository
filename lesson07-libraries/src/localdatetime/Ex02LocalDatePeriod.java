package localdatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import static utils.DateUtils.*;

public class Ex02LocalDatePeriod {

	public static void main(String[] args) {
		//LocalDate.parse(...) -> default pattern ISO_LOCAL_DATE: yyyy/MM/dd
		//LocalDate.parse(string,dtf) -> pattern from dtf
		//dtf.parse(string)
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		LocalDate startDate = LocalDate.parse("25/03/2021", dtf);
		LocalDate endDate = LocalDate.parse("31/04/2024",dtf);
		
		//Tìm hiệu giữa 2 mốc thời gian (LocalDate)
		Period period = Period.between(startDate, endDate);
		System.out.println("period->" + period);
		
		String format = String.join("", 
				opt(period.getYears() , "year"),
				opt(period.getMonths() ,"month"),
				opt(period.getDays() , "day"));
				
		
		System.out.println("Khoảng thời gian: " + format);
	}
}
