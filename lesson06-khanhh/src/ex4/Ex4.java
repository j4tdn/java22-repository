package ex4;

import java.util.Scanner;

public class Ex4 {
    public static String readNumber(int n) {
        String[] unitRow = {"Không", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín"};
        String[] dozens = {"Mười", "Hai mươi", "Ba mươi", "Bốn mươi", "Năm mươi", "Sáu mươi", "Bảy mươi", "Tám mươi", "Chín mươi"};
        String[] hundreds = {"Một trăm", "Hai trăm", "Ba trăm", "Bốn trăm", "Năm trăm", "Sáu trăm", "Bảy trăm", "Tám trăm", "Chín trăm"};

        int hundredDigit = n / 100;
        int tenDigit = (n % 100) / 10;
        int oneDigit = n % 10;

        StringBuilder result = new StringBuilder();

        if (hundredDigit != 0) {
            result.append(hundreds[hundredDigit]).append(" ");
        }

        if (tenDigit != 0) {
            if (tenDigit == 1) {
                result.append("Mười ");
            } else {
                result.append(dozens[tenDigit]).append(" ");
            }
        }

        if (oneDigit != 0 || n == 0) {
            result.append(unitRow[oneDigit]);
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
    
    	Scanner ip = new Scanner(System.in);
    	
    	int n = 0;
    	
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("n = ");
                n = Integer.parseInt(ip.nextLine());

                if (n >= 0 && n <= 999) {
                    validInput = true;
                } else {
                    System.out.println("nhap sai");
                }
            } catch (NumberFormatException e) {
                System.out.println("nhap sai");
            }
        }
    	
    	System.out.print(readNumber(n));
    }   	
}
