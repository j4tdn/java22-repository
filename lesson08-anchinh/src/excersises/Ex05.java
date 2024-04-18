package excersises;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String s1, s2 = "";
		while (true) {
			try {
				System.out.print("Nhập xâu S1: ");
				s1 = ip.nextLine();
				validateCharacter(s1);
				System.out.print("Nhập xâu S2: ");
				s2 = ip.nextLine();
				validateCharacter(s2);
				break;
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		ip.close();
		String commonString = findCommonString(s1, s2);
		System.out.println(commonString);
	}

	private static void validateCharacter(String character) {
		if (!character.matches("[A-Z]+")) {
			throw new IllegalArgumentException("Kí tự không hợp lệ");
		}
	}

	//Tìm xâu con chung
	private static String findCommonString(String s1, String s2) {
		int m = s1.length();
		int n = s2.length();
		int[][] dp = new int[m + 1][n + 1];
		int maxLength = 0;
		int endIndex = 0;

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
					if (dp[i][j] > maxLength) {
						maxLength = dp[i][j];
						endIndex = i - 1; 
					}
				} else {
					dp[i][j] = 0;
				}
			}
		}

		if (maxLength == 0) {
			return ""; 
		}

		return s1.substring(endIndex - maxLength + 1, endIndex + 1);
	}

}
