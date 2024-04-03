package datetimejava8.ex03;

import static util.DateUtils.opt;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import common.WKD_EGVN;

public class Main {
	/*
	 * Viết chương trình, mỗi chức năng một phương thức
			1. Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ.
			2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).
			3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại.
			4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm.
			5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.
			6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày.
	 */
		private static DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		public static void main(String[] args) {
			Locale locale = new Locale("en", "US");
			LocalDate day = LocalDate.now();
			System.out.println("1. Thời gian hiện tại: " + day);

			System.out.println("2. In ngày cuối cùng của tháng hiện tại: " + day.plusMonths(1).withDayOfMonth(1).minusDays(1));
			LocalDate fdow = FirstDayOfWeek(day, locale);
			System.out.println("3. Ngày bắt đầu của tuần hiện tại: --> " + fdow);
			System.out.println("3. Ngày kết thúc của tuần hiện tại: --> " + LastDayOfWeek(day, locale));
			System.out.println("4. Ngày "+ day + " nàm trong tuần thứ " + ((day.getDayOfYear()+6)/7)+ " trong năm");
			LocalDate aday = day.plusDays(20);
			WKD_EGVN wkd = WKD_EGVN.valueOf(aday.getDayOfWeek().toString());
			System.out.println("5. Sau 20 ngày nửa là ngày: "+ aday+ " là "+ wkd.getVnText());
			System.out.println("6. Hãy nhập ngày sinh:");
			LocalDate birthdate = input();
//			timeCaculating(birthdate,day);
		}
		
		private static LocalDate FirstDayOfWeek(LocalDate day, Locale locale) {

			int currentDow = day.getDayOfWeek().getValue(); // Thu3 => 3
			int fdayInt = day.getDayOfMonth()-currentDow +2;
			LocalDate fday = day.withDayOfMonth(fdayInt);
			return fday;
		}
		private static LocalDate LastDayOfWeek(LocalDate day, Locale locale) {

			int currentDow = day.getDayOfWeek().getValue(); // Thu3 => 3
			int ldayInt = day.getDayOfMonth()-currentDow +8;
			LocalDate lday = day.withDayOfMonth(ldayInt);
			return lday;		
		}
		private static LocalDate input() {
			Scanner ip = new Scanner(System.in);
			LocalDate day = LocalDate.now();
			String dayStr = "";
			while(true) {
				dayStr = ip.nextLine();
				try {
					day = LocalDate.parse(dayStr, dft);
					break;
				}catch (Exception e) {
					System.out.println("Lỗi định dạng 'dd/MM/yyy' khi nhập ");
					System.out.println("--> Hãy nhập lại 0_0 ");
				}
			}
			return day;
		}
		private static void timeCaculating(LocalDate startDate, LocalDate endDate) {

			Period period = Period.between(startDate, endDate);
			
			System.out.println("   Bạn đã sống được: "+format(period));
		}
		private static String format(Period period) {
			return String.join(" ", 
					opt(period.getYears() , "năm"),
					opt(period.getMonths(), "tháng"), 
					opt(period.getDays()  , "ngày"));
		}
}
