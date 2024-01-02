package video_array;

import java.util.Scanner;

public class bai1BoiCua2 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int numberInput = 5;
		int n = 0;
		
		while (numberInput > 0) {
			System.out.print("Nhập số nguyên dương: ");
			String input = ip.nextLine();
			
			if(isValidNumber(input)) {
				n = Integer.parseInt(input);
				if(n > 0) {
					break;
				} else {
					System.out.print("Nhập lại số nguyên dương. ");
				}
			} else {
				System.out.print("Không hợp lệ. Vui lòng nhập lại.");
			}
			
			numberInput--;
		}
		if(numberInput == 0) {
			System.out.print("Bạn đã nhập sai 5 lần. Kết thúc chương trình");
		} else {
			if(isMultipleOf2(n)) {
				System.out.println(n + " là bội của 2");
			} else {
				System.out.println(n + " không phải là bội của 2");
			}
		}
	}
	// Kiểm tra số nhập vào có hợp lệ hay không
	private static boolean isValidNumber(String input) {
		    return input.matches("\\d+") && Integer.parseInt(input) > 0;
		}
	// Kiểm tra số nhập vào có phải là bội của 2 không
	public static boolean isMultipleOf2(int number) {
		return number % 2 == 0;
	}
}
