package ex2;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
    	
        Scanner ip = new Scanner(System.in);
        boolean isValid = false;

        while (!isValid) {
            String password = ip.nextLine();

            if (checkTheLength(password) && checkDigits(password) && checkLowercaseLetters(password)
                    && checkCapitalLetters(password) && checkForSpecialCharacters(password)) {
                System.out.println("Mật khẩu hợp lệ");
                isValid = true;
            } else {
                System.out.println("Mật khẩu không hợp lệ");
            }
        }

        ip.close();
    }

    public static boolean checkTheLength(String password) {
        return password.length() >= 8 && password.length() <= 256;
    }

    public static boolean checkDigits(String password) {
        return password.matches(".*[a-zA-Z0-9].*");
    }

    public static boolean checkLowercaseLetters(String password) {
        return password.matches(".*[a-z].*");
    }

    public static boolean checkCapitalLetters(String password) {
        return password.matches(".*[A-Z].*");
    }

    public static boolean checkForSpecialCharacters(String password) {
        return password.matches(".*[!@#$%^&*()\\-+=\\[\\]{};:'\"<>,.?/~`_].*");
    }
}
