package controlling;

import java.util.Random;

public class Ex02SwitchCase {
	
	public static void main(String[] args) {
		
		// Random số là ngày trong tuần [2, 10]
		// Đúng [2,8]
		
		int weekday = new Random().nextInt(2,11);
		
		System.out.println("weekday --> " +weekday);
	
		String wdAsString = null;
		
		/*
		  switch case
		  --> khi điều kiện đúng case
		  + nếu có break --> ngay lập tức thoát khỏi switch case block ko kiểm tra các case còn lại	
		  + nếu ko có break --> nhảy vào đoạn code của case đúng
		  					--> bỏ qua việc check điều kiện của case hiện tại mà nhảy luôn vào body của các case cho đến khi
		  					gặp break hoặc hết default, switch case block
		  					
		  					--> thường mỗi case nên có break
		  					--> đôi lúc có thể vận dụng idea của ko có break để làm ngắn code
		 						+ gom các case có body giống nhau về 1 chỗ
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
				System.out.println("weekday không hợp lệ . yêu cầu [2,8]");
		}
		
		if(wdAsString != null) {
			System.out.println("wdAsString --> " + wdAsString);
		}
		
		// Ngày 2-6 ==> Ngày trong tuần
		// Ngày 7-8 ==> Ngày cuối tuần
		//			==> ko hợp lệ
		
		System.out.println("\n\n");
		
		wdAsString = null;
		
		/*
		switch(weekday) {
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
			System.out.println("weekday không hợp lệ . yêu cầu [2,8]");
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
			System.out.println("weekday không hợp lệ . yêu cầu [2,8]");
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
			System.out.println("weekday không hợp lệ . yêu cầu [2,8]");
		}
		*/
		
		wdAsString = switch (weekday) {
			case 2,3,4,5,6 -> "Ngày trong tuần"; //return, ko cần break
			case 7,8 ->  "Cuối tuần";
		default -> "weekday không hợp lệ . yêu cầu [2,8]";
		};
		
		if(wdAsString != null) {
			System.out.println("wdAsString --> " + wdAsString);
		}
	}
	
	
}
