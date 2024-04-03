package datetimejava8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào ngày (dd/MM/yyyy): ");
		String inputDate = scanner.nextLine();
		try {
            LocalDate ldate = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

			printDateInfo(ldate);

		} finally {

			scanner.close();

		}

	}

	public static void printDateInfo(LocalDate date) {
		Locale vnLocale = new Locale("vi", "vn");

		int dayOfYear = date.getDayOfYear();

		int daysLeftInYear = date.withDayOfYear(date.lengthOfYear()).getDayOfYear() - dayOfYear;
		//System.out.println(date);

		System.out.println("Ngày " + date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy", vnLocale)) + " là ngày thứ " + dayOfYear + " trong năm và còn " + daysLeftInYear
				+ " ngày nữa để hết năm.");

		DayOfWeek dayOfWeek = date.getDayOfWeek();

//		String[] dayNames = { "Chủ nhật", "Thứ hai", "Thứ ba", "Thứ tư", "Thứ năm", "Thứ sáu", "Thứ bảy" };
//
//     	int dayOfWeekOfYear = (date.get(Calendar.WEEK_OF_YEAR) - 1) * 7 + dayOfWeek;
//
		int weeksOfMonth = (date.getDayOfMonth() - 1) / 7 + 1;
		int daysOfMonth = date.lengthOfMonth();

		int daysnumberOfyear = date.lengthOfYear();

		System.out.println("Ngày " + date + " là ngày thứ " + dayOfWeek + " thứ " + weeksOfMonth + " trong tháng " );

		System.out.println("Năm " + date.getYear() + " có " + daysnumberOfyear + " ngày ");
		System.out.println("Tháng " + date.getMonth() + " có " + daysOfMonth + " ngày ");
	    


	}

}
