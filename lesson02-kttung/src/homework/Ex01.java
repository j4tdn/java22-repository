package homework;

import java.util.Scanner;

public class Ex01 {
	/*
	Bài 1: Viết chương trình(hàm) kiểm tra số nguyên N có phải là bội của 2 hay không
	Yêu cầu: N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ (tối
	đa 5 lần)
	VD: Nhập N = abc → báo lỗi, yêu cầu nhập lại
	= 4 → true
	= 6 → true
	= 7 → false
	*/
	public static void main(String[] args) {
		boolean kq = isMultipleOfTwo();
		
	}
	
	public static boolean isMultipleOfTwo() {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		
		while (i < 5) {

				System.out.println(" Nhập số nguyên dương n: ");
				int n = Integer.parseInt(sc.nextLine());
				
                if (n > 0) {
					System.out.println("Vui lòng nhập số nguyên dương ");
					i++;
			
				} else if(n % 2 == 0) {
					System.out.println("Là bội của 2 " + n);
					return true;
				}else {
					System.out.println("Không phải là bội của 2 " + n);
					return false;
				}
		}
		i++;
		System.out.println("Nhập quá 5 lần. Kết thúc chương trình ");
		return false;
	}
}

