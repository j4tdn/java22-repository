package view;

public class Ex07 {

	public static void main(String[] args) {

		System.out.println("Nhập chuỗi string ");

		String s = "aabbbbvvc";

		int max = 1;
		int temp = 1;

		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				temp++;
			}

			else {
				max = Math.max(temp, max);
				temp = 1;
			}
		}

		max = Math.max(temp, max);

		System.out.println("Độ dài lớn nhất của dãy xâu con đúng là " + max);
	}
}
