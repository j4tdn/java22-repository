package ex02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale vnLocale = new Locale("vi", "VN");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy", vnLocale);
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập thời gian(dd/MM/yyy):");
		String dateStr = sc.nextLine();
		LocalDate date = LocalDate.parse(dateStr, dtf);
		
		String dayOfWeek = date.getDayOfWeek().toString();
		int dayOfYear = date.getDayOfYear();
		int lengthOfMonth = date.lengthOfMonth();
		int lengthOfYear = date.lengthOfYear();
		
		System.out.println("Date: " + date);
		System.out.println("Ngày đó là ngày: " + dayOfWeek);
		System.out.println("Ngày thứ: " + dayOfYear + " trong năm");	
		System.out.println("Năm đó có: " + lengthOfYear + " ngày");
		System.out.println("Tháng đó có: " + lengthOfMonth + " ngày");
	}

}
