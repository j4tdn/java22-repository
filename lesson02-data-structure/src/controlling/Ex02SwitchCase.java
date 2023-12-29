package controlling;

import java.util.Random;

public class Ex02SwitchCase {

	public static void main(String[] args) {
		
		// Random so ngay trong tuần [2, 10]
		
		// 2 - thứ 2
		// ...
		// 8 --> chủ nhật
		
		int weekday = new Random().nextInt(2, 11);
		
		System.out.println("weekday --> " + weekday);
		
		String wAsString = "";
		

		/*
		if (weekday == 2) {
		wAsString = "Thứ hai";
		} else if (weekday == 3) {
		wAsString = "Thứ ba";
		} 
		else if (weekday == 4) {
		wAsString = "Thứ tư";
		}else if (weekday == 5) { 
		wAsString=  "Thứ năm";
		} else if (weekday == 6) {
		wAsString= "Thứ sáu";
		} else if (weekday == 7) {
		wAsString= "Thứ bảy";
		} else if (weekday == 8) {
		wAsString = "Chủ nhật";
		} else {
			System.out.println("weekday ko hop lệ , yêu cầu [3, 8]");

		}*/
		
		/*
		 Switch case 
		 --> khi điều kiện đúng case
		 + nếu có braek --> ngay lập tức thoát khỏi swich cáe block k kiểm tra các case còn lại
		 + nếu có braek --> ngayf vàp đoạn code của cáse đúng
		 --> bor qua việc check đk của các cáe hiêjn tại mà nhảy luôn body của các case cho đến khi gặp lại
		    braek hoặc hết dèault , switch case block
		 --> đôi lúc có thể vận dụng idea của ko có brae để làm ngắn code
		    */

		switch(weekday){
			case 2 :
				wAsString = "Thứ hai";
				break;
			case 3 :
				wAsString = "Thứ ba";
				break;
			case 4 :
				wAsString = "Thứ tư";
				break;
			case 5 :
				wAsString = "Thứ năm";
				break;
			case 6 :
				wAsString = "Thứ sáu";
				break;
			case 7 :
				wAsString = "Thứ bảy";
				break;
			case 8 :
				wAsString = "chủ nhật";
				break;	
			default :
				System.out.println("weekday ko hop lệ , yêu cầu [2, 8]");

		}
		
		
		
		/*switch(weekday){
		case 2 :
			wAsString = "ngày trong tuần";
			break;
		case 3 :
			wAsString = "ngày trong tuần";
			break;
		case 4 :
			wAsString = "ngày trong tuần";
			break;
		case 5 :
			wAsString = "ngày trong tuần";
			break;
		case 6 :
			wAsString = "ngày trong tuần";
			break;
		case 7 :
			wAsString = "cuối tuần";
			break;
		case 8 :
			wAsString = "cuối tuần";
			break;	
		default :
			System.out.println("weekday ko hop lệ , yêu cầu [2, 8]");
			*/
		switch(weekday){
		case 2,3,4,5,6 :
			wAsString = "ngày trong tuần";
			break;
		
		case 7,8:
			wAsString = "cuối tuần";
			break;
		
		default :
			System.out.println("weekday ko hop lệ , yêu cầu [2, 8]");



	}
		
	}
}
