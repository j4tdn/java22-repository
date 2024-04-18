import java.text.Normalizer;
import java.util.Scanner;

public class Ex03Vietnamese {
    
    public static String removeDiacritics(String input) {
        
        String normalizedString = Normalizer.normalize(input, Normalizer.Form.NFD);
    
        StringBuilder sb = new StringBuilder();
        for (char c : normalizedString.toCharArray()) {
            
            if (Character.getType(c) != Character.NON_SPACING_MARK) {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào chuỗi tiếng Việt có dấu: ");
        String input = scanner.nextLine();

        String output = removeDiacritics(input);

        System.out.println("Chuỗi không dấu: " + output);

        scanner.close();
    }
}

