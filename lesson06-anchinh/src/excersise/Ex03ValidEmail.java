package excersise;

import java.util.Scanner;
import exception.InvalidEmailException;

public class Ex03ValidEmail {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		while(true) {
			try {
				String email = null;
				System.out.print("Nhập email: ");
				email = ip.nextLine();
				isValidEmail(email);
				break;
			} catch (InvalidEmailException e) {
				System.out.println(e.getMessage());
			}
		}
		ip.close();
		
	}
	public static void isValidEmail(String email) throws InvalidEmailException{
		if(email.isEmpty()) {
			throw new InvalidEmailException("email không đc để trống");
		}
		
		int atIndex = email.indexOf('@');
        if (atIndex == -1) {
        	throw new InvalidEmailException("email phải chứa ký tự '@'.");
        }
        
        String prefix = email.substring(0, atIndex);
        if (prefix.isEmpty() || prefix.contains(" ") || prefix.startsWith(".") || !prefix.matches("[a-zA-Z0-9_.-]+")) {
            throw new InvalidEmailException("Phần đầu của email không được rỗng, không được chứa khoảng trắng, "
            		+ "không được bắt đầu bằng dấu chấm và chứa kí tự đặc biệt.");
        }

        
        String domain = email.substring(atIndex + 1);
        if (domain.isEmpty() || domain.contains(" ") || !domain.contains(".") || domain.endsWith(".")) {
            throw new InvalidEmailException("Phần sau của email không được rỗng, không được chứa khoảng trắng, "
            		+ "phải chứa ít nhất một dấu chấm và không được kết thúc bằng dấu chấm.");
        }
        System.out.println("Email hợp lệ");
	}
}
