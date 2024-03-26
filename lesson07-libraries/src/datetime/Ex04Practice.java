package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import common.WKD_EGVN;
import utils.DateUtils;

public class Ex04Practice {

	/*
	 * 1. In thông tin ngày tháng năm với DateFormatter 2. Tháng, năm hiện tại có
	 * bao nhiêu ngày 3. Kiểm tra năm hiện tại có phải là năm nhuận không 4. Ngày
	 * hiện tại là ngày thứ mấy, in ra ngày theo tiếng việt 5. In thông tin các ngày
	 * trong tháng, tuần hiện tại ---> dd/MM/yyyy week_day 6. Đếm xem trong tháng có
	 * bao nhiêu ngày chủ nhật và in ra
	 */

	private static String[] WEEKDAYS = { "Chủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ Năm", "Thứ Sáu", "Thứ Bảy" };

	public static void main(String[] args) {
		Locale locale = new Locale("en", "US");

		Date now = new Date();
		System.out.println("1. In thông tin ngày tháng năm với DateFormatter " + DateUtils.format(now, locale));

		// c -> chứa thông tin của thời gian hiện tại
		// -> biết được ngày, tháng, năm, giờ, phút, giây nào rồi
		Calendar c = Calendar.getInstance();
		// c.set(Calendar.MONTH, 1); // Dùng số từ 0 đến 11 hoặc dùng hằng số THÁNG có
		// sẵn trong class Calendar
		c.set(Calendar.DAY_OF_MONTH, 23);
		c.set(Calendar.MONTH, Calendar.FEBRUARY);
		c.set(Calendar.YEAR, 2024);
		System.out.println("\n2. Thông tin của biến c: " + DateUtils.format(c, locale));

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
		// Một là dạng số : 1 2 3 4 5 6 7
		// chữ: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday

		Calendar c1 = DateUtils.toCalendar("27.03.2024", "dd.MM.yyyy", locale);
		System.out.println("\n4. Thông tin của biến c1: " + DateUtils.format(c1, locale));

		int dowAsNumber = c1.get(Calendar.DAY_OF_WEEK);
		System.out.println("4. Ngày trong tuần(dạng số): " + dowAsNumber);
		System.out.println("4. Ngày trong tuần(dạng chữ - format): " + DateUtils.format(c1, "EEEE", locale));

		// Nếu format, pattern không hỗ trợ locale, xử lý bằng cách nào ?

		String dowAsVnText = WEEKDAYS[dowAsNumber - 1];
		System.out.println("4. Ngày trong tuần(dạng chữ - logic array): " + dowAsVnText);

		// Tạo mảng KDL WKD_EGVN
		// WKD_EGVN[] wkds = {WKD_EGVN.SUNDAY, WKD_EGVN.MONDAY, WKD_EGVN.SATURDAY};

		// WKD_EGVN.values() -> lấy tất cả các giá trị của enum WKD_EGVN trả về mảng
		// WKD_EGVN[]
		WKD_EGVN[] wkds = WKD_EGVN.values();
		WKD_EGVN dowAsEnum = wkds[dowAsNumber - 1];
		System.out.println("4. Ngày trong tuần(dạng chữ - logic enum): " + dowAsEnum.getVnText());

		// c = c2 -> 20.03.2024
		Calendar c2 = DateUtils.toCalendar("20.03.2024", "dd.MM.yyyy", locale);
		System.out.println("\n5. Thông tin của biến c2: " + DateUtils.format(c2, locale));

		System.out.println("5.Các ngày trong tháng hiện tại");
		printDaysOfCurrentMonth(c2, locale);

		System.out.println("\n5. Thông tin của biến c2(cloned, ko đổi): " + DateUtils.format(c2, locale));

		int fdow = c2.getFirstDayOfWeek();
		System.out.println("Thông tin ngày đầu tuần (chủ nhật || thứ hai phụ thuộc vào Locale): " + fdow);
		System.out.println("Thông tin ngày đầu tuần (chủ nhật || thứ hai phụ thuộc vào Locale): " + wkds[1]);

		System.out.println("5.Các ngày trong tuần hiện tại");
		printDaysOfCurrentWeek(c2, locale);

		Calendar c3 = Calendar.getInstance();
		System.out.println("\n5. Thông tin của biến c3: " + DateUtils.format(c3, locale));
	}

	private static int countSundaysOfMonth(Calendar c) {
		Calendar startDayOfMonth = DateUtils.clone(c);
		startDayOfMonth.set(Calendar.DAY_OF_MONTH, 1); // 01.03.2024

		Calendar endDayOfMonth = DateUtils.clone(c);
		endDayOfMonth.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH) + 1); // 31.03.2024

		int count = 0;
		Calendar cal = startDayOfMonth;
		while (cal.before(endDayOfMonth)) {
			int dow = cal.get(Calendar.DAY_OF_WEEK);
			if (dow == Calendar.SUNDAY) {
				cal.add(Calendar.DAY_OF_MONTH, 7);
				count++;
				continue;
			}
			cal.add(Calendar.DAY_OF_MONTH, 1);
		}
		return count;

	}

	private static void printDaysOfCurrentWeek(Calendar c, Locale locale) {
		Calendar cloned = DateUtils.clone(c, locale);
		int currentDom = cloned.get(Calendar.DAY_OF_MONTH);
		int currentDow = cloned.get(Calendar.DAY_OF_WEEK);
		int fdow = cloned.getFirstDayOfWeek();
		// int beginningDayOfWeek = currentDom + fdow - currentDow;

		Calendar beginningDayOfWeek = DateUtils.clone(c, locale);
		beginningDayOfWeek.add(Calendar.DAY_OF_MONTH, fdow - currentDow);

		Calendar endDayOfWeek = DateUtils.clone(beginningDayOfWeek, locale);
		endDayOfWeek.add(Calendar.DAY_OF_MONTH, 7);

		System.out.println("beginningDayOfWeek --> " + DateUtils.format(beginningDayOfWeek, locale));
		System.out.println("beginningDayOfWeek --> " + DateUtils.format(endDayOfWeek, locale));

	}

	private static void printDaysOfCurrentMonth(Calendar c, Locale locale) {
		Calendar cloned = DateUtils.clone(c, locale);
		int firstDayOfMonth = 1; // ngày đầu tháng
		int lastDayOfMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);

		for (int day = firstDayOfMonth; day <= lastDayOfMonth; day++) {
			cloned.set(Calendar.DAY_OF_MONTH, day);
			System.out.println(day + " --> " + DateUtils.format(c, "dd/MM/yyyy EEEE", locale));
		}
	}

}