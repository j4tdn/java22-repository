package ex01;

import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import common.WKD_EGVN;

public class RelationshipCalculator {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bạn đã chia tay chưa? (y/n): ");
	    String hasEnded = sc.nextLine();
	    Calendar endDate;
	    
		System.out.println("Nhập thời gian bắt đầu hẹn hò của hai người:");
        System.out.println("Nhập năm bắt đầu hẹn hò:");
        int year = sc.nextInt();
        System.out.println("Nhập tháng bắt đầu hẹn hò:");
        int month = sc.nextInt() - 1;
        System.out.println("Nhập ngày bắt đầu hẹn hò:");
        int dayOfMonth = sc.nextInt();
        Calendar startDate = Calendar.getInstance();
        startDate.set(year, month, dayOfMonth);
	   
        if (hasEnded.equalsIgnoreCase("y")) {
            endDate = getEndDate(sc);
        } else {
            endDate = Calendar.getInstance();
        }
        
        calRelationship(startDate,endDate);
	}
	 private static Calendar getEndDate(Scanner sc) {
		 
	    System.out.println("Nhập ngày chia tay (năm, tháng, ngày):");

	    System.out.println("Nhập năm chia tay:");
	    int year = sc.nextInt();

	    System.out.println("Nhập tháng chia tay:");
	    int month = sc.nextInt() - 1; 

	    System.out.println("Nhập ngày chia tay:");
	    int dayOfMonth = sc.nextInt();

	    Calendar endDate = Calendar.getInstance();
	    endDate.set(year, month, dayOfMonth);
	    return endDate;
	 }
	 private static void calRelationship(Calendar startDate, Calendar endDate) {
		 int dowAsNumber = startDate.get(Calendar.DAY_OF_WEEK);
	     WKD_EGVN[] wkds = WKD_EGVN.values();
	     WKD_EGVN dowAsEnum = wkds[dowAsNumber - 1];
	     System.out.println("Ngày bắt đầu hẹn hò là ngày " + dowAsEnum.getVnText());
	     
		 long startInMs = startDate.getTimeInMillis();
		 long endInMs = endDate.getTimeInMillis();		 
		 long duration = endInMs - startInMs;
		 
		 long years = TimeUnit.MILLISECONDS.toDays(duration) / 365;
	     long months = TimeUnit.MILLISECONDS.toDays(duration) / 30 % 12;
	     long days = TimeUnit.MILLISECONDS.toDays(duration) % 30;// giả sử 1 tháng có 30 ngày
	     long hours = TimeUnit.MILLISECONDS.toHours(duration) % 24;
	     long minutes = TimeUnit.MILLISECONDS.toMinutes(duration) % 60;
	     long seconds = TimeUnit.MILLISECONDS.toSeconds(duration) % 60;
		 
	     System.out.println("Thời gian hẹn hò là: ");
	     System.out.println("\tSố năm = " + years);
	     System.out.println("\tSố tháng = " + months);
		 System.out.println("\tSố ngày = " + days);
		 System.out.println("\tSố giờ = " + hours);
		 System.out.println("\tSố phút = " + minutes);
		 System.out.println("\tSố giây = " + seconds);
	     	     
	 }

}
