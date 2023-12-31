package controlling;

import java.util.Random;

public class Ex02SwitchCase {
	
	public static void main(String[] args) {
		
		// Random số là ngày trong tuần [2, 10]
		// Đúng [2, 8]
		
		// 2 --> thứ hai
		// 3 --> thứ ba
		// 8 --> chủ nhật
		
		int weakday = new Random().nextInt(2, 11);
		
		System.out.println("Weakday --> " + weakday);
		
		String wdAsString = null;
		
		/*
		 switch case
		 --> Khi điều kiện đúng case
		 	+ Nếu có break --> ngay lập tức thoát ra khỏi switch case block ko kiểm tra các case còn lại
		 	+ Nếu ko có break --> nhảy vảo đoạn code của case đúng 
		 					  --> bỏ qua việc check điều kiện của các case còn lại mà nhảy luôn vào body của các case cho đến
		 					      khi gặp break hoặc default, switch case block
		    --> thường mỗi case nên có break
		    
		    --> đôi lúc có thể vận dụng idea ko có break để làm ngắn code hoặc mục đích của mình
		       + gom các case có body giống nhau về 1 chổ
		 */
	/*
	switch (weakday) {
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
			System.out.println("Weekday không hợp lệ, Yêu cầu [2, 8]");
				
		}
		if (wdAsString != null) {
		System.out.println("wdAsString --> " + wdAsString);
		}
		*/
		
		
		// Ngày 2-6 --> ngày trong tuần
		// Ngày 7-8 --> cuối tuần
		// còn case khác --> ko hợp lệ
		
		/*
		wdAsString = null;
		
		switch (weakday) {
		case 2, 3, 4, 5, 6:
			wdAsString = "Ngày trong tuần";
			break;
		case 7, 8:
			wdAsString = "Cuối tuần";
			break;
		default:
			System.out.println("Weekday không hợp lệ, Yêu cầu [2, 8]");
				
		}*/
		wdAsString = switch (weakday) {
		case 2,3,4,5,6 -> "Ngày trong tuần";
		case 7, 8 -> "Cuối tuần";
		default -> "Weekday không hợp lệ, Yêu cầu [2, 8]";
		};
		if (wdAsString != null) {
		System.out.println("wdAsString --> " + wdAsString);
		}
		
	}

}
