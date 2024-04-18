package Exercise08;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {
	/*
	 * Viết chương trình cho phép người dùng nhập vào họ tên sau, in ra kết quả theo
	 * yêu cầu sau:
	 * 
	 * Họ tên nhập vào chỉ bao gồm các kí tự [A-Za-z ] Viết HOA chữ cái đầu tiên của
	 * mỗi từ, còn lại là kí tự thường Các từ cách nhau một khoảng trắng Ví dụ: aDam
	 * Le vAN john Son => Adam Le Van John Son Anne frAnk => Anne Frank
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten: ");
		String S = sc.nextLine();

		nameFormat(S);
	}

	public static void nameFormat(String name) {
	    name = name.strip().replaceAll("\\s{1,}", " ");
	    String formatName = "";
	    String[] arr = name.split(" ");
	    for (String x : arr) {
	        char firstChar = Character.toUpperCase(x.charAt(0));
	        formatName += firstChar; 
	        if (x.length() > 1) {
	            formatName += x.substring(1).toLowerCase();
	        }
	       
	        formatName += " ";
	    }
	    System.out.println("Name format: " + formatName.trim()); 
	}



}
