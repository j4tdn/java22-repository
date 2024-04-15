package Ex01;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào một chuỗi kí tự:");
		String inputString = sc.nextLine();
		
		//In ra	mỗi kí tự trên 1 dòng
		System.out.println("Mỗi kí tự trên một dòng:");
		for(int i = 0; i < inputString.length(); i++) {
			System.out.println(inputString.charAt(i));
		}
		
		//In ra mỗi từ trên một dòng
		System.out.println("Mỗi từ trên một dòng:");
		String[] words = inputString.split("\\+s");
		for(String word : words) {
			System.out.println(word);
		}
		 // In ra chuỗi đảo ngược theo kí tự
        System.out.println("Chuỗi đảo ngược theo kí tự:");
        StringBuilder reversedStringByChar = new StringBuilder(inputString).reverse();
        System.out.println(reversedStringByChar);

        // In ra chuỗi đảo ngược theo từ
        System.out.println("Chuỗi đảo ngược theo từ:");
        String[] reversedWords = new StringBuilder(inputString).reverse().toString().split("\\s+");
        for (String word : reversedWords) {
            System.out.print(new StringBuilder(word).reverse() + " ");
        }
	}

}
