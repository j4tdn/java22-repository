package baitap;

import java.util.Scanner;

public class bai2LuyThuaCua2 {
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
			if(isPowerOf2(n)) {
				System.out.println(n + " là lũy thừa của 2");
			} else {
				System.out.println(n + " không phải là lũy thừa của 2");
			}
		}
	}
	// Kiểm tra số nhập vào có hợp lệ hay không
	private static boolean isValidNumber(String input) {
		    return input.matches("\\d+") && Integer.parseInt(input) > 0;
		}
	// Kiểm tra số nhập vào có phải là lũy thừa của 2 không
	public static boolean isPowerOf2(int number) {
		if (number <= 0) {
	        // Nếu số là 0 hoặc âm, không phải là lũy thừa của 2
	        return false;
	    } else {
	        // Kiểm tra liệu số có thể chia hết cho 2 không
	        while (number % 2 == 0) {
	            // Nếu có thể chia, chia số cho 2
	            number = number / 2;
	        }
	        // Kiểm tra xem số sau khi chia có phải là 1 hay không
	        return number == 1;
	    }
	    }
}

