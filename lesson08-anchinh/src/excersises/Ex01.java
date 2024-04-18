package excersises;

import java.util.Scanner;

public class Ex01 {
	
	/*
	  Viết chương trình nhập vào một chuỗi kí tự bất kì sau đó thực hiện các công việc sau :
		Yêu cầu: Chuỗi chỉ chứa các kí tự tiếng việt có dấu, phím space (é á ố ễ ... )
	 */
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String s = "";
		while(true) {
			try {
				s = ip.nextLine();
				if(!isValidString(s)) {
					throw new IllegalArgumentException("Chuỗi không hợp lệ, nhập lại");
				}
				break;
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		ip.close();
		
		//In ra mỗi kí tự trên một dòng
		System.out.println("--> Mỗi kí tự trên một dòng:");
		for(int i = 0; i < s.length(); i++) {
			System.out.println("Kí tự thứ " + i + ": " + s.charAt(i));
		}
		
		//In ra mỗi từ trên mỗi dòng
//		s = s.replaceAll("\\s+", "");
//		s = s.replaceAll("\\s{1,}", ""); // bỏ space
		System.out.println("--> Mỗi từ trên mỗi dòng:");
		String[] words = s.split("\\s");
		for(String word : words) {
			System.out.println(word);
		}
		
		//In ra chuỗi đảo ngược theo kí tự
		System.out.println("--> chuỗi đảo ngược theo kí tự:");
		for(int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		
		
		//In ra chuỗi đảo ngược theo từ
		System.out.println("\n--> chuỗi đảo ngược theo từ:");
		String[] reversedWords = s.split("\\s");
		for(int i = reversedWords.length - 1; i >= 0; i--) {
			System.out.print(reversedWords[i] +" ");
		}
		
	}
	public static boolean isValidString(String ipString) {
		for(int i = 0; i < ipString.length(); i++) {
			char c = ipString.charAt(i);
			if(!isValidCharacter(c)) {
				return false;
			}
		}
		return true;
	}
	//kí tự tiếng việt có dấu, phím space
	public static boolean isValidCharacter(char c) {
		return (c == ' ' || c >= '\u00C0' && c <= '\u1EF9');
	}
}
