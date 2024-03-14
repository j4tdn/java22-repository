package datetime;

import java.util.Date;

public class Ex01InitialUtilDate {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("Date:" +  date);
		//Date:Thu Mar 14 20:02:52 ICT 2024 
		//ICT : Indochina Time : Dong Duong 
		System.out.println("Month:" + date.getMonth());
		
		
		// long date: số ms tính từ epoch time(1.1.1970 0:0:0) 
	    System.out.println("System_Time: " + System.currentTimeMillis() + "(ms)");
		Date aDate = new Date(82000);
		System.out.println("adate 82000ms form epoch: " +aDate);

	}

}
