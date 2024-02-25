package exam;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = 0;
		int time = 0;
		do {
			System.out.print("Nhap so thuc : ");
			if (sc.hasNextDouble()) {
				n = sc.nextDouble();
				if (n != (int) n) {
					System.out.println("So thuc : " + n);
					break;
				} else {
					System.out.println("Vui long nhap lai so thuc co phan thap phan khac 0.");
				}
			}
			time++;
			if (time >= 3) {
				break;
			}
		} while (true);
		System.out.print("Phan so toi gian cua so thap phan " + getMinFract(n));
	}

	public static String getMinFract(double number) {
		String rs = "";
		return rs;
	}

}
