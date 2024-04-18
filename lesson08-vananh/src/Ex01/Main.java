package Ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.print("Nhập vào một chuỗi chỉ chứa các kí tự tiếng Việt có dấu và dấu cách: ");
            input = scanner.nextLine();
        } while (!isValidInput(input));

        printCharacters(input);
        printWords(input);
        printReversedCharacters(input);
        printReversedWords(input);

        scanner.close();
    }

    private static boolean isValidInput(String input) {
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!(Character.isLetter(ch) || ch == ' ' || Character.getType(ch) == Character.DASH_PUNCTUATION)) {
                System.out.println("Chuỗi không hợp lệ. Hãy nhập lại!");
                return false;
            }
        }
        return true;
    }

    private static void printCharacters(String input) {
        System.out.println("Các kí tự trong chuỗi:");
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            System.out.println(ch);
        }
    }

    private static void printWords(String input) {
        System.out.println("\nCác từ trong chuỗi:");
        String[] words = input.split("\\s+");
        for (String word : words) {
            System.out.println(word);
        }
    }

    private static void printReversedCharacters(String input) {
        System.out.println("\nChuỗi đảo ngược theo kí tự:");
        for (int i = input.length() - 1; i >= 0; i--) {
            char ch = input.charAt(i);
            System.out.print(ch);
        }
    }

    private static void printReversedWords(String input) {
        System.out.println("\nChuỗi đảo ngược theo từ:");
        String[] reversedWords = new StringBuilder(input).reverse().toString().split("\\s+");
        for (String reversedWord : reversedWords) {
            System.out.print(reversedWord + " ");
        }
    }
}
