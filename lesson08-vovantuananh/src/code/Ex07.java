package code;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi : ");
		String inputString = sc.nextLine();
		
		findLongestCommonSubstring(inputString);
		findShortestCommonSubstring(inputString);
	}
	
	//dai nhat
	public static void findLongestCommonSubstring(String input) {
		int maxLength = 1;
        int startIndex = 0;
        int currentLength = 1;
        int currentIndex = 0;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                currentLength++;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    startIndex = currentIndex;
                }
            } else {
                currentLength = 1;
                currentIndex = i;
            }
        }
        System.out.println("Độ dài lớn nhất : "+input.substring(startIndex, startIndex + maxLength)+ "["+startIndex+"]");
	}
	
	//ngan nhat
	public static void findShortestCommonSubstring(String input) {
		int minLength = Integer.MAX_VALUE;
        int startIndex = 0;
        int currentLength = 1;
        int currentIndex = 0;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                currentLength++;
            } else {
                if (currentLength < minLength) {
                    minLength = currentLength;
                    startIndex = currentIndex;
                }
                currentLength = 1;
                currentIndex = i;
            }
        }

        // Kiểm tra chuỗi con ở vị trí cuối cùng của chuỗi
        if (currentLength < minLength) {
            minLength = currentLength;
            startIndex = currentIndex;
        }
		System.out.println("Độ dài ngắn nhất : " + input.substring(startIndex, startIndex + minLength) + "[" + startIndex + "]");
	}
}
