package Ex03;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập email");
        String email;
        boolean validEmail = false;
        do {
            email = sc.nextLine();
            try {
                validEmail = CheckedEmail(email);
                if (!validEmail)
                    throw new Exception("Email không hợp lệ, nhập lại");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!validEmail);
        System.out.println("Email của bạn: ");
        System.out.println(email);
    }

    static boolean CheckedEmail(String email) {
    	String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@mail\\.com$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }
}
