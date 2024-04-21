package exam;

import java.util.Scanner;

public class Ex03 {
	/*
	 Cho dãy kí tự chứa các kí tự thường và khoảng trắng.
	Viết chương trình loại bỏ khoảng trắng thừa và đảo chuỗi như sau:
	Example: input: Welcome to JAVA10 class
	output: emocleW ot 01AVAJ ssalc
	Method signature: revert(String s) >> String
	 */
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String s = "";
		while(true) {
			try {
				s = ip.nextLine();
				revert(s);
				break;
			} catch (Exception e) {
				
			}
			
		}
		ip.close();
	}
	private static void revert(String s) {
		String s1 = s.strip().replaceAll("\\s+", " ");
		String[] words = s1.split("\\s+");
		for(String word : words) {
			for(int i = word.length() - 1; i >= 0; i--) {
				System.out.print(word.charAt(i));
			}
		System.out.print("\s");
		
		}
	}

}
