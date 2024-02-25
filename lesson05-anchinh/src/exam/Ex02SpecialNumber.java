package exam;

import java.util.Scanner;

public class Ex02SpecialNumber {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

	    int n = inputNumber();

	    if (isSpecialNumber(n)) {
	        System.out.println("Số " + n + " là số đặc biệt");
	    } else {
	        System.out.println("Số " + n + " không phải là số đặc biệt");
	    }
	}

	public static int inputNumber() {
	    String text = null;
	    int wrongTimes = 0;
	    do {
	        System.out.print("Nhập số nguyên dương N: ");
	        text = ip.nextLine();
	        if (isNumber(text)) {
	            break;
	        }
	        wrongTimes++;
	        System.out.println(">> Số lần sai = " + wrongTimes);
	        if (wrongTimes == 5) {
	            System.out.println("Số lần nhập sai = 5 --> Tài khoản bị khóa");
	            System.out.println("Thoát chương trình");
	            System.exit(0);
	        }
	    } while(true);

	    return Integer.parseInt(text);
	}

	public static boolean isNumber(String text) {
	    for (int i = 0; i < text.length(); i++) {
	        char letter = text.charAt(i);
	        if (!Character.isDigit(letter)) {
	            return false;
	        }
	    }
	    return true;
	}

	public static boolean isSpecialNumber(int n) {
	    int sum = 0;
	    for (int i = 1; i <= n; i++) {
	        sum += i;
	    }

	    return Math.sqrt(sum) % 1 == 0;
	}
}
