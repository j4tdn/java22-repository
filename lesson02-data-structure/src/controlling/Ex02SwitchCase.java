package controlling;

import java.util.Random;

public class Ex02SwitchCase {

	public static void main(String[] args) {
		
		// Random số ngày trong tuần [2,10]
		// Đúng [2,8]
		
		int weekday = new Random().nextInt(2,11);
		
		System.out.println("Weekday --> " + weekday);
		
		String wdAsString = null;
		
		/*
		if (weekday == 2) {
			wdAsString = "Thứ Hai";
		}
		else if (weekday == 3) {
			wdAsString = "Thứ Ba";
		}
		else if (weekday == 4) {
			wdAsString = "Thứ Tư";
		}
		else if (weekday == 5) {
			wdAsString = "Thứ Năm";
		}
		else if (weekday == 6) {
			wdAsString = "Thứ Sáu";
		}
		else if (weekday == 7) {
			wdAsString = "Thứ Bảy";
		}
		else if (weekday == 8) {
			wdAsString = "Chủ Nhật";
		} else {
			System.out.println("Weekday không hợp lệ. Yêu cầu [2,8]");
		}
		
		*/
		
		/*
		 switch case 
		 --> khi điều kiện đúng case 
		 	+ nếu có break --> ngay lập tức thoát khỏi switch case block k kiểm tra các case còn lại
		 	+ nếu ko có break -> ngay vào đoạn code của case đúng
		 					  --> bỏ qua việc check điều kiện của các case hiện tại mà nhảy luôn vào body của
		 					  các case cho đến khi nào gặp break hoặc hết default, switch case block
		 
		 --> thường mỗi case nên có break
		 --> đôi lúc có thể vận dụng idea của ko có break để làm ngắn code
		 */
		
//		weekday = 4;
		
		switch(weekday) {
			case 2:
				wdAsString = "Thứ hai";
				break;
			case 3:
				wdAsString = "Thứ ba";
				break;
			case 4:
				wdAsString = "Thứ tư";
				break;
			case 5:
				wdAsString = "Thứ năm";
				break;
			case 6:
				wdAsString = "Thứ sáu";
				break;
			case 7:
				wdAsString = "Thứ bảy";
				break;
			case 8:
				wdAsString = "Chủ nhật";
				break;
			default:
				System.out.println("Weekday không hợp lệ. Yêu cầu [2,8]");
		}
		
		if (wdAsString != null) {
		System.out.println("wdAsString --> " + wdAsString);
		}
		
		//Ngày 2-6 --> Ngày trong tuần 
		//Ngày 7-8 --> Cuối tuần
	    //         --> Không hợp lệ
		
		System.out.println("\n\n");
		
		wdAsString = null;
		
		/*
		switch (weekday) {
		case 2:
			wdAsString = "Ngày trong tuần";
			break;
		case 3:
			wdAsString = "Ngày trong tuần";
			break;
		case 4:
			wdAsString = "Ngày trong tuần";
			break;
		case 5:
			wdAsString = "Ngày trong tuần";
			break;
		case 6:
			wdAsString = "Ngày trong tuần";
			break;
		case 7:
			wdAsString = "Cuối tuần";
			break;
		case 8:
			wdAsString = "Cuối tuần";
			break;
		default:
			System.out.println("Weekday không hợp lệ. Yêu cầu [2,8]");
		}
		*/
		
		/*
		switch (weekday) {
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			wdAsString = "Ngày trong tuần";
			break;
		case 7:
		case 8:
			wdAsString = "Cuối tuần";
			break;
		default:
			System.out.println("Weekday không hợp lệ. Yêu cầu [2,8]");
		}
		
		*/
		
		/*
		switch (weekday) {
		case 2,3,4,5,6:
			wdAsString = "Ngày trong tuần";
			break;
		case 7,8:
			wdAsString = "Cuối tuần";
			break;
		default: 
			System.out.println("Weekday không hợp lệ. Yêu cầu [2,8]");
		}
		*/
		
		wdAsString = switch(weekday) {
			case 2,3,4,5,6 -> "Ngày trong tuần";
			case 7,8 -> "Cuối tuần";
			default -> "Weekday không hợp lệ. Yêu cầu [2,8]";
		};

		if (wdAsString != null) {
			System.out.println("wdAsString --> " + wdAsString);
		}
		
	}
	
}
