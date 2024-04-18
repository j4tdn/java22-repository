import java.util.Scanner;

public class Ex02NameFormat {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập họ tên: ");
        String fullName = scanner.nextLine();

        StringBuilder formattedName = new StringBuilder();

        boolean newWord = true;

        for (int i = 0; i < fullName.length(); i++) {
            char currentChar = fullName.charAt(i);

            if (currentChar == ' ') {
                formattedName.append(currentChar);
                newWord = true; 
            } else {
                
                if (newWord) {
                    formattedName.append(Character.toUpperCase(currentChar));
                    newWord = false;
                } else {
                    formattedName.append(Character.toLowerCase(currentChar));
                }
            }
        }

        System.out.println("Họ tên đã được định dạng: " + formattedName.toString());

       
        scanner.close();
    }
}
