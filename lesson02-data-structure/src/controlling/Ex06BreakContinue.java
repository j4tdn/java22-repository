package controlling;

public class Ex06BreakContinue {

	public static void main(String[] args) {
		
		//continue
		//sử dụng trong vòng lặp --> kết thúc sớm vòng lặp hiện tại, nhảy qua lần lặp tiếp theo
		
		//break
		//sử dụng trong switch case --> thoát khỏi biểu thức switch case khi gặp lệnh break
		//sử dụng trong vòng lặp --> thoát khỏi toàn bộ vòng lặp hiện tại
		
		for (int i = 0; i < 20; i++) {
			System.out.println("i1 --> " + i); // 0 1 2 3 4 5
			
			if (i == 2) {
				continue;
			}
			
			if (i == 5) {
				break;
			}
			
			System.out.println("i2 --> " + i); //0 1 3 4
		}
	}
}