package ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ người dùng
        System.out.println("Nhập vào một chuỗi kí tự:");
        String input = scanner.nextLine();

        // In ra từng kí tự trên một dòng
        System.out.println("Các kí tự trên từng dòng:");
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }

        // In ra mỗi từ trên một dòng
        System.out.println("Các từ trên từng dòng:");
        String[] words = input.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        // In ra chuỗi đảo ngược theo kí tự
        System.out.println("Chuỗi đảo ngược theo kí tự:");
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
        System.out.println();

        // In ra chuỗi đảo ngược theo từ
        System.out.println("Chuỗi đảo ngược theo từ:");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i > 0) {
                System.out.print(" ");
            }
        }
    }
}
