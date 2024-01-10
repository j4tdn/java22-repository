package bai2;

import java.util.Scanner;

public class LuyThua {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n;
		boolean isValid = false;
		int lanNhapMax = 5;
		
		//Nhập va kieerm tra giá trị N
		while(!isValid && lanNhapMax > 0) {
			System.out.println("Nhập số nguyên dương N: ");
			String input = ip.nextLine();
			if(isValidInput(input)) {
				n = convertToInteger(input);
				if(n> 0 && (n&(n-1))==0) {
					isValid = true;
					System.out.println(n + " là lũy thừ của 2.");
					
				}else {
					System.out.println("không là lũy thừa của 2.");
				}
				
			}else {
				System.out.println("Giá trị không hợp lệ .Vui lòng nhập lại");
				lanNhapMax--;
			}
			
		}
		if(!isValid) {
			System.out.println("Đã quá số lần cho phép .Kết thúc chương trình.");
		}
		
	}
	private static boolean isValidInput(String input) {
		for(int i =0;i<input.length();i++) {
			if(!Character.isDigit(input.charAt(i))) {
				return false;
			}
		}
		return true;
		
	}
	private static int convertToInteger(String input) {
		int n = 0;
		for(int i =0;i<input.length();i++) {
			int digit = input.charAt(i)-'0';
			n = n*10+digit;
		}
		return n;
		
		
	}

}
