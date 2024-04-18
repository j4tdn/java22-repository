package Ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập xâu s1: ");
        String s1 = scanner.nextLine();
        System.out.print("Nhập xâu s2: ");
        String s2 = scanner.nextLine();

        String longestCommonSubsequence = findLongestCommonSubsequence(s1, s2);
        System.out.println("Xâu con chung dài nhất của s1 và s2 là: " + longestCommonSubsequence);
    }

    private static String findLongestCommonSubsequence(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        int[][] lcs = new int[m + 1][n + 1];

        int maxLength = 0; 
        int endIndex = 0; 

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    lcs[i][j] = 0;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    lcs[i][j] = lcs[i - 1][j - 1] + 1;
                    if (lcs[i][j] > maxLength) {
                        maxLength = lcs[i][j];
                        endIndex = i - 1;
                    }
                } else {
                    lcs[i][j] = 0;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = endIndex - maxLength + 1; i <= endIndex; i++) {
            result.append(s1.charAt(i));
        }

        return result.toString();
    }
}
