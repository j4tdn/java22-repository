package timezone;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

import utils.DateUtils;

public class Ex01TimeZone {

	/*
	 * Timezone là khái niệm dùng để phân chia, xác định thời gian của các quốc gia,
	 * khu vực trên thế giới
	 * 
	 Có 3 cách:
	 
	 + GMT(GreenWich Mean Time)
	 --> GMT+0 GMT+11 GMT-1 GMT-11
	 
	 + UTC(Cordinated Universal Time)
	 --> UTC+0 UTC+11 
	 --> Tiêu chuẩn trên hệ thống Internet
	 
	 + Area/Country Time
	 --> ICT: Indochina Time	-> Giờ đông dương
	 	 HST: Hawaiin standart time
	 
	 */
	public static void main(String[] args) {
		System.out.println("Locale default: " + Locale.getDefault()); // en_US
		System.out.println("Timezone default: " + TimeZone.getDefault());
		
		System.out.println("\n======================================\n");
		String[] timezones = TimeZone.getAvailableIDs();
		for(String tz : timezones) {
			System.out.println("tz --> " + tz);
		}
		
		TimeZone VietNamTz = TimeZone.getTimeZone("Asia/Ho_Chi_Minh");
		Calendar c1 = Calendar.getInstance(VietNamTz);
		System.out.println("c1 Format -->" + DateUtils.format(c1, "dd/MM/yyyy HH:mm:ss", VietNamTz));

		//Locale: tác động đến ngôn ngữ, ngày đầu tuần (T2/Chủ nhật)
		//Timezone: tác động đến thời gian theo múi giờ
		
		// thay vì dùng mặc định, nếu biết đc quốc gia phát triển dự án cho
		// truyền timezone của quốc gia, khu vực đó vào lúc lấy tgian
		
		TimeZone berlinTz = TimeZone.getTimeZone("Europe/Berlin");
		Calendar c2 = Calendar.getInstance(berlinTz);
		DateUtils.format(c2, "dd/MM/yyyy HH:mm:ss", new Locale("de", "DE"));
		System.out.println("c2 Format -->" + DateUtils.format(c2, "dd/MM/yyyy HH:mm:ss", berlinTz));
	
		System.out.println("\n======================================\n");
		
		LocalDateTime ldatetime = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
		System.out.println("ldatetime--> "+ ldatetime);
	}
}
