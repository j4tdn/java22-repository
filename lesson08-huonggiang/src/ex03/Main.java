package ex03;

import java.text.Normalizer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Nhập vào một chuỗi Tiếng Việt có dấu:");
        String input = scanner.nextLine();

        String output = stripVietnameseDiacritics(input);

        System.out.println("Chuỗi sau khi loại bỏ dấu: " + output);
    }

    public static String stripVietnameseDiacritics(String str) {
        String temp = Normalizer.normalize(str, Normalizer.Form.NFD);
        return temp.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }
}

