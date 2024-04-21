package ex03;

import java.util.Scanner;

public class Main {
/*
 * Cho dãy kí tự chứa các kí tự thường và khoảng trắng.
		Viết chương trình loại bỏ khoảng trắng thừa và đảo chuỗi như sau:
		Example: input: Welcome to JAVA10 class
		output: emocleW ot 01AVAJ ssalc
Method signature: revert(String s) >> String
 */
	public static void main(String[] args) {
		String input = "  Welcome to JAVA10 class  ";
		String[] words =  input.strip().replaceAll("\\s{1,}", " ").split(" ");
		for(String word: words) {
			for(int i=word.length()-1 ; i>=0 ; i-- ) {
				System.out.print(word.charAt(i));
			}
			System.out.print(" ");

		}
	}
}
