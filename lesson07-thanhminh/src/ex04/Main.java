package ex04;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		LocalDate startDate = LocalDate.of(2022, 6, 7);
		int workDays = 110;
		
		LocalDate deadlineDate = calDeadline(startDate, workDays);
		System.out.println("Ngày bàn giao sản phẩm là: " + deadlineDate);
		
	}
	public static LocalDate calDeadline(LocalDate startDate, int workDays) {
		LocalDate deadlineDate = startDate;
		int addDays = 0;
		while (addDays < workDays) {
			deadlineDate = deadlineDate.plusDays(1);
			if (!(deadlineDate.getDayOfWeek() == DayOfWeek.SATURDAY ||
				deadlineDate.getDayOfWeek() == DayOfWeek.SUNDAY)) {
				++addDays;
			}
		}
		return deadlineDate;
	} 
}
