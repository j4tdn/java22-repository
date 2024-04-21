package ex04;

public class Main {
	/*
	 Viết chương trình thực hiện chức năng đăng ký tài khoản
		B1. Nhập tên tài khoản ví dụ byztkhx256
		B2. Nhập mật khẩu admin123
		Yêu cầu mật khẩu như sau:
		1. Độ dài mật khẩu: >= 8
		2. Có ít nhất 1 chữ số, 1 kí tự in hoa, và một kí tự đặc biệt (~!@#$%^&*)
		3. Không được trùng quá 3 ký tự với tên tài khoản [Đăng ký khi bắt đầu chương trình]
		Sau khi đã thỏa mãn yêu cầu thông báo đăng ký tài khoản thành công
	 */
	public static void main(String[] args) {
		String username = "byztkhx256";
		String password = "admin123@";
		
		try {
			checkPassword(password);
		} catch (IllegalArgumentException iae) {
			System.out.println(iae.getMessage());
		}
		
	}
	private static void checkPassword(String pass)  {
		if (pass.length() < 8) {
			throw new IllegalArgumentException(" Mật khẩu phải dài hơn 8 ký tự trở lên ");
		}
		if (!isA_Z(pass) || !isChar(pass) || !isNum(pass)) {
			throw new IllegalArgumentException(" Mật khẩu phải có ít nhất 1 chữ số, 1 kí tự in hoa, và một kí tự đặc biệt (~!@#$%^&*)");
		}
	}
	private static boolean isNum(String str) {
		for(char c : str.toCharArray()) {
			if(c >= '0' && c <= '9') {
				return true;
			}
		}
        return false;
    }
	private static boolean isA_Z(String str) {
		for(char c : str.toCharArray()) {
			if(c >= 'A' && c <= 'Z') {
				return true;
			}
		}
        return false;
    }
	private static boolean isChar(String str) {
		for(char c : str.toCharArray()) {
			if(c =='~'||c=='!'|| c=='@'||c=='#'||c=='$'||c=='%'||c=='^'||c=='&'||c=='*') {
				return true;
			}
		}
		return false;
	}
	
}
