/*
Bài 5: Viết chương trình kiểm tra N có phải là số đối xứng hay không
Biết rằng N được nhập từ bàn phím là một số nguyên dương có tối thiểu 2 chữ số
VD: Nhập N = abc → báo lỗi, yêu cầu nhập lại
= a123 → báo lỗi, yêu cầu nhập lại
= 1 → báo lỗi, yêu cầu nhập lại
= 256 → false
= 12521 → true
= 2662 → true
 */
package homework;

import java.util.Scanner;

public class BT5 {
	public static void main(String[] args) {
		int N = enterPositiveInteger();
		boolean rs = checkSymmetric(N);
		
		if(rs) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	public static boolean checkSymmetric(int N) {
		int temp = N;
		int reversedNum = 0;
		while (N>0) {
			int digit = N % 10;
			reversedNum = reversedNum * 10 + digit;
			N /=10;
		}
		return temp == reversedNum;
	}
	
	public static int enterPositiveInteger() {
		Scanner ip = new Scanner(System.in);
		int n = 0;
		while (true){
			System.out.print("Nhap so nguyen duong N: ");
			String input = ip.nextLine();
			if(input.matches("\\d+")) {
				n = Integer.parseInt(input);
				if(n>=10) {
					return n;
				} else {
					System.out.println("Khong hop le! Vui long nhap lai!");
				}
			} else {
				System.out.println("Khong hop le! Vui long nhap lai!");
			}
		}
	}
}
