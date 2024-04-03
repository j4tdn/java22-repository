package datetimejava08;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Ex03DateFunctions {

	static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		// 1. Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ.
		Locale locale = Locale.US;
		printDateCurrent(LocalDateTime.now(), locale);		
		// 2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).
		printTheLastDayOfMonthCurrent(LocalDateTime.now());
		// 3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại.
		displayFirstdayAndLastdayOfCurrentWeek();
		// 4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm.
		displayDayOfWeekOfYear();
		// 5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.
		displayDayThatAfter20days();
		// 6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày.
		displayNumberOfDaysYouLived();
	}
	
	private static void printDateCurrent(LocalDateTime datetime, Locale locale) {
		Locale.setDefault(locale);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
		String sDate = dtf.format(datetime);
		System.out.println(sDate);
	}
	
	private static void printTheLastDayOfMonthCurrent(LocalDateTime localDateTime) {
		LocalDate localDate = localDateTime.toLocalDate();
		System.out.println("Ngày cuối cùng của tháng hiện tại: " + localDate.lengthOfMonth() 
							+ "/" + localDate.getMonthValue() + "/" + localDate.getYear());
	}
	
	private static void displayFirstdayAndLastdayOfCurrentWeek() {
        LocalDate currentDate = LocalDate.now();
        DayOfWeek firstDayOfWeek = DayOfWeek.MONDAY; // Chọn ngày đầu tiên của tuần
        DayOfWeek lastDayOfWeek = DayOfWeek.SUNDAY; // Chọn ngày cuối cùng của tuần
        LocalDate firstDayOfWeekDate = currentDate.with(DayOfWeek.MONDAY);
        LocalDate lastDayOfWeekDate = currentDate.with(DayOfWeek.SUNDAY);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedFirstDay = firstDayOfWeekDate.format(dtf);
        String formattedLastDay = lastDayOfWeekDate.format(dtf);
        System.out.println("Ngày đầu tiên trong tuần hiện tại: " + formattedFirstDay);
        System.out.println("Ngày cuối cùng trong tuần hiện tại: " + formattedLastDay);
    } 
	
	private static void displayDayOfWeekOfYear() {
		LocalDate currentDate = LocalDate.now();
		int dayOfYear = currentDate.getDayOfYear();
		  System.out.println("Ngày hiện tại đang là ngày " + dayOfYear + " trong năm");
	}
	
	private static void displayDayThatAfter20days() {
        LocalDate currentDate = LocalDate.now();
        LocalDate after20Days = currentDate.plusDays(20);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = after20Days.format(dtf);
        System.out.println("Số ngày sau 20 ngày nữa là:  " + formattedDate);
    }

	private static void displayNumberOfDaysYouLived() {
        System.out.println("Your birthday: (dd/MM/yyyy)");
        String birthday = ip.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthdayDate = LocalDate.parse(birthday, dtf);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthdayDate, currentDate);
        int daysAlive = period.getDays();
        int monthsAlive = period.getMonths();
        int yearsAlive = period.getYears();
        System.out.println("Số ngày bạn đã sống là " + daysAlive + " ngày, " + monthsAlive + " tháng, " + yearsAlive + " năm.");
    }
}
