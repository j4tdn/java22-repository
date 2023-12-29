package controlling;

import java.util.Random;

public class Ex02SwitchCase {
	public static void main(String[] args) {
		int weekday = new Random().nextInt(2,11);
		System.out.println("weekday -->" + weekday);
		String wdAsString = null ;
		
		switch (weekday) {
		case 2: {
			wdAsString = "Thứ 2";
			break;
		}
		case 3: {
			wdAsString = "Thứ 3";
			break;
		}
		case 4: {
			wdAsString = "Thứ 4";
			break;
		}
		case 5: {
			wdAsString = "Thứ 5";
			break;
		}
		case 6: {
			wdAsString = "Thứ 6";
			break;		
		}
		case 7: {
			wdAsString = "Thứ 7";
			break;		
		}
		case 8: {
			wdAsString = "Chủ nhật";
			break;
		}
	
		default:
			System.out.println("Weeday không hợp lệ. Yêu cầu [2, 8]");
			
		}
		if (wdAsString != null) {
			System.out.println("wdAsString " + wdAsString);
		}
		
		
//		switch (weekday) {
//		case 2,3,4,5,6: 
//			wdAsString = "Ngày trong tuần";
//			break;
//		case 7,8:
//			wdAsString = "Cuối tuần";
//			break;
//		default:
//			System.out.println("Weeday không hợp lệ. Yêu cầu [2, 8]");
//		}
		
		wdAsString = switch (weekday) {
			case 2,3,4,5,6 -> "Ngày trong tuần"; // return, ko cần break
			case 7,8 -> "Cuối tuần";
			default -> "Weekday không hợp lệ. Yêu cầu [2, 8]";
		};

		if (wdAsString != null) {
			System.out.println("wdAsString --> " + wdAsString);
		}
	}
}