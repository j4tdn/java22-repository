package ex03;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main3 {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		String email = null;
		System.out.println("Mời nhập email !!!");
		do {
			email = ip.nextLine();
			try {
				if (validateEmail(email)) {
					break;
				}
			} catch (InvalidEmailException e) {
				System.out.println(e.getMessage());
			}

		} while (true);

		ip.close();
	}

	public static boolean validateEmail(String email) throws InvalidEmailException {
		String regex = "^[a-zA-Z0-9]+(?:[._-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:[.-][a-zA-Z0-9]+)*\\.com$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if (matcher.find()) {
			System.out.println("Email hợp lệ.");
			return true;
		} else {
			throw new InvalidEmailException("Email không hợp lệ !!!");

		}

	}
}
