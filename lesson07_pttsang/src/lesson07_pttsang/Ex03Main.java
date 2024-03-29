package lesson07_pttsang;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;
import java.util.Scanner;

	public class Ex03Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        displayCurrentTime();
	        
	        displayLastDayOfMonth();
	        
	        displayFirstAndLastDayOfWeek();
	        
	        displayCurrentWeekNumber();
	       
	        displayDateAfter20Days();
	        
	        displayDaysLived(scanner);
	        
	        scanner.close();
	    }

	 
	    public static void displayCurrentTime() {
	        LocalDateTime currentTime = LocalDateTime.now();
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	        String formattedTime = currentTime.format(formatter);
	        System.out.println("\n1.Thời gian hiện tại: " + formattedTime);
	    }

	   
	    public static void displayLastDayOfMonth() {
	        LocalDate currentDate = LocalDate.now();
	        LocalDate lastDayOfMonth = currentDate.with(TemporalAdjusters.lastDayOfMonth());
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        String formattedLastDay = lastDayOfMonth.format(formatter);
	        System.out.println("\n2.Ngày cuối cùng của tháng hiện tại: " + formattedLastDay);
	    }

	    
	    public static void displayFirstAndLastDayOfWeek() {
	        LocalDate currentDate = LocalDate.now();
	        LocalDate firstDayOfWeek = currentDate.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
	        LocalDate lastDayOfWeek = currentDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        String formattedFirstDay = firstDayOfWeek.format(formatter);
	        String formattedLastDay = lastDayOfWeek.format(formatter);
	        System.out.println("\n3.Ngày đầu tiên của tuần hiện tại: " + formattedFirstDay);
	        System.out.println(" Ngày cuối cùng của tuần hiện tại: " + formattedLastDay);
	    }

	    
	    public static void displayCurrentWeekNumber() {
	        LocalDate currentDate = LocalDate.now();
	        int weekNumber = currentDate.get(WeekFields.ISO.weekOfWeekBasedYear());
	        System.out.println("\n4.Ngày hiện tại đang ở tuần thứ " + weekNumber + " trong năm.");
	    }

	   
	    public static void displayDateAfter20Days() {
	        LocalDate currentDate = LocalDate.now();
	        LocalDate dateAfter20Days = currentDate.plusDays(20);
	        DayOfWeek dayOfWeek = dateAfter20Days.getDayOfWeek();
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        String formattedDate = dateAfter20Days.format(formatter);
	        System.out.println("\n5.Sau 20 ngày nữa là ngày " + formattedDate + ", thứ " + dayOfWeek.getValue());
	    }

	    public static void displayDaysLived(Scanner scanner) {
	        System.out.println("Nhập ngày tháng năm sinh (dd/MM/yyyy):");
	        String input = scanner.nextLine();
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        LocalDate birthDate = LocalDate.parse(input, formatter);
	        LocalDate currentDate = LocalDate.now();
	        long daysLived = ChronoUnit.DAYS.between(birthDate, currentDate);
	        System.out.println("\n6.Bạn đã sống được " + daysLived + " ngày.");
	    }
	}



