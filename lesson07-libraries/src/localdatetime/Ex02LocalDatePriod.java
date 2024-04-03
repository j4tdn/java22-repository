package localdatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

// import all static method, attribute of DateUtils
import static utils.DateUtils.*;

public class Ex02LocalDatePriod {

	public static void main(String[] args){

		// LocalDate.parse(...) -> default pattern ISO_LOCAL_DATE: yyyy/MM/dd
		// LocalDate.parse(string, dtf) -> pattern from dtf
		// dtf.parse(string)

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		// 25/02 -> 31/03 ==> P1M6D
		// 25/04 -> 31/05 ==>

		// 01/02 -> 01/03
		// 01/04 -> 01/05

		// + JAVA08 ==> 1M1D -> chính xác cho mình tháng, năm
		// + JAVA07 ==> 29 Days, 31 Days
		
		// PxYyMzD

		LocalDate startDate = LocalDate.parse("25/02/2022", dtf);
		LocalDate endDate = LocalDate.parse("20/03/2024", dtf);

		// Tìm hiệu giữa 2 mốc thời gian (LocalDate)

		Period period = Period.between(startDate, endDate);
		System.out.println("period: " + period);
		
		String format = String.join(" ", 
				opt(period.getYears() , "year"),
				opt(period.getMonths(), "month"), 
				opt(period.getDays()  , "day"));

		System.out.println("Khoảng thời gian:" + format);

	}
	
	

}
