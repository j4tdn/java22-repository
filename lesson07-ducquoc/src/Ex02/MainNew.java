package Ex02;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class MainNew {
	public static void main(String[] args) {
		System.out.println(" nhập ngày bạn cần kiểm tra ");
		Scanner sc = new Scanner(System.in);
			String aDate = sc.nextLine()	;
			Locale vnLocale = new Locale("vi", "vn");
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy", vnLocale);
			LocalDate date = LocalDate.parse(aDate , dtf);
			int dayOfyear = date.getDayOfYear()	;
			 int daysInYear = date.lengthOfYear();
			 int daysRemaining = daysInYear - dayOfyear;
			System.out.println("ngày bạn muốn kiểm tra là ngày thứ  " + dayOfyear + " còn lại  "+ daysRemaining);
			DayOfWeek dayOfWeek = date.getDayOfWeek();
			System.out.println(" đó là ngày thứ " + dayOfWeek +" trong tuần");
			int lenghtOfYear = date.lengthOfYear();
			System.out.println("năm đó có " + lenghtOfYear);
			int lenghtOfMonth = date.lengthOfMonth()	;
			System.out.println("tháng đó có " + lenghtOfMonth);
			
	} 
}
