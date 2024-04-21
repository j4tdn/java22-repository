
public class Ex04 {

	public static void main(String[] args) {

		String account = "bfbhsbhfe123";
		String password = "admin123";
		checkLength(password);
		checkNum(password);
		checkUppercase(password);
		checkSpecialchar(password);
	}
	public static void checkLength(String pass) {
		if(pass.length() < 8) {
			throw new IllegalArgumentException ("Mat khau khong hop le (>=8)");
		}
	}	
    public static void checkNum(String pass) {
			for(char c : pass.toCharArray()) {
				if(c >= '0' && c <= '9') {
					System.out.println("Hop le");
				}
			}
		System.out.println("Mat khau khong hop le ( it nhat 1 chu so )");      
	}
    public static void checkUppercase(String pass) {
    	for(char c : pass.toCharArray()) {
			if(c >= 'A' && c <= 'Z') {
				System.out.println("Hop le");
			}
		}
	System.out.print("Mat khau khong hop le ( it nhat co 1 ki tu hoa)");
    }
    
    public static void checkSpecialchar(String pass) {
		for(char c : pass.toCharArray()) {
			if(c =='~'||c=='!'|| c=='@'||c=='#'||c=='$'||c=='%'||c=='^'||c=='&'||c=='*') {
				System.out.println("Hop le");
			}
		}
		System.out.println("Mat khau khong hop le ( it nhat co 1 ki tu dac biet");
	}
    
    
	
	

}
