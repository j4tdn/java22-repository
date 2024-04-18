
import java.util.Scanner;

public class Ex01CharactersPrint {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Nhập vào một chuỗi ký tự bất kỳ: ");
        String input = scanner.nextLine();

        
        System.out.println("\n1. In ra mỗi ký tự trên một dòng:");
        for (char c : input.toCharArray()) {
            System.out.println(c);
        }

        
        System.out.println("\n2. In ra mỗi từ trên một dòng:");
        String[] words = input.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        
        System.out.println("\n3. In ra chuỗi đảo ngược theo ký tự:");
        StringBuilder reversedString = new StringBuilder(input);
        reversedString.reverse();
        System.out.println(reversedString);

       
        System.out.println("\n4. In ra chuỗi đảo ngược theo từ:");
        StringBuilder reversedWords = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedWords.append(words[i]);
            if (i != 0) {
                reversedWords.append(" ");
            }
        }
        System.out.println(reversedWords.toString());

        
        scanner.close();
    }
}
