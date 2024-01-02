package controlling;

public class Ex02SwitchCase {
	public static void main(String[] args) {
		// Random số là ngày trong tuần [2, 10]
		//Đúng [2, 8]
		
		//2 --> thứ hai
		//3 --> thứ ba
		// 8 --> chủ nhật
		
		int weekday = new Random().nextInt(2, 11);
		System.out.println("Weekday --> " + weekday);
		
		String wdAsString = "";
		if (weekday == 2) {
			wdAsString = "thu hai";
		} else if (weekday == 3 ) {
			wdAsString = " thu ba";
		}else if (weekday == 4 ) {
			wdAsString = " thu tu";
		}else if (weekday == 5 ) {
			wdAsString = " thu nam";
		}else if (weekday == 6 ) {
			wdAsString = " thu sau";
		}else if (weekday == 7 ) {
			wdAsString = " thu bay";
		}else if (weekday == 8 ) {
			wdAsString = " chu nhat";
		}else {
			System.out.println("Weekday không hợp lệ. Yêu cầu [2, 8");
			
		}
		/*
		 * switch case
		 * --> khi điều kiên đúng case
		 * 	+ nếu có break --> ngay lập tức thoát khỏi switch case block k kiểm tra các case còn lại
		 * 	+ nếu ko có break --> nhảy vào đoạn code của case đúng
		 * 						--> bỏ qua việc check điều kiện của các case hiện tại mà nhảy luôn vào body của các case chod
		 * 						đến khi gặp break hoặc hết defaut, switch case block
		 * 
		 * --> thường mỗi case nên có break
		 * --> đôi lúc có thể vận dụng idea của ko có break để làm ngắn code
		 * 		+ gom các case có body giống nhau về 1 chỗ
		 */
		
		weekday = 4;
		switch(weekday) {
		case 2:
			wdAsString = "thu hai";
			break;
		case 3:
			wdAsString = "thu ba";
			break;
		case 4:
			wdAsString = "thu tu";
			break;
		case 5:
			wdAsString = "thu nam";
			break;
		case 6:
			wdAsString = "thu sau";
			break;
		case 7:
			wdAsString = "thu bay";
			break;
		case 8:
			wdAsString = "chu nhat";
			break;
		default:
			System.out.println("Weekday ko hop le. Yeu cau [2, 8]");
		}
		
		if (wdAsString !=null) {
			System.out.println("wdAsString --> " + wdAsString);
			
		}
		// Ngày 2 - 6 ==> Ngày trong tuần
		// Ngày 7 -8 ==> Cuối tuần
		//			==> ko hợp lệ
	}
}
