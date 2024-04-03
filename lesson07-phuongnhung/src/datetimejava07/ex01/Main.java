package datetimejava07.ex01;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import common.WKD_EGVN;
import util.DateUtils;

public class Main {


	
	/*
	 * Xây dựng ứng dụng The Ultimate Relationship Calculator
			▪ Nhập thời gian bắt đầu hẹn hò của 2 người. 
			▪ Nếu đã chia tay, nhập ngày chia tay ngược lại lấy thời gian hiện tại
			▪ Nhấn Enter để thực hiện tính toán. 
			Hỏi:
			▪ Ngày bắt đầu hẹn họ là ngày thứ mấy.
			▪ Mối tình đã bắt đầu được bao nhiêu năm, tháng, ngày, giờ, phút, giây
	 */
		private static Scanner ip = new Scanner(System.in);

		public static void main(String[] args) {
			Locale locale = new Locale("en", "US");
			System.out.println("Hãy nhập thời gian hẹn hò của bạn 0_< !!!");
			Calendar beginDay = input();
			Calendar endDay = Calendar.getInstance();
			System.out.println("Bạn chia tay chưa 0_0 Y/N");
			while(true) {
				String answer = ip.nextLine();
				if("Y".equals(answer)) {
					endDay = input();
					break;
				}else if("N".equals(answer)) {
					break;
				}
				else System.out.println("Xin hãy trả lời đúng Y/N");
			}
			System.out.println("Nhập thành công !!!");
			System.out.println("1. In thông tin ngày hẹn hò: "
					   + DateUtils.format(beginDay, locale));
			System.out.println("2. In thông tin ngày chia tay: "
					   + DateUtils.format(endDay, locale));
			int dowAsNumber = beginDay.get(Calendar.DAY_OF_WEEK);
			WKD_EGVN[] wkds = WKD_EGVN.values();
			WKD_EGVN dowAsEnum = wkds[dowAsNumber - 1];
			System.out.println("4. Ngày hẹn hò là ngày: " + dowAsEnum.getVnText() );
			System.out.println("5. Thời gian yêu nhau là: ");
			timeCaculating(beginDay,endDay);

		}
		private static void timeCaculating(Calendar start, Calendar end) {
			long startInMs = start.getTimeInMillis();
			long endInMs = end.getTimeInMillis();
			
			long duration = endInMs - startInMs;
			long days = TimeUnit.MILLISECONDS.toDays(duration); 
			duration -= TimeUnit.DAYS.toMillis(days); 
			long hours = TimeUnit.MILLISECONDS.toHours(duration); 
			
			duration -= TimeUnit.HOURS.toMillis(hours); 
			long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
			
			duration -= TimeUnit.MINUTES.toMillis(minutes); 
			long seconds = TimeUnit.MILLISECONDS.toSeconds(duration); 
			
			System.out.println("\tSố ngày = " + days);
			System.out.println("\tSố giờ = " + hours);
			System.out.println("\tSố phút = " + minutes);
			System.out.println("\tSố giây = " + seconds);
		}
		private static Calendar input() {
			Calendar dayC = Calendar.getInstance();
			String dayStr = "";
			while(true) {
				dayStr = ip.nextLine();
				try {
					dayC = DateUtils.toCalendar(dayStr,"dd/MM/yyy HH:mm:ss");
					break;
				}catch (Exception e) {
					System.out.println("Lỗi định dạng 'dd/MM/yyy HH:mm:ss' khi nhập ");
					System.out.println("--> Hãy nhập lại 0_0 ");
				}
			}
			return dayC;
		}
	
}
