package datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import common.WKD_EGVN;
import util.DateUtils;

public class Ex04Practice {
	private static String[] WEEKDAYS = {"Chủ Nhật", "Thứ Hai", "Thứ ba", "Thứ tư", "Thứ năm", "Thứ sáu", "Thứ bảy"};
	public static void main(String[] args) {
		Date now = new Date();
		String formatted = DateUtils.format(now);
		System.out.println("1. In thong tin ngay thang nam voi DateFormat" + formatted);

		// c -> chua thong tin thoi gian hien tai (ngay, thang nam , gio, phut , giay)
		Calendar c = Calendar.getInstance();
//		System.out.println(c.getClass().getName());
		c.set(Calendar.MONTH, Calendar.FEBRUARY);
		c.set(Calendar.DAY_OF_MONTH, 23);		
		c.set(Calendar.YEAR, 2024);
		System.out.println(" 2. Thoong tin cuar bien c: " + DateUtils.format(c));

		// lay so ngay lon nhat
		int domMax = c.getMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Số ngày tối đa trong 1 tháng " + domMax);

		// lay so ngay lon nhat thuc su cua thang hien tai
		int domActualMax = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Số ngày tối đa trông tháng hiện tại: " + domActualMax);

		// lay so ngay lon nhat thuc su cua nam hien tai
		int doyActualMax = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("Số ngày tối đa trông năm hiện tại: " + doyActualMax);
		
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("3. Năm hiện tại phải năm nhuận không: "+ gc.isLeapYear(2024));
		
		// ngày hiện tại là thứ mấy
		// Một là dạng số: 1	2	3	4	5	6	7
		// hai là dạng chữ: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
		
		Calendar c1 = DateUtils.toCalendar("27.03.2024", "dd.MM.yyyy");
		
		int dowAsNumber = c1.get(Calendar.DAY_OF_WEEK);
		System.out.println("4. Ngày trông tuần(dạng số): " + dowAsNumber);
		System.out.println("4. Ngày trong tuần (dạng chữ): " + DateUtils.format(c1,"EEEE"));
		

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
