package view;

import java.util.Scanner;

public class Ex05LongestCommonSubstring {
	
	static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		String s1,s2;
		do {
			 System.out.print("Nhập xâu s1: ");
		     s1 = ip.nextLine();
		     System.out.print("Nhập xâu s2: ");
		     s2 = ip.nextLine();
		     if (!isValidString(s1) || !isValidString(s2)) {
					System.out.println("Ko hợp lệ. Cả hai chuỗi chỉ được chứa các chữ cái viết hoa từ A đến Z.");
		     	}
		}while(!isValidString(s1) || !isValidString(s2));
        String longestCommonSubstring = longestCommonSubstring(s1, s2);
        System.out.println("Xâu con chung dài nhất: " + longestCommonSubstring);
		
	}
	
	private static boolean isValidString(String st) {
		return st.matches("^[A-Z]+$");
	}
	
	private static String longestCommonSubstring(String s1, String s2) {
		String longestCommonSubstring = "";
		for(int i = 0; i < s1.length(); i++) {
			for(int j = i + 1; j < s2.length(); j++) {
				String substring = s1.substring(i,j);
				if(s2.contains(substring) &&  substring.length() > longestCommonSubstring.length()) {
					longestCommonSubstring = substring;
				}
			}
		}
		return longestCommonSubstring;
	}
	
}
