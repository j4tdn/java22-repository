package homework;

import java.util.Scanner;

/*
 Bài 8: Viết chương trình(hàm) kiểm tra số nguyên N có phải là số nguyên tố hay không
Biết rằng N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ
(tối đa 5 lần) hoặc khai báo biến có sẵn giá trị hợp lệ
VD: Nhập N = abc → báo lỗi, yêu cầu nhập lại
		   = 4 → false
		   = 7 → true
 */
public class Ex08 {

	public static void main(String[] args) {
		int count = 0;
		int a;
		do {
			Scanner ip = new Scanner(System.in);
			System.out.println("Hãy nhập số: ");

			if (ip.hasNextInt()) {
				a = Integer.parseInt(ip.nextLine());
				Prime(a);
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

	public static boolean Prime(int n) {
		int snt = 1;
		if (n <= 0) {
			snt = 0;
			System.out.println("Hãy nhập số lớn hơn 0");
			return false;
		}
		if (n < 2) {
			snt = 0;
			System.out.println("Không phải số nguyên tố");
			return false;
		}

		int sq = (int) Math.sqrt(n);

		for (int i = 2; i <= sq; i++) {
			if (n % i == 0) {
				snt = 0;
			}
		}
		if (snt == 1) {
			System.out.println("Đây là số nguyên tố");
			return true;
		} else {
			System.out.println("Không phải số nguyên tố");
			return false;
		}

	}
}
