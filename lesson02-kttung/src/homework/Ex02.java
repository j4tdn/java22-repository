package homework;

import java.util.Scanner;

public class Ex02 {
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
	
	public static void main(String[] args) {
		boolean kq = isPowerOfTwo();
		
	}
	
	public static boolean isPowerOfTwo() {
		Scanner sc = new Scanner(System.in);
		int i = 0;

		while (i < 5) {

				System.out.println(" Nhập số nguyên dương n: ");
				int n = Integer.parseInt(sc.nextLine());
				
                if (n > 0) {
					System.out.println("Vui lòng nhập số nguyên dương ");
					i++;
			
				} else if((n & (n - 1)) == 0) {
					System.out.println("Là lũy thừa của 2 " );
					return true;
				}else {
					System.out.println("Không phải là lũy thừa của 2 " );
					return false;
				}
		}
		i++;
		System.out.println("Nhập quá 5 lần. Kết thúc chương trình ");
		return false;
	}
}
