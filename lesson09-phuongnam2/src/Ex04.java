import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập tài khoản --> " );
		String username = ip.nextLine();
		
		do {
		System.out.println("Nhập mật khẩu --> ");
		String password = ip.nextLine();
		
		} while(!checkPasswordIsValid(username));
		
		ip.close();
	}
	
	public static boolean checkPasswordIsValid(String password) {
		
		if (password.length() < 8) {
			System.out.println("Độ dài mật khẩu phải có tối thiểu 8 kí tự");
			return false;
		}
		
		
		return true;
	}
	
	
}
