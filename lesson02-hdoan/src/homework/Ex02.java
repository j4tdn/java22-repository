package homework;

import java.util.Scanner;

/*
	Bài 2: Viết chương trình(hàm) kiểm tra số nguyên N có phải là lũy thừa của 2 hay không
	Biết rằng N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ
	(tối đa 5 lần) hoặc khai báo biến có sẵn giá trị hợp lệ
	VD: Nhập N = abc → báo lỗi, yêu cầu nhập lại
	
	= 4 → true
	= 6 → false
	= 8 → true
	= 9 → false
 */


public class Ex02 {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n = 0;
		boolean validInput = false;
		for(int i = 0; i < 5; i++) {
			System.out.print("Nhập n: ");
			String input = ip.nextLine();
			if(input.matches("\\d+")) {
				n = Integer.parseInt(input);
				if(n > 0) {
					validInput = true;
					break;
				}
			}
			System.out.println("Lỗi, n không hợp lệ. Nhập lại");
		}
		if(!validInput) {
			System.out.println("Bạn đã nhập sai n quá nhiều lần. hãy thử lại");
			return;
		}
		checkPowerOf2(n);
	}
	
	public static void checkPowerOf2(int n) {
		while (n != 1) {	
			if (n % 2 != 0) {
				System.out.println("So da nhap khong la luy thua");
				return;
			}
			n = n/2;
		}
		if (n == 1) System.out.println("So da nhap la luy thua");
	}
	
}
