package homework;

import java.util.Scanner;

public class Ex05 {

	/*
	 * Bài 5: Viết chương trình kiểm tra N có phải là số đối xứng hay không Biết
	 * rằng N được nhập từ bàn phím là một số nguyên dương có tối thiểu 2 chữ số
	 * 
	 */

	public static void main(String[] args) {
		int a;
		int count = 0;

		do {
			Scanner ip = new Scanner(System.in);
			System.out.println("Hãy nhập số: ");

			if (ip.hasNextInt()) {
				a = Integer.parseInt(ip.next());
				Symmetric(a);
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

	public static boolean Symmetric(int x) {
		int num = x;
		int remain;
		int reversed = 0;

		if (x < 10) {
			System.out.println("Hãy nhập số tối thiểu 2 chữ số");
			return false;
		}

		while (x > 0) {
			remain = x % 10;
			reversed = reversed * 10 + remain;
			x = x / 10;
		}

		if (num == reversed) {
			System.out.println("so doi xung");
			return true;
		} else {
			System.out.println("Khong phai so doi xung");
			return false;
		}

	}
}
