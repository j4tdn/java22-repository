package datetimejava08;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Ex02 {
	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập vào ngày(dd/MM/yyyy): ");
		String ipDay = ip.nextLine();
		while (true) {
			try {
				LocalDate ldate = LocalDate.parse(ipDay,dtf);
				checkDate(ldate);
				break;
			} catch (DateTimeParseException e) {
                System.out.println("Bạn đã nhập sai định dạng, nhập lại (dd/MM/yyyy)");
			}
			ip.close();
			
		}
		
	}
	public static void checkDate(LocalDate ldate) {
		int dayOfYear = ldate.getDayOfYear();
		//tính số ngày còn lại trong năm
		int dayLeft = ldate.withDayOfYear(ldate.lengthOfYear()).getDayOfYear();
		System.out.println("It is day number " + dayOfYear + " of the year, "
		+ dayLeft + " days left");
		
		DayOfWeek dayOfWeek = ldate.getDayOfWeek();
		//tính số tuần của tháng
		int weeksOfMonth = (ldate.getDayOfMonth() - 1) / 7 + 1;
		int daysOfMonth = ldate.lengthOfMonth();

		int daysnumberOfyear = ldate.lengthOfYear();

		System.out.println("It is " + dayOfWeek + " number " + weeksOfMonth + " out of");

		System.out.println("Year " + ldate.getYear() + " has " + daysnumberOfyear + " days");
		System.out.println(ldate.getMonth() + " has " + daysOfMonth + " days ");
	}

}
