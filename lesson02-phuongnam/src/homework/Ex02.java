package homework;

import java.util.Scanner;

/*
 Bài 2: Viết chương trình(hàm) kiểm tra số nguyên N có phải là lũy thừa của 2 hay không
Biết rằng N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ
(tối đa 5 lần) hoặc khai báo biến có sẵn giá trị hợp lệ
 */
public class Ex02 {

	public static void main(String[] args) {
		int a;
		int count = 0;

		do {
			Scanner ip = new Scanner(System.in);
			System.out.println("Hãy nhập số: ");

			if (ip.hasNextInt()) {
				a = Integer.parseInt(ip.next());

				CheckPower(a);
			} else {
				System.out.println("Bạn đã nhập sai định dạng");
				count++;
				if (count == 5) {
					System.out.println("Bạn đã nhập sai 5 lần, kết thúc chương trình");
					System.exit(0);
				}
			}

		} while (count < 5);
	}

	public static boolean CheckPower(int x) {
		if (x <= 0) {
			System.out.println("Hãy nhập số dương");
			return false;
		}

		while (x % 2 == 0) {
			x = x / 2;
		}
		if (x == 1) {
			System.out.println("Đây là số luỹ thừa của 2");
			return true;
		} else {
			System.out.println("Không phải luỹ thừa của 2");
			return false;
		}

	}

}
