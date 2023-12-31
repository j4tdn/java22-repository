package controlling;

public class Ex06BreakContinue {

	public static void main(String[] args) {
		// continue 
		// sử dụng trong vòng lặp --> kết thúc sớm vòng lặp hiện tại, nhảy qua lần lặp tiếp theo 
		
		// break
		// sử dụng trong sưitch case--> thoát khỏi biểu thức swich case khi gặp lệnh braek
		// sử dụng trong vòng lặp --> thoast khỏi toàn bộ vòng lặp hiện tại
		
		for (int i = 0 ; i < 10; i++) {
			System.out.println("i1--> " + i );
			
			if(i == 7) {
				continue;
			}
			if (i ==2){
				break;
			}
			System.out.println("i2--> " + i);
		}

	}

}
