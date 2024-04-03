package ex03;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;
import java.util.Locale;
import java.util.Scanner;

public class Main08 {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime date = LocalDateTime.now();
		System.out.println("Thời gian hiện tại là: " + dtf.format(date));
		
		LocalDate lastDayOfMonth = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());		
		System.out.println("Ngày cuối cùng trong tháng là: " + lastDayOfMonth);
		
		LocalDate today = LocalDate.now();
		LocalDate startOfWeek = today.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
	    LocalDate endOfWeek = today.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
	    System.out.println("Ngày đầu tuần là: " + startOfWeek);
        System.out.println("Ngày cuối tuần là: " + endOfWeek);
        
        int weekOfYear = today.get(WeekFields.of(Locale.getDefault()).weekOfYear());
        System.out.println("Tuần hiện tại là tuần thứ " + weekOfYear + " trong năm");
        
        LocalDate dateAfter20Days = today.plusDays(20);
        System.out.println("Sau 20 ngày là ngày: " + dateAfter20Days + " là "
            + dateAfter20Days.getDayOfWeek());
        
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ngày sinh(dd/MM/yyyy): ");       
        String birthDateStr = sc.nextLine();
        LocalDate birthDate = LocalDate.parse(birthDateStr, dtf1);
        long daysLived = birthDate.until(today, ChronoUnit.DAYS);
        System.out.println("Bạn đã sống " + daysLived + " days.");
		 
	}
	
}
