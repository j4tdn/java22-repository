package Bai2;

import java.sql.Array;

public class Ex02 {
	public static void main(String[] args) {
		String s1 = "01a2b3456cde478";
		String s2 = "aa6b546c6e22";
		getLargestNumbers(s1);
		System.out.println("==============");
		getLargestNumbers(s2);
		
	}
	
	public static void getLargestNumbers(String s) {
		String[] newString = null;
		String numberS = s.replaceAll("[a-z]+", " ").strip();
		int largestNumber = 0;
		newString = numberS.split(" ");
		for(int i = 0 ; i<newString.length; i++) {
			int recentNumber = Integer.parseInt(newString[i]);
			if(recentNumber > largestNumber) {
				largestNumber = recentNumber;
			}
		}
		System.out.println(largestNumber);
	}
}
