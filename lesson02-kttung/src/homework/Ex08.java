package homework;

import java.util.Scanner;

public class Ex08 {
	/*
	Bài 8: Viết chương trình(hàm) kiểm tra số nguyên N có phải là số nguyên tố hay không
	Biết rằng N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ
	(tối đa 5 lần) hoặc khai báo biến có sẵn giá trị hợp lệ
	VD: Nhập N  = abc → báo lỗi, yêu cầu nhập lại
				= 4 → false
				= 7 → true
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = getValidInpput(sc);
		
		if (isPrime(n)) {
			System.out.println("Là số nguyên tố" + n);
		} else {
			System.out.println("Không phải là số nguyên tố" + n);
		}
		
	}
	
	public static int getValidInpput(Scanner sc) {
		int i =0;
		
		while (i < 5) {

			System.out.println(" Nhập số nguyên dương n: ");
			int n = Integer.parseInt(sc.nextLine());
			
            if (n > 0) {
				System.out.println("Vui lòng nhập số nguyên dương ");
				i++;
		
			} else {
				System.out.println("Vui lòng nhập số nguyên dương hợp lệ ");
				return n;
			}
				
		}
		i++;
		System.out.println("Nhập quá 5 lần. Kết thúc chương trình ");
		System.exit(0);
		return -1;
		
	}
	
	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
	

