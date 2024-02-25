package view;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex03FindLargestNNumberInString {

	public static void main(String[] args) {
		String s1 = "12abu02muzk586cyx";
		String s2 = "Uyk892nn1234uxo2";

		System.out.println("Max valid number in " + s1 + ": " + getMaxValidNumber(s1));
		System.out.println("Max valid number in " + s2 + ": " + getMaxValidNumber(s2));
	}

	private static int getMaxValidNumber(String s) {
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(s);

		int maxValidNum = Integer.MIN_VALUE;

		while (matcher.find()) {
			String match = matcher.group(); // lấy chuỗi số tìm thấy
			try {
				int number = Integer.parseInt(match);
				if (number > maxValidNum) {
					maxValidNum = number;
				}
			} catch (NumberFormatException e) {

			}
		}

		return maxValidNum;
	}

}
