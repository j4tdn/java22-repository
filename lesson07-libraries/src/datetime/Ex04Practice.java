package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import common.WKD_EGVN;
import util.DateUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Ex04Practice {

	/*
	 
	 */
	
	private static String[] WEEKDAYS = {"Chủ nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ năm", "Thứ sáu", "Thứ bảy"};
	
	
	public static void main(String[] args) {
		
//		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale locale = new Locale("en", "US");
		
		
		Date now = new Date();
		
		System.out.println("1. in thong tin ngay thang nam " 
		+ DateUtils.format(now, locale));
		
		Calendar c = Calendar.getInstance();
		c.set(Calendar.MONTH, 1);
		System.out.println("2. Thông tin của biến c: " + DateUtils.format(c, locale));
		
		//Lấy số ngày trong tháng, năm bất kỳ
		int domMax = c.getMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Số ngày tối đa trong 1 tháng " + domMax + "(always)");
		
		int domActualMax = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Số ngày trong tháng hiện tại " + domActualMax);
		
		int doyActualMax = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("Số ngày trong năm hiện tại " + doyActualMax);
		
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("3. Năm hiện tại có phải là năm nhuận không: " + gc.isLeapYear(2024));
		
		Calendar c1 = DateUtils.toCalendar("25.03.2024", "dd.MM.yyyy");
		System.out.println("\n4. Thông tin của biến c1: " + DateUtils.format(c1, locale));
		
		int dowAsNumber = c1.get(Calendar.DAY_OF_WEEK);
		System.out.println("4. Ngày trong tuần(dạng số): " + dowAsNumber);
		System.out.println("4. Ngày trong tuần(dạng chữ - format): " + DateUtils.format(c1, "EEEE" , locale));
		
		String dowAsVnText = WEEKDAYS[dowAsNumber - 1];
		System.out.println("4. Ngày trong tuần(dạng chữ - logic array): " + dowAsVnText);
		//Nếu format , pattern ko hỗ trợ locale, xử lý bằng cách nào ? 
		
		WKD_EGVN[] wkds = WKD_EGVN.values();
		WKD_EGVN dowAsEnum = wkds[dowAsNumber - 1];
		System.out.println("4. Ngày trong tuần (dạng chữ - logic enum): " + dowAsEnum.getVnText());
		
		//20.03.2024 -> Thứ 4
		Calendar c2 = DateUtils.toCalendar("20.03.2024", "dd.mm.yyyy");
		System.out.println("\n5. Thoong tin cua bien c2 : " + DateUtils.format(c2, locale));
		System.out.println("\n5. Các ngay trong thang hien tai");
		printDayOfCurrentMonth(c2, locale);
		
		System.out.println("\n5. Thoong tin cua bien c2 : " + DateUtils.format(c2, locale));
		
		int fdow = c2.getFirstDayOfWeek();
		System.out.println("Thông tin ngày đầu tuần(Chủ nhật || Thứ Hai phụ thuộc vào Locale) " + fdow);
		System.out.println("Thông tin ngày đầu tuần(Chủ nhật || Thứ hai phục thuộc vào Locale" + wkds[fdow-1].getVnText());
	}
	
	
	
	
	
	
	private static void prinDayOfCurrentWeek(Calendar c, Locale locale) {
		Calendar cloned = DateUtils.clone(c, locale);
		int currentDow = cloned.get(Calendar.DAY_OF_WEEK);
		int fdow = cloned.getFirstDayOfWeek();
		
		Calendar beginningDayOfWeek = DateUtils.clone(c, locale);
		beginningDayOfWeek.add(Calendar.DAY_OF_MONTH, fdow - currentDow);
		
		Calendar endDayOfWeek = DateUtils.clone(beginningDayOfWeek, locale); // 31.03.2024: Sunday
		endDayOfWeek.add(Calendar.DAY_OF_MONTH, 7); // 07.04.2024: Sunday
		
		System.out.println("beginningDayOfWeek --> " + DateUtils.format(beginningDayOfWeek, locale));
		System.out.println("endDayOfWeek --> " + DateUtils.format(endDayOfWeek, locale));
		
		for (Calendar cal = beginningDayOfWeek; cal.before(endDayOfWeek); cal.add(Calendar.DAY_OF_MONTH, 1)) {
			System.out.println(DateUtils.format(cal, "dd/MM/yyyy EEEE", locale));
		}
	}
	
	private static int countSundayOfMonth(Calendar c) {
		Calendar startDayOfMonth = DateUtils.clone(c);
		startDayOfMonth.set(Calendar.DAY_OF_MONTH, 1);
		
		Calendar endDayOfMonth = DateUtils.clone(c);
		endDayOfMonth.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		int count = 0;
		Calendar cal = startDayOfMonth;
		while ( cal.before(endDayOfMonth)) {
			int dow = cal.get(Calendar.DAY_OF_WEEK);
			if (dow == Calendar.SUNDAY) {
				
				cal.add(Calendar.DAY_OF_MONTH,7);
				count++;
				continue;
			}
			
				cal.add(Calendar.DAY_OF_MONTH,1);
			
		}
		return count;
	}
	
	
	//c = c2 -> 20.03.2024
		//xong hàm này -> c sẽ dc cập nhật thành 31.03.2024
		private static void printDayOfCurrentMonth(Calendar c, Locale locale) {
			
			//để tránh sau khi gọi hàm giá trị của param 'c' thay đổi 
			//ban đầu sao chép giá trị của 'c' sang 1 biến khác -> sử dụng biến mới đi xử lý
			Calendar cloned = DateUtils.clone(c);
			int firstDayOfMonth = 1;
			int lastDayOfMonth = cloned.getActualMaximum(Calendar.DAY_OF_MONTH); //ngayf cuoi thang
			for ( int day = firstDayOfMonth; day <= lastDayOfMonth; day++) {
				cloned.set(Calendar.DAY_OF_MONTH, day);
				System.out.println(day + " --> " + DateUtils.format(cloned, "dd/MM/yyyy EEEE", locale));
			}
		}
	
	
}
