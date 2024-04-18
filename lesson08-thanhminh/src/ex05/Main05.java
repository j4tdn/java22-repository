package ex05;

import java.util.Scanner;

public class Main05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1,s2;
		do {
            System.out.println("Nhập chuỗi s1:");
            s1 = sc.nextLine().toUpperCase(); 
        } while(!isValidString(s1));

        do {
            System.out.println("Nhập chuỗi s2:");
            s2 = sc.nextLine().toUpperCase(); 
        } while (!isValidString(s2));
		
		String text = findText(s1, s2);
		System.out.println("Xâu con chung dài nhất của S1 và S2 là: " + text);
	}
	private static boolean isValidString(String str) {
        return str.matches("[A-Z]+");
    }
	private static String findText(String s1, String s2) {
		int a = s1.length();
		int b = s2.length();
		int[][] arr = new int[a + 1][b + 1];
		int max = 0;
		int result = 0;
		
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				if(s1.charAt(i - 1) == s2.charAt(j - 1)) {
					arr[i][j] = arr[i - 1][j - 1] + 1;
					if (arr[i][j] > max) {
						max = arr[i][j];
						result = i;
					}
				} else {
					arr[i][j] = 0;
				}
			}
		}
		return s1.substring(result - max, result); 
	}
}
