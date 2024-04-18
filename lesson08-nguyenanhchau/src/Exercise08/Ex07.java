package Exercise08;

import java.util.Arrays;

public class Ex07 {
	/*
	 * Cho xâu kí tự S bao gồm toàn các ký tự ‘a’ đến ‘z’, không quá 255 ký tự. “Dãy
	 * con đúng” trong xâu S là dãy có các kí tự liền kề giống nhau Yêu cầu:
	 * 
	 * Hãy tính độ dài lớn nhất của dãy con đúng của dãy S. Hãy tính độ dài nhỏ nhất
	 * của dãy con đúng của dãy S.
	 * 
	 * Example: ‘aaabaaabbaaaaa’ Độ dài lớn nhất của dãy con đúng : 5 “aaaaa” [9] Độ
	 * dài nhỏ nhất của dãy con đúng: 1 “b” [3] Với [x] => bắt đầu từ vị trí x trong
	 * xâu S
	 */

	 public static void main(String[] args) {
	        String S = "aaaaffkeroa";
	        findChildstring(S);
	    }

	 public static void findChildstring(String S) {
	        int count = 1;
	        int maxString = 1;
	        int minString = Integer.MAX_VALUE;
	        String[] arr = S.split("");
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i].equals(arr[i - 1])) {
	                count++;
	            } else {
	                maxString = Math.max(maxString, count);
	                if (count > 1) {
	                    minString = Math.min(minString, count);
	                }
	                count = 1;
	            }
	        }

	        System.out.println("maxString: " + maxString);
	        System.out.println("minString: " + minString);
	    }
	}



