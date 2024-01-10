package homework;

import java.util.Scanner;

/*
 	Bài 3: Viết chương trình tìm giai thừa của một số nguyên dương N
    Biết rằng: N có thể được nhập từ bàn phím hoặc khai báo sẵn
    Ví dụ: Nhập N = 1 → 1! = 1
    Nhập N = 5 → 5! = 5.4.3.2.1 = 120
 */
public class Ex03 {

	public static void main(String[] args) {

		int count = 0;
		while (count < 5) {
			Scanner ip = new Scanner(System.in);
			System.out.println("Nhap so nguyen: ");

			if (ip.hasNextInt()) {
				int num = Integer.parseInt(ip.next());
				Factorial(num);
			}

			else {
				System.out.println("Nhập sai định dạng. Xin mời nhập lại");
				count++;
				if (count == 5) {
					System.out.println("Bạn đã nhập sai 5 lần, kết thúc chương trình");
					System.exit(0);
				}

			}
		}
	}

	public static long Factorial(int n) {

		if (n <= 0) {
			System.out.println("Vui lòng nhập số nguyên dương!!");
			return 0;
		} else {
			long s = 1;
			for (int i = 1; i <= n; i++) {
				s = s * i;
			}
			System.out.println("Giai thừa bằng -->" + s);
			return s;
		}
	}
}
