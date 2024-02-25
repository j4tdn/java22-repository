package Bai3;

import java.util.Scanner;

public class KiemTraSoLonNhat {
    public static int getMaxValidNumber(String input) {
        int maxNumber = 0;
        int currentNumber = 0;
        for (char c : input.toCharArray()) { 
            if (Character.isDigit(c)) { 
                currentNumber = currentNumber * 10 + Character.getNumericValue(c); 
            } else { 
                maxNumber = Math.max(maxNumber, currentNumber);
                currentNumber = 0; 
            }
        }
        maxNumber = Math.max(maxNumber, currentNumber); 
        return maxNumber;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();
        int result = getMaxValidNumber(input);
        if (result == 0) {
            System.out.println("Không có số tự nhiên hợp lệ trong chuỗi.");
        } else {
            System.out.println("Số tự nhiên hợp lệ lớn nhất trong chuỗi: " + result);
        }
    }
}
