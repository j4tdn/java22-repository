package homework;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {

		int count = 0;
		int a;
		do {
			Scanner ip = new Scanner(System.in);
			System.out.println("Hãy nhập số thứ tự: ");

			if (ip.hasNextInt()) {
				a = Integer.parseInt(ip.next());
				printPrime(a);
			} else {
				System.out.println("Bạn đã nhập sai định dạng");
				count++;
				if (count == 5) {
					System.out.println("Bạn đã nhập sai 5 lần, kết thúc chương trình !!!");
					System.exit(0);
				}
			}

		} while (count < 5);
	}

	public static int printPrime(int stt) {

		int count = 0;
		int i = 2;
		while (count < stt) {

			if (checkPrime(i)) {
				count++;
				if (count == stt) {
					System.out.println("Số nguyên tố thứ " + count + " " + "là " + i);
				}
			}
			i++;
		}
		return i;

	}

	public static boolean checkPrime(int n) {
		int snt = 1;
		int sq = (int) Math.sqrt(n);

		for (int i = 2; i <= sq; i++) {
			if (n % i == 0) {
				snt = 0;
			}
		}
		if (snt == 1) {
//			System.out.println("Đây là số nguyên tố");
			return true;
		} else {
//			System.out.println("Không phải số nguyên tố");
			return false;
		}

	}
}
