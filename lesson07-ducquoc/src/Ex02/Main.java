package Ex02;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập ngày bạn muốn kiểm tra ");
		String inputDate = scanner.nextLine();
		LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		int dayOfYear = date.getDayOfYear();
	    System.out.println("Ngày " + inputDate + " là ngày thứ " + dayOfYear + " trong năm ");
	    int daysLeftInYear = date.lengthOfYear() - dayOfYear;
	    System.out.println("số ngày còn lại trong năm " + daysLeftInYear );
	    long mondaysInYear = date.datesUntil(date.plusYears(1), Period.ofDays(1)).filter(d -> d.getDayOfWeek() == DayOfWeek.MONDAY).count();
	    System.out.println(" có " + mondaysInYear + "ngày thứ 2");
	    int daysInYear = date.lengthOfYear();
	    System.out.println(" năm đó có " + daysInYear + " ngày");
	    int daysIn11 = date.withMonth(11).lengthOfMonth();
	    System.out.println(" số ngày của tháng 11 " + daysIn11 );
	    
	}
	 
}
