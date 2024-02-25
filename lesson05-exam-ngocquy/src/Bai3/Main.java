package Bai3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập chuỗi: ");
		String input = ip.nextLine();
		int result = getMaxValidNumber(input);
		if (result != 0) {
			System.out.println("Số tự nhiên hợp lệ lớn nhất trong chuỗi: " + result);
		} else {
			System.out.println("Không tìm thấy số tự nhiên hợp lệ trong chuỗi.");
		}
	}
	
	public static int getMaxValidNumber(String input) {
		int maxNumber = 0;
		int currentNumber = 0;
		boolean foundDigit = false;

		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			if (Character.isDigit(currentChar)) {
				currentNumber = currentNumber * 10 + (currentChar - '0');
				foundDigit = true;
			} else {
				if (foundDigit) {
					maxNumber = Math.max(maxNumber, currentNumber);
					currentNumber = 0;
					foundDigit = false;
				}
			}
		}
		if (foundDigit) {
			maxNumber = Math.max(maxNumber, currentNumber);
		}
		return maxNumber;
	}

}
