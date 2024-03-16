package ex04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số nguyên n(tối đa 3 chữ số): ");
		int n = sc.nextInt();
		System.out.println("Số n đọc là: " + readNumber(n));
		sc.close();
	}
	private static String readNumber(int n) {
		if (n < 0 || n > 999) {
			return "Số không hợp lệ. Vui lòng nhập lại.";
		}
		String[] num10 = {"", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín"};
	    String[] num20 = {"Mười", "Mười một", "Mười hai", "Mười ba", "Mười bốn", "Mười lăm",
	                                "Mười sáu", "Mười bảy", "Mười tám", "Mười chín"};
	    if (n == 0) return "Không";
	    if (n < 10) return num10[n];
	    if (n < 20) return num20[n - 10];
	    
	    String result = "";
	    int hundred = n / 100;
	    int ten = (n % 100) / 10;
	    int one = n % 10;
	    
	    if (hundred > 0) {
	    	result += num10[hundred] + " trăm";
	    	if (ten == 0 && one > 0) result += " lẻ";
	    } if (ten > 1){
	    	result += " " + num10[ten] + " mươi";
	    	if (one == 1) {
	    	   result += " mốt";
	    	   return result;
	    	}
	    } else if (ten == 1){
	    	result += " mười";
	    }
	    if (one > 0 && ten != 1) {
	    	result += " " + num10[one];
	    }
	    return result;
	} 
	
}
