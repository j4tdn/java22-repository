package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import common.WKD_EGVN;
import util.DateUtils;

public class Ex04Practice {
	
	/*
		 1. In thông tin ngày tháng năm với DateFormatter
		 2. Tháng, năm hiện tại có bao nhiêu ngày
		 3. Kiểm tra năm hiện tại có phải là năm nhuận không
		 4. Ngày hiện tại là ngày thứ mấy, in ra ngày theo tiếng việt
		 5. In thông tin các ngày trong tháng, tuần hiện tại
		    ---> dd/MM/yyyy week_day
		 6. Đếm xem trong tháng có bao nhiêu ngày chủ nhật và in ra
	 */
	
	private static String[] WEEKDAYS = {"Chủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ Năm", "Thứ Sáu", "Thứ Bảy"};
	
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println("1. In thông tin ngày tháng năm với DateFormatter "
							   + DateUtils.format(now));
	
		// c -> chứa thông tin của thời gian hiện tại
		//   -> biết được ngày, tháng, năm, giờ, phút, giây nào rồi
		Calendar c = Calendar.getInstance();
		// c.set(Calendar.MONTH, 1); // Dùng số từ 0 đến 11 hoặc dùng hằng số THÁNG có sẵn trong class Calendar
		c.set(Calendar.DAY_OF_MONTH, 23);
		c.set(Calendar.MONTH, Calendar.FEBRUARY);
		c.set(Calendar.YEAR, 2024);
		System.out.println("\n2. Thông tin của biến c: " + DateUtils.format(c));
		
		// Lấy số ngày trong tháng-năm bất kỳ
		
		// --> lấy số ngày lớn nhất trong tháng-năm --> 31(luôn luôn)
		int domMax = c.getMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Số ngày tối đa trong một tháng " + domMax + "(always)");
		
		// --> lấy số ngày lớn nhất thât sự trong tháng-năm của đối tượng 'c'
		int domActualMax = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Số ngày trong tháng hiện tại " + domActualMax);
		
		int doyActualMax = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("Số ngày trong năm hiện tại " + doyActualMax);
		
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("\n3. Năm hiện tại có phải là năm nhuận không: " + gc.isLeapYear(600));
	
		// Ngày hiện tại(bất kỳ từ KDL calendar) là ngày thứ mấy
		// Một là dạng số : 1         2        3       4           5        6        7 
		//             chữ: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
		
		Calendar c1 = DateUtils.toCalendar("27.03.2024", "dd.MM.yyyy");
		System.out.println("\n4. Thông tin của biến c1: " + DateUtils.format(c1));
		
		int dowAsNumber = c1.get(Calendar.DAY_OF_WEEK);
		System.out.println("4. Ngày trong tuần(dạng số): " + dowAsNumber);
		System.out.println("4. Ngày trong tuần(dạng chữ - format): " + DateUtils.format(c1, "EEEE"));
		
		// Nếu format, pattern không hỗ trợ locale, xử lý bằng cách nào ?
		
		String dowAsVnText = WEEKDAYS[dowAsNumber - 1];
		System.out.println("4. Ngày trong tuần(dạng chữ - logic array): " + dowAsVnText);
		
		// Tạo mảng KDL WKD_EGVN
		// WKD_EGVN[] wkds = {WKD_EGVN.SUNDAY, WKD_EGVN.MONDAY, WKD_EGVN.SATURDAY};
		
		// WKD_EGVN.values() -> lấy tất cả các giá trị của enum WKD_EGVN trả về mảng WKD_EGVN[]
		WKD_EGVN[] wkds = WKD_EGVN.values();
		WKD_EGVN dowAsEnum = wkds[dowAsNumber - 1];
		System.out.println("4. Ngày trong tuần(dạng chữ - logic enum): " + dowAsEnum.getVnText());
	}
	
	
	
}
