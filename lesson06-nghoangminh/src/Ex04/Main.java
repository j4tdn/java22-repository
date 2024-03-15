package Ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Nhập số n: ");
		Integer n = sc.nextInt();
        System.out.println(readNumber(n));
        sc.close();
    }

    public static String readNumber(int n) {
        if (n < 0 || n > 999) {
            return "Số không hợp lệ";
        }

        String[] ones = {"", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín"};
        String[] tens = {"", "Mười", "Hai mươi", "Ba mươi", "Bốn mươi", "Năm mươi", "Sáu mươi", "Bảy mươi", "Tám mươi", "Chín mươi"};
        String[] hundreds = {"", "Một trăm", "Hai trăm", "Ba trăm", "Bốn trăm", "Năm trăm", "Sáu trăm", "Bảy trăm", "Tám trăm", "Chín trăm"};

        if (n == 0) {
            return "Không";
        }

        int hundredsDigit = n / 100;
        int tensDigit = (n % 100) / 10;
        int onesDigit = n % 10;

        StringBuilder result = new StringBuilder();

        if (hundredsDigit > 0) {
            result.append(hundreds[hundredsDigit]).append(" ");
        }

        if (tensDigit > 1) {
            result.append(tens[tensDigit]).append(" ");
            if (onesDigit > 0) {
                result.append("|| ").append(ones[onesDigit]);
            }
        } else if (tensDigit == 1) {
            result.append("Mười").append(" ");
            if (onesDigit > 0) {
                result.append("|| ").append(ones[onesDigit]);
            }
        } else {
            if (onesDigit > 0) {
                result.append("|| ").append(ones[onesDigit]);
            }
        }

        return result.toString();
    }
}