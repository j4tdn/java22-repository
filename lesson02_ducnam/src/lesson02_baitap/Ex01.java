package lesson02_baitap;

import java.util.Scanner;

public class Ex01 {
	public static boolean Test(String n) {
		if (!n.matches("\\d+")) {
			return false; 
		}
		return Integer.parseInt(n) % 2 == 0;
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int count = 0;
		while (count < 5) {
			System.out.print("Nhập số nguyên dương N: ");
			String input = ip.nextLine();
			if (Test(input)) {
				System.out.println(input + " là bội của 2");
				return;
			} else if (!input.matches("\\d+")) {
				System.out.println("không hợp lệ Nhập lại: "); 
			} else {
				System.out.println("không phải là bội của 2 Nhập lại: ");
			}
			count++;
		}
		System.out.println("Số lần nhập vượt quá giới hạn");
	}

	
	

	
	public static int s() {
		// TODO Auto-generated method stub
		return 0;
	}
}

