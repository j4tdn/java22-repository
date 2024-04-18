package ex05;

import java.util.Arrays;
import java.util.Scanner;

public class StringShared {
	public static void main(String[] args) {
		String s = "";
		String s1 = "";
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		boolean trueFales = true;
		while (trueFales) {
			System.out.println(" nhập vào chuỗi s1 : ");
			s = sc.nextLine();
			System.out.println("Nhập vào chuỗi s2 ");
			s1 = sc.nextLine();
			if (checkeassi(s) && checkeassi(s1)) {
				trueFales = false;
				break;
			} else {
				System.out.println("Hãy nhập lại hai chuỗi s và s1 thỏa mãn là các kí tự A-->Z");
				sc.nextLine();
			}
		}
		StringBuilder sb1 = stringShared(s, s1, sb);
		String str = sb1.toString();
		String[] array = str.split("\\s+");
		System.out.println(Arrays.toString(array));
		System.out.println("cHUỖI CON LỚN NHẤT TRONG 2 CHUỖI S1 VÀ S2 LÀ : " + findLongestElement(array));
	}

	public static boolean checkeassi(String s) {
		boolean check = false;
		byte[] byteArray = s.getBytes();
		for (int i = 0; i < byteArray.length; i++) {
			if (byteArray[i] >= 41 && byteArray[i] <= 90) {
				check = true;
			} else {
				check = false;
			}
		}
		return check;
	}

	public static StringBuilder stringShared(String s, String s1, StringBuilder sb) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s1.length(); j++) {
				if (s.charAt(i) == s1.charAt(j)) {
					sb = sb.append(s.charAt(i));
					break;
				} else {
					sb = sb.append(" ");
				}
			}
		}
		return sb;
	}

	public static String findLongestElement(String[] arr) {
		if (arr.length == 0) {
			return null;
		}
		String longest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i].length() > longest.length()) {
				longest = arr[i];
			}
		}
		return longest;
	}
}
