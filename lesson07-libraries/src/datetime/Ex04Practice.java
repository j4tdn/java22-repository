package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import util.DateUtils;

public class Ex04Practice {
    public static void main(String[] args) {
//    	Date date = new Date();
//		System.out.println("1. In thông tin date với date format: " + DateUtils.format(date, null));
		Calendar c = Calendar.getInstance();
		System.out.println("2. Thông tin biến c: " + DateUtils.format(c));
		int domMax= c.getMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("domMax " + domMax);
		int domActualMax = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("domActualMax " + domActualMax);
        int dowAsNumber = c.get(Calendar.DAY_OF_WEEK);
        System.out.println("4. Ngày trong tuần (dạng số): "+ dowAsNumber);
    }
}
