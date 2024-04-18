package Exercise08;

public class test {
	public static void main(String[] args) {
		String S = "aaabaaabbaaaaa";
		int maxLength = 1;
		int minLength = Integer.MAX_VALUE;

		int count = 1;
		for (int i = 1; i < S.length(); i++) {
			if (S.charAt(i) == S.charAt(i - 1)) {
				count++;

			}

		}

		System.out.println(maxLength);
		System.out.println(minLength);
	}
}
