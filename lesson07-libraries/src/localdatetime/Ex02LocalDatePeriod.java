package localdatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import static Utils.DateUtils.*;

public class Ex02LocalDatePeriod {
	public static void main(String[] args) {
		// LocalDate.parse(string)      -> default pattern ISO_LOCAL_DATE: yyyy/MM/dd
		// LocalDate.parse(string, dtf) -> patter from dtf
		// dtf.parse(string)
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate startDate = LocalDate.parse("25/02/2022", dtf);
		LocalDate endDate = LocalDate.now();
		
		// Tìm hiệu giữ 2 mốc thời gian
		
		Period period = Period.between(startDate, endDate);
		System.out.println("period: " + period);
		
		String format = String.join(" ", opt(period.getYears() , "year"), 
				opt(period.getMonths(), "month"), opt(period.getDays(), "day"));
				   
		System.out.println("Khoảng thời gian: " + format);
	}
	

}
