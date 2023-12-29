package controlling;

import java.util.Random;

public class Ex02SwitchCase {
	public static void main(String[] args) {
		
		//Random số là ngày trong tuần [2,10]
		//Đúng [2,8]
		//2 --> Thứ hai
		//3 --> Thứ ba
		//8 --> Chủ nhật
		
		int weekday = new Random().nextInt(2, 11);
		System.out.println("Weekday --> " + weekday);
		
		String wdAsString = null;
		
		/*if (weekday == 2) {
			wdAsString = "Thứ hai";
		} else if (weekday == 3) {
			wdAsString = "Thứ ba";
		} else if (weekday == 4) {
			wdAsString = "Thứ tư";
		} else if (weekday == 5) {
			wdAsString = "Thứ năm";
		} else if (weekday == 6) {
			wdAsString = "Thứ sáu";
		} else if (weekday == 7) {
			wdAsString = "Thứ bảy";
		} else if (weekday == 8) {
			wdAsString = "chủ nhật";
		} else {
			System.out.println("Weekday không hợp lệ. Yêu cầu [2, 8]");
		}*/
		
		/*Switch case
		 * --> khi điều kiện đúng case
		 *    + nếu có break --> ngay lập tức thoát khỏi switch case block k kiểm tra các case còn lại
		 *    + ko có break --> ngay vào đonạ code của case đúng
		 *                  --> bỏ qua việc check điều kiện của các case hiện tại mà sẽ nhảy luôn vào body của các case 
		 *                      cho đến khi gặp break hoặc hết defaut, switch case block
		 * --> thường mỗi case nên có break
		 * --> đôi lúc có thể vận dụng idea của ko có break để làm ngăn code
		 * + gom các case có body giống nhau về 1 chỗ
		 */
		
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
		System.out.println("Weekday không hợp lệ. Yêu cầu [2, 8]");
		}
		
		if (wdAsString != null) {
			System.out.println("wdAsString --> " + wdAsString);
		}
		
		// Ngày 2-6 ==> ngày trong tuần
		// Ngày 7-8 ==> Cuối tuần
		// Còn lại ==> ko hợp lệ
		
		System.out.println("\n\n");
	
		/*switch(weekday) {
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
		System.out.println("Weekday không hợp lệ. Yêu cầu [2, 8]");
		}
		
		if (wdAsString != null) {
			System.out.println("wdAsString --> " + wdAsString);
		}*/
		
		/*switch(weekday) {
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
		System.out.println("Weekday không hợp lệ. Yêu cầu [2, 8]");
		}*/
		
		/*switch(weekday) {
		case 2,3,4,5,6:
			wdAsString = "Ngày trong tuần";
			break;
		case 7,8:
			wdAsString = "Cuối tuần";
			break;
		default:
		System.out.println("Weekday không hợp lệ. Yêu cầu [2, 8]");
		}*/
		
		wdAsString = switch(weekday) {
		case 2,3,4,5,6 -> "Ngày trong tuần";//return, ko cần break
		case 7,8 -> "Cuối tuần";
		default -> "Weekday không hợp lệ. Yêu cầu [2, 8]";
		};
		
		if (wdAsString != null) {
			System.out.println("wdAsString --> " + wdAsString);
		}
		
	}

}
