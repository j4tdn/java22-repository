package ex01;

import java.util.Scanner;

public class Ex01 { 
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.println("Nhập vào một chuỗi kí tự:");
        String input = ip.nextLine();

        System.out.println("Các kí tự trên từng dòng:");
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }

        System.out.println("Các từ trên từng dòng:");
        String[] words = input.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println("Chuỗi đảo ngược theo kí tự:");
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
        System.out.println();
        
        System.out.println("Chuỗi đảo ngược theo từ:");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i > 0) {
                System.out.print(" ");
            }
        }
    }
}