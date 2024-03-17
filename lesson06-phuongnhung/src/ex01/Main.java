package ex01;

import java.util.Scanner;

/*
 * Giải phương trình bậc nhất ax + b = 0 . Các hệ số nhập vào từ bàn phím. Sử dụng try -
catch để bẫy các lỗi khi nhập sai kiểu dữ liệu, ví dụ nhập số nhưng nhập chữ. Bẫy lỗi chia 0,
trường hợp xảy ra lỗi phải thông báo cho người dùng biết và nhập lại đến khi a b hợp lệ thì in ra
kết qua x = -b/a
 */
public class Main {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Giải phương trình bậc nhất ax + b = 0");
		double a,b;
		System.out.println("Nhập giá trị a");
		while (true) {
			try {
				a = input("a");
				break;
			}catch(ArithmeticException ae) {
				System.out.println(ae.getMessage() +"\n Nhập lại điiii");
			}
		}
		System.out.println("Nhập giá trị b");
		b = input("b");
		ip.close();
		System.out.println("Phương trình bạn vừa nhập vào là: " + a + "x + " + b + " = 0.");
		System.out.println("Nghiệm phương trình là:  x = " + (-b/a));

	}
	private static double input(String name) {
		double number = 0;
		while(true) {
			try {
				number = Double.parseDouble(ip.nextLine());
				if(name.equals("a") && number==0) {
					throw new ArithmeticException(">>> a cannot be Zero <<<");		
				}
				break;
				
			}catch (NumberFormatException e) {
				System.out.println("--> Nhập lại điiii");
			}
		}
		return number;
	}

}
