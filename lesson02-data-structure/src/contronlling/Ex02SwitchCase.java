package contronlling;

import java.nio.file.Watchable;
import java.util.Random;

public class Ex02SwitchCase {
	
	public static void main(String[] args) {
		
		// random 1 số tuè 2->8
		int weekday  = new Random().nextInt(2,11);
		System.out.println("Weekday-->" + weekday);
		String  wdAsString = "";
		switch (weekday) {
			case 2: 
				wdAsString = "Thứ 2";
				break;
			case 3: 
				wdAsString = "Thứ 3";
				break;
			case 4: 
				wdAsString = "Thứ 4";
				break;
			case 5: 
				wdAsString = "Thứ 5";
				break;
			case 6: 
				wdAsString = "Thứ 6";
				break;
			case 7: 
				wdAsString = "Thứ 7";
				break;
			case 8: 
				wdAsString = "Chủ nhật";
				break;
			default: System.out.println("Weekday không hợp lệ");
		}
		if(wdAsString != null) {
			System.out.println("wdAsString -->" + wdAsString);
		}
		///
		
		wdAsString = null;
		
		/*
		switch (weekday) {
			case 2:
			case 3: 
			case 4: 
			case 5: 
			case 6: 
				wdAsString = "Ngày trong tuần";
				break;
			case 7: 
			case 8: 
				wdAsString = "Cuối tuần";
				break;
			default: System.out.println("Weekday không hợp lệ");
		}
		*/
		/*
		switch (weekday) {
		case 2,3,4,5,6:
			wdAsString = "Ngày trong tuần";
			break;
		case 7,8:
			wdAsString = "Cuối tuần";
			break;
		default: System.out.println("Weekday không hợp lệ");
	}
	*/
		wdAsString = switch (weekday) {
			case 2, 3, 4, 5, 6 ->"Ngày trong tuần";
			case 7,8 -> "Cuối tuần";
			default ->"Weekday không hợp lệ, Yêu cầu [2,8]";
		};
		if(wdAsString != null) {
			System.out.println("wdAsString -->" + wdAsString);
		}
		
	}
}
