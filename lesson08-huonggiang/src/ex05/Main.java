package ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hai xâu s1 và s2 từ người dùng
        System.out.println("Nhập xâu s1:");
        String s1 = scanner.nextLine();
        System.out.println("Nhập xâu s2:");
        String s2 = scanner.nextLine();

        // Tìm xâu con chung dài nhất
        String longestCommonSubstring = findLongestCommonSubstring(s1, s2);

        // Xuất kết quả
        System.out.println("Xâu con chung dài nhất của s1 và s2 là: " + longestCommonSubstring);
    }

    // Phương thức tìm xâu con chung dài nhất của hai xâu
    public static String findLongestCommonSubstring(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m + 1][n + 1];
        int maxLen = 0;
        int endIndex = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > maxLen) {
                        maxLen = dp[i][j];
                        endIndex = i;
                    }
                }
            }
        }

        return s1.substring(endIndex - maxLen, endIndex);
    }
}

