package datetimejava07.ex03;
import java.util.Calendar;
import java.util.Locale;

import util.DateUtils;

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
		public static void main(String[] args) {
			Locale locale = new Locale("en", "US");
			Calendar day = Calendar.getInstance();
			System.out.println("1. Thời gian hiện tại:" + DateUtils.format(day, locale));

			Calendar cloned = DateUtils.clone(day, locale);
			int lastDayOfMonth = day.getActualMaximum(Calendar.DAY_OF_MONTH);
			cloned.set(Calendar.DAY_OF_MONTH, lastDayOfMonth);
			System.out.println("2. In ngày cuối cùng của tháng hiện tại:" + DateUtils.format(cloned,"dd/MM/yyyy", locale));
			printDaysOfCurrentWeek(day,locale);
		}
		
		private static void printDaysOfCurrentWeek(Calendar c, Locale locale) {
			Calendar cloned = DateUtils.clone(c, locale);        // 03.04.2024

			int currentDow = cloned.get(Calendar.DAY_OF_WEEK); 
			int fdow = cloned.getFirstDayOfWeek();             
			
			Calendar beginningDayOfWeek = DateUtils.clone(c, locale); 
			beginningDayOfWeek.add(Calendar.DAY_OF_MONTH, fdow - currentDow);
			
			Calendar endDayOfWeek = DateUtils.clone(beginningDayOfWeek, locale);
			endDayOfWeek.add(Calendar.DAY_OF_MONTH, 6); 
			
			System.out.println("3. Ngày bắt đầu của tuần hiện tại: --> " + DateUtils.format(beginningDayOfWeek,"dd/MM/yyyy", locale));
			System.out.println("3 .Ngày kết thúc của tuần hiện tại: --> " + DateUtils.format(endDayOfWeek,"dd/MM/yyyy", locale));
			
		}
}
