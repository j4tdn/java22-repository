package Ex04;


public class Main {
	public static void main(String[] args) {
		String Tk = "byztkhx256";
		String Mk = "admin123";
		try {
			if(isValidPassword(Mk)) {
				System.out.println("Đăng kí tài khoản thành công");
			} else {
				throw new Exception("Mật khẩu không hợp lệ!");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	public static boolean isValidPassword(String password) {
		if(password.length() < 8) {
			return false;
		}
		if(!password.matches(".*[A-Z].*")) {
			return false;
		}
		if(!password.matches(".*[a-z].*")) {
			return false;
		}
		if(!password.matches(".*\\d.*")) {
			return false;
		}
		if (!password.matches(".*[~!@#$%^&*0-_=+[Ю|:,<>/?]].*")) {
			return false;
		}
		
		return true;
	}
}
