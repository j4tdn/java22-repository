package homework;

import java.util.Scanner;

/*
  Bài 1: Viết chương trình(hàm) kiểm tra số nguyên N có phải là bội của 2 hay không
Yêu cầu: N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ (tối
đa 5 lần)
VD: Nhập N = abc → báo lỗi, yêu cầu nhập lại

= 4 → true
= 6 → true
= 7 → false
 
 */
public class Ex01 {

	public static void main(String[] args) {
		int count = 0;
		while (count < 5) {
			Scanner ip = new Scanner(System.in);
			System.out.println("Nhap so nguyen: ");
			if (ip.hasNextInt()) {
				int num = Integer.parseInt(ip.next());
				Multiple(num);
			} else {
				System.out.println("vui long nhập lại");
				count++;
				if (count == 5) {
					System.out.println("Bạn đã nhập sai 5 lần. Kết thúc chương trình");
					System.exit(0);
				}
			}
		}
	}

	public static boolean Multiple(int x) {

		if (x <= 0) {
			System.out.println("Vui lòng nhập số nguyên lớn hơn 0");
			return false;
		} else {
			if (x % 2 == 0) {
				System.out.println("Số nhập vào là bội của 2");
				return true;
			} else {
				System.out.println("Không phải bội của 2");
				return false;
			}
		}
	}
}
