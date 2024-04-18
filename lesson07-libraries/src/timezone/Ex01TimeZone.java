package timezone;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

import util.DateUtils;

public class Ex01TimeZone {

	/*
	 TimeZone là khái niệm dùng để phân chia, xác định thời gian của các quốc gia
	 khu vực trên thế giới
	 
	 Có 3 cách để xác định thời gian với timezone
	 
	 + GMT (Greenwich Mean Time)
	   -->
	 + UTC (Cordinated Universal Time)
	   -->
	 + Area/Country Time 
	 
	 */
	
	public static void main(String[] args) {
		
		System.out.println("Locale default: " + Locale.getDefault());
		System.out.println("Timezone default: " + TimeZone.getDefault());
		
		System.out.println("\n ============== \n");
		String[] timezones = TimeZone.getAvailableIDs();
		for (String tz: timezones) {
			System.out.println("tz --->" + tz);
		}
		//thực thi nó trên máy cá nhân 
		//--> lấy thời gian theo timezone trên máy cá nhân :UTC+7
		
		//khi code dc trển khai, delploy code chạy trên 1 server nào đó
		
		
		Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Ho_Chi_Minh"));
		System.out.println("c11 --> " + DateUtils.format(c1, null));
		
		Calendar c2 = Calendar.getInstance(TimeZone.getTimeZone("Europe/Berlin"));
		DateUtils.format(c2, "dd/MM/yyyy HH:mm:ss", new Locale("de", "DE"));
	}
}
