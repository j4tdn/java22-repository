import java.util.Scanner;

public class Ex03StringCharacter {
    
    public static String removeExtraSpaces(String s) {
        StringBuilder result = new StringBuilder();
        boolean lastCharWasSpace = false;
        
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                result.append(c);
                lastCharWasSpace = false;
            } else {
                if (!lastCharWasSpace) {
                    result.append(c);
                }
                lastCharWasSpace = true;
            }
        }
        
        return result.toString();
    }

    
    public static String revert(String s) {
        s = removeExtraSpaces(s);
        
        StringBuilder reversedString = new StringBuilder();
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                reversedString.append(currentWord.reverse()).append(" ");
                currentWord = new StringBuilder();
            } else {
                currentWord.append(c);
            }
        }

        if (currentWord.length() > 0) {
            reversedString.append(currentWord.reverse());
        }

        return reversedString.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        String input = scanner.nextLine();

        String output = revert(input);
        System.out.println("Output: " + output);

        scanner.close();
    }
}
