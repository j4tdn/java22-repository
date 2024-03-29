package Ex03;
import Ultils.DateUtils;
import common.WKD_EGVN;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class CheckTime {
	public static void main(String[] args) {
		printCurrentDateTimeInTokyo();
		lastDayOfThisMonth();
		firstAndLastDay();
		currentDate();
		showTime();
		Scanner scanner = new Scanner(System.in);
        System.out.print("6. Nhập ngày sinh (dd/mm/yyyy): ");
        String inputDate = scanner.nextLine();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse(inputDate, dateFormatter);
        LocalDate currentDate = LocalDate.now();
        int daysLived = DaysLived(birthDate, currentDate);
        System.out.println("Số ngày đã sống được: " + daysLived + " ngày");
        scanner.close();
	}
	public static void printCurrentDateTimeInTokyo() {
		String formattedDateTimeTokyo = DateUtils.getDateTimeInZone("Asia/Tokyo", "dd/MM/yyyy HH:mm:ss");
        System.out.println("1. Ngày giờ hiện tại ở Tokyo, Nhật Bản: " + formattedDateTimeTokyo);
    }
	public static void showTime() {
		Calendar currentDate = Calendar.getInstance();
		currentDate.add(Calendar.DAY_OF_MONTH, 20);
		int dayOfMonth = currentDate.get(Calendar.DAY_OF_MONTH);
		int month = currentDate.get(Calendar.MONTH) + 1; 
		int year = currentDate.get(Calendar.YEAR);
		int dayOfWeek = currentDate.get(Calendar.DAY_OF_WEEK);
		WKD_EGVN day = WKD_EGVN.values()[dayOfWeek - 1];
		System.out.println("5. 20 ngày sau: " + day.getVnText() + ", ngày " + dayOfMonth + "/" + month + "/" + year);
	}

	public static void lastDayOfThisMonth() {
        Calendar currentDate = Calendar.getInstance();
        currentDate.set(Calendar.DAY_OF_MONTH, currentDate.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println("2. Ngày cuối cùng của tháng hiện tại: " + DateUtils.format(currentDate, "dd/MM/yyyy", Locale.getDefault()));
    }

	public static void currentDate() {
		Calendar cal = Calendar.getInstance();
		int date = cal.get(Calendar.WEEK_OF_YEAR);
		System.out.println("4. Ngày hiện tại thuộc tuần thứ: " + date);
	}
	public static void firstAndLastDay() {
		Calendar currentDate = Calendar.getInstance();
        currentDate.set(Calendar.DAY_OF_WEEK, currentDate.getFirstDayOfWeek());
        System.out.println("3. Ngày đầu tuần hiện tại: " + DateUtils.format(currentDate, "dd/MM/yyyy", Locale.getDefault()));
        currentDate.add(Calendar.DAY_OF_WEEK, 6);
        System.out.println("   Ngày cuối tuần hiện tại: " + DateUtils.format(currentDate, "dd/MM/yyyy", Locale.getDefault()));
	}
	public static int DaysLived(LocalDate birthDate, LocalDate currentDate) {
        Period period = Period.between(birthDate, currentDate);
        return period.getYears() * 365 + period.getMonths() * 30 + period.getDays();
    }
	
}
