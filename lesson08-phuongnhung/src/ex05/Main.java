package ex05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập vào 2 chuỗi bất kì chứa các kí tự A..Z: ");
		System.out.println("Chuỗi 1: ");
		String string1 = ip.nextLine();
		System.out.println("Chuỗi 2: ");
		String string2 = ip.nextLine();
		int m, n;
		m = string1.length();
		n = string2.length();
		int x = -1;
		int y = -1;
		int lcs_con[][] = new int[m][n];
		int result = -1;
		for (int i = 1; i <string1.length(); i++) {
			for (int j = 1; j < string2.length(); j++) {
				if (string1.charAt(i - 1) == string2.charAt(j - 1)) 
					lcs_con[i][j] = lcs_con[i-1][j-1] + 1;
					else lcs_con[i][j] = 0;
					
					if(lcs_con[i][j] > result) {
						result = lcs_con[i][j];
						x = i;
						y = j;
					}

			}
		}
		for (int i = x-result; i< x; i++) System.out.println("" + string1.charAt(i));
	}
}
