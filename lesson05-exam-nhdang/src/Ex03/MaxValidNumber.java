package Ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxValidNumber {
    public static void main(String[] args) {
    	System.out.println("Nhập chuỗi: ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        ArrayList<Integer> numbers = new ArrayList<>();
        int number = 0;
        int maxValidNumber = 0;
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (Character.isDigit(ch)) {
                number = number * 10 + Character.getNumericValue(ch);
            } else {
                if (number > 0) {
                    numbers.add(number);
                    maxValidNumber = Math.max(maxValidNumber, number);
                    number = 0;
                }
            }
        }
        if (number > 0) {
            numbers.add(number);
            maxValidNumber = Math.max(maxValidNumber, number);
        }
        System.out.println("Số hợp lệ lớn nhất: " + maxValidNumber);
    }
}
