package Ex03;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();
        String output = revert(input);
        
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }

    public static String revert(String s) {
        s = s.trim().replaceAll("\\s+ " , "  ");
        String reversed = " "; 
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }

        return reversed;
    }
}
