package homework;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		System.out.println("1. Kiểm tra số nguyên N có phải là bội của 2 hay không");
		int x;
		int count = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap so nguyen N");
		do {
			try {
				String a = sc.nextLine();
				x = Integer.parseInt(a);
				if (x%2==0 && x>0) {
					System.out.println(x + "->True");
				}
				else {					
					count=count +1;
					if (count <= 5) {
						System.out.println(x+ "->False");
					}
				}
			} catch (NumberFormatException e) {
				count = count + 1;
				if(count<5) {
					System.out.println("Sai dinh dang");
				}
			}
		} while (count<5);

		if (count==5) {
			System.out.println("Qua so lan thu");
		}
	}
}
