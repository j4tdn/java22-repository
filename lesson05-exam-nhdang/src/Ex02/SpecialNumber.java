package Ex02;

import java.util.Scanner;

public class SpecialNumber {
	public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhập số : ");
		int number = sc.nextInt();
		if (isSpecialNumber(number)) {
			System.out.println(number + " là số đặc biệt");
		} else {
			System.out.println(number + " không phải là số đặc biệt");
		}
	}
	public static boolean isSpecialNumber(int number) {
		int sum = 0;
		int i = 1;
		while (sum < number) {
			sum += i;
			i++;
		}
		return sum == number;
	}
}
