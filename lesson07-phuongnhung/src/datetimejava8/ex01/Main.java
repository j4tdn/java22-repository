package datetimejava8.ex01;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import common.WKD_EGVN;
import static util.DateUtils.opt;;

public class Main {
	/*
	 * Xây dựng ứng dụng The Ultimate Relationship Calculator
			▪ Nhập thời gian bắt đầu hẹn hò của 2 người. 
			▪ Nếu đã chia tay, nhập ngày chia tay ngược lại lấy thời gian hiện tại
			▪ Nhấn Enter để thực hiện tính toán. 
			Hỏi:
			▪ Ngày bắt đầu hẹn họ là ngày thứ mấy.
			▪ Mối tình đã bắt đầu đaược bao nhiêu năm, tháng, ngày, giờ, phút, giây
	 */
		private static Scanner ip = new Scanner(System.in);

		public static void main(String[] args) {
			Locale locale = new Locale("en", "US");
			System.out.println("Hãy nhập thời gian hẹn hò của bạn 0_<");
			LocalDateTime beginDay = input();
			LocalDateTime endDay = LocalDateTime.now();
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
					   + beginDay.toLocalDate());
			System.out.println("2. In thông tin ngày chia tay: "
					   + endDay.toLocalDate());
			WKD_EGVN wkd = WKD_EGVN.valueOf(beginDay.getDayOfWeek().toString());
			System.out.println("4. Ngày hẹn hò là ngày: " + wkd.getVnText() );
			System.out.print("5. Thời gian yêu nhau là: ");
			timeCaculating(beginDay,endDay);

		}
		private static void timeCaculating(LocalDateTime start, LocalDateTime end) {
			LocalDate startDate = start.toLocalDate();
			LocalDate endDate = end.toLocalDate();
			Period period = Period.between(startDate, endDate);
			Duration duration = Duration.between(start, end);
			
			if(duration.isNegative()) {
				duration.plusDays(1);
				period.minusDays(1);
			}

			System.out.println( format(duration) + format(period));
		}
		private static LocalDateTime input() {
			DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
			LocalDateTime day = LocalDateTime.now();
			String dayStr = "";
			while(true) {
				dayStr = ip.nextLine();
				try {
					day = LocalDateTime.parse(dayStr, dft);
					break;
				}catch (Exception e) {
					System.out.println("Lỗi định dạng 'dd/MM/yyy HH:mm:ss' khi nhập ");
					System.out.println("--> Hãy nhập lại 0_0 ");
				}
			}
			return day;
		}
		private static String format(Period period) {
			return String.join(" ", 
					opt(period.getYears() , "năm"),
					opt(period.getMonths(), "tháng"), 
					opt(period.getDays()  , "ngày"));
		}
		
		private static String format(Duration duration) {
			return String.join(" ", 
					opt(duration.toHoursPart(), "giờ"),
					opt(duration.toMinutesPart() , "phút"),
					opt(duration.toSecondsPart() , "giây"));
		}
}
