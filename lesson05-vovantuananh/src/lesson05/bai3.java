package lesson05;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String input = scanner.nextLine();

        int maxValidNumber = getMaxValidNumber(input);
        
        if (maxValidNumber != -1) {
            System.out.println("So tu nhien hop le nhat la: " + maxValidNumber);
        } else {
            System.out.println("Khong co so tu nhien trong chuoi");
        }
        
        scanner.close();
    }

    public static int getMaxValidNumber(String input) {
        int maxValidNumber = 0;
        int currentNumber = 0;
        boolean isValid = false;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                currentNumber = currentNumber * 10 + Character.getNumericValue(c);
                isValid = true;
            } else {
                if (isValid) {
                    maxValidNumber = Math.max(maxValidNumber, currentNumber);
                    currentNumber = 0;
                    isValid = false;
                }
            }
        }

        if (isValid) {
            maxValidNumber = Math.max(maxValidNumber, currentNumber);
        }

        return maxValidNumber;
    }
}
