package localdatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import static util.DateUtils.*;

public class Ex02LocalDatePeriod {
	public static void main(String[] args) {
		
		//LocalDate.parse(String) -> default pattern ISO_LOCAL_DATE: yyyy/MM/dd
		//LocalDate.parse(String, dft) -> pattern from dft
		//dft.parse(String)
		
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate startDate = LocalDate.parse("25/04/2022",dft);
		LocalDate endate = LocalDate.parse("31/05/2024",dft);
//		LocalDate enđate = LocalDate.now();
		
		//Tìm hiệu giữa 2 mốc tg (localDate)
		Period period = Period.between(startDate, endate);
		System.out.println("period: "+ period);
		
		String format = String.join(" ", 
										opt(period.getYears(), "year") 
										,opt(period.getMonths(),"month")
										,opt(period.getDays(), "day")) ;
		
		System.out.println(" Khoảng thời gian: " + format);
	}
	
	
}
