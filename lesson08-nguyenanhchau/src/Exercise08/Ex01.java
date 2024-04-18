package Exercise08;

import java.util.Scanner;

public class Ex01 {
	/*
	 * Viết chương trình nhập vào một chuỗi kí tự bất kì sau đó thực hiện các công
	 * việc sau : Yêu cầu: Chuỗi chỉ chứa các kí tự tiếng việt có dấu, phím space.
	 * In ra mỗi kí tự trên một dòng In ra mỗi từ trên mỗi dòng In ra chuỗi đảo
	 * ngược theo kí tự In ra chuỗi đảo ngược theo từ
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap chuoi: ");
		String S = sc.nextLine();

		charInline(S);

		stringInline(S);

		reverseChar(S);

		reverseString(S);
	}

	public static void charInline(String x) {
		x = x.strip().replaceAll("\\s{1,}", "");
		System.out.println("Char in line:");
		for (int i = 0; i < x.length(); i++) {
			System.out.print(x.charAt(i) + " ");

		}
		System.out.print("\n");

	}

	public static void stringInline(String x) {
		x = x.strip().replaceAll("\\s{1,}", " ");
		String[] arr = x.split(" ");
		System.out.println("String in line:");
		for (String string : arr) {
			System.out.println(string);
		}
	}

	public static void reverseChar(String x) {
		x = x.strip().replaceAll("\\s{1,}", "");
		System.out.println("Reverse char:");
		for (int i = x.length() - 1; i >= 0; i--) {
			System.out.print(x.charAt(i) + " ");
		}
		System.out.print("\n");

	}

	public static void reverseString(String x) {
		x = x.strip().replaceAll("\\s{1,}", " ");
		System.out.println("Reverse string:");
		String[] arr = x.split(" ");

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

}
