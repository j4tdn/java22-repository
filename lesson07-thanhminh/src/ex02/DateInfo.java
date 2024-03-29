package ex02;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

import common.WKD_EGVN;
import util.DateUtils;

public class DateInfo {
	public static void main(String[] args) {
		Locale locale = new Locale("en", "US");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập thông tin về thời gian:");
        System.out.println("Nhập năm:");
        int year = sc.nextInt();
        System.out.println("Nhập tháng:");
        int month = sc.nextInt() - 1;
        System.out.println("Nhập ngày:");
        int dayOfMonth = sc.nextInt();
        Calendar c = Calendar.getInstance();
        c.set(year, month, dayOfMonth);
        
        getDateInfo(c, locale);
	}
	private static void getDateInfo(Calendar c, Locale locale) {
		int dowAsNumber = c.get(Calendar.DAY_OF_WEEK);
	    WKD_EGVN[] wkds = WKD_EGVN.values();
	    WKD_EGVN dowAsEnum = wkds[dowAsNumber - 1];		
		System.out.println("Ngày " + DateUtils.format(c, locale) + " là ngày " + dowAsEnum.getVnText() + " trong tuần.");
        System.out.println("Ngày " + c.get(Calendar.DAY_OF_YEAR) + " trong năm.");
        
        System.out.println(dowAsEnum.getVnText() + " là " + dowAsEnum.getVnText() + " thứ " + c.get(Calendar.WEEK_OF_YEAR) + " trong năm.");
        
        System.out.println(dowAsEnum.getVnText() + " thứ " + c.get(Calendar.DAY_OF_WEEK_IN_MONTH) + " trong tháng.");
        System.out.println("Tháng " + (c.get(Calendar.MONTH) + 1) + " có " + c.getActualMaximum(Calendar.DAY_OF_MONTH) + " ngày.");
        System.out.println("Năm " + c.get(Calendar.YEAR)+ " có " + c.getActualMaximum(Calendar.DAY_OF_YEAR) + " ngày.");
	}

}
