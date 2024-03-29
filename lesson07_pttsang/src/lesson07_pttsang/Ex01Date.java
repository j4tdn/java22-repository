package lesson07_pttsang;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

	public class Ex01Date {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Nhập thời gian bắt đầu hẹn hò của người thứ nhất (yyyy/MM/dd HH:mm:ss):");
	        LocalDateTime startDateTimePerson1 = LocalDateTime.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

	        System.out.println("Nhập thời gian bắt đầu hẹn hò của người thứ hai (yyyy/MM/dd HH:mm:ss):");
	        LocalDateTime startDateTimePerson2 = LocalDateTime.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

	        
	        System.out.println("Ngày chia tay (nếu chưa chia tay, nhấn Enter):");
	        String breakupDateInput = scanner.nextLine();
	        LocalDateTime breakupDateTime;
	        if (breakupDateInput.isEmpty()) {
	            breakupDateTime = LocalDateTime.now(); 
	        } else {
	            breakupDateTime = LocalDateTime.parse(breakupDateInput + " 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
	        }

	      
	        calculateRelationship(startDateTimePerson1, startDateTimePerson2, breakupDateTime);

	        scanner.close();
	    }

	    public static void calculateRelationship(LocalDateTime startDateTimePerson1, LocalDateTime startDateTimePerson2, LocalDateTime breakupDateTime) {
	       
	        LocalDate startDate = startDateTimePerson1.toLocalDate().isBefore(startDateTimePerson2.toLocalDate()) ? startDateTimePerson1.toLocalDate() : startDateTimePerson2.toLocalDate();
	        LocalDate endDate = breakupDateTime.toLocalDate();
	        long daysBetween = Duration.between(startDate.atStartOfDay(), endDate.atStartOfDay()).toDays();
	        int relationshipDayOfWeek = (int) ((daysBetween % 7) + 1);

	      
	        Duration duration = Duration.between(startDateTimePerson1, breakupDateTime);
	        long years = duration.toDays() / 365;
	        long months = (duration.toDays() % 365) / 30;
	        long days = (duration.toDays() % 365) % 30;
	        long hours = duration.toHours() % 24;
	        long minutes = duration.toMinutes() % 60;
	        long seconds = duration.getSeconds() % 60;

	        System.out.println("Ngày bắt đầu hẹn hò là ngày thứ: " + relationshipDayOfWeek);
	        System.out.println("Mối tình đã bắt đầu được: " + years + " năm, " + months + " tháng, " + days + " ngày, " + hours + " giờ, " + minutes + " phút, " + seconds + " giây.");
	    }
	}



