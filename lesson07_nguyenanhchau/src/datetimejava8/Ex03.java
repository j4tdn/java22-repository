package datetimejava8;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex03 {
/*
 * 
 Viết chương trình, mỗi chức năng một phương thức
1. Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ.
2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).
3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại.
4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm.
5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.
6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày.
 */
	public static void main(String[] args) {
		lastdayOfmonth();
		dateAfter20Days();
		lastfirstDay();
		weekOfyear();
		calculateDate();

		
	}
	public static void lastdayOfmonth() {
	LocalDate ldate = LocalDate.now(); // 7/4/2003
	System.out.println("Ngày cuối cùng của tháng hiện tại :"+ldate.withDayOfMonth(ldate.lengthOfMonth()).getDayOfMonth());  
	}
	public static void dateAfter20Days() {
        LocalDate ldate = LocalDate.now();
        LocalDate l20Days = ldate.plusDays(20);
        System.out.println("Sau 20 ngày nữa là ngày: " + l20Days.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Thứ của ngày đó là: " + l20Days.getDayOfWeek());
    }
	public static void lastfirstDay() {
		LocalDate date = LocalDate.now();
		LocalDate fdateOfweek = date.with(DayOfWeek.MONDAY);
		LocalDate ldateOfweek = fdateOfweek.plusDays(6);
		System.out.println("Ngày đầu tiên của tuần hiện tại: " + fdateOfweek.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	    System.out.println("Ngày cuối cùng của tuần hiện tại: " + ldateOfweek.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}
	public static void weekOfyear() {
        LocalDate ldate = LocalDate.now();
        int numberOfweek = ldate.getDayOfYear() / 7   ;
        System.out.println("Đây là tuần thứ " + numberOfweek + " trong năm ");
	}
	public static void calculateDate() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào ngày tháng năm sinh (dd/MM/yyyy): ");
		String input = scanner.nextLine();

		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ldate = LocalDate.now();
		LocalDate bdate = LocalDate.parse(input, dateFormat);
		
		try {
			Period period = Period.between(bdate, ldate);
			//CHƯA XỬ LÝ ĐƯỢC VẤN ĐỀ NĂM NHUẬN VÀ THÁNG CÓ 29,30 NGÀY .
		    int numberdaysOflife = period.getYears() * 365 + period.getMonths() * 30 + period.getDays();
			System.out.println("Số ngày bạn đã sống: " + numberdaysOflife  );

		} catch (Exception e) {
			System.out.println("Định dạng không hợp lệ!");
		} finally {
			scanner.close();
		}
	}
	


}
