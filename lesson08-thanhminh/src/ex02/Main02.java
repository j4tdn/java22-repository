package ex02;

import java.util.Scanner;

public class Main02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập họ tên của bạn: ");
		String name = sc.nextLine();
		
		String[] s = name.split("\\s+");
		StringBuilder sb = new StringBuilder();
		
		for (String s1 : s) {
			if(s1.isEmpty()) continue;
			String formatted = s1.substring(0, 1).toUpperCase() + s1.substring(1).toLowerCase();
			sb.append(formatted).append(" ");
		}
		
		String formattedName = sb.toString().trim();
		System.out.println("Họ tên sau khi được định dạng: " + formattedName);
	}

}
