package ex07;

import java.util.Scanner;

public class Main07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi ký tự S: ");
		String s = sc.nextLine();
		
		findMaxLength(s);

	}
	private static void findMaxLength(String s) {
		int maxLength = 0;
		int count = 1;
		int maxLengthStart = 0;
		int start = 0;
		
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				count++;
				if (count > maxLength) {
	                maxLength = count;
	                maxLengthStart = start;
	            }
			} else {
				count = 1;
				start = i;
			}
		}		
        System.out.println("Độ dài lớn nhất của dãy con đúng: " + count +" "+ "'"+ s.substring(start, start + maxLength)+ "'" + "["+start+"]");       
	}
}
