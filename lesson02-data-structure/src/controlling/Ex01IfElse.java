package controlling;

import java.text.DecimalFormat;
import java.time.Year;
import java.util.Random;
import java.util.Scanner;

public class Ex01IfElse {
	
	public static void main(String[] args) {
		
		// Random 1 số nguyên ngẫu nhiêu từ [5, 20)
		Random rd = new Random();
		int number = rd.nextInt(5, 20);
		System.out.println("Số ngẫu nhiên --> " + number);
		
		// Kiểm tra số nguyên đó có phải là số chẵn không
		// Nếu là số chẵn thì sẽ in ra năm hiện tại + số chẵn đó
		// Nếu ko phải --> ko in ra ko làm gì cả
		
		int currentYear = Year.now().getValue();
		// boolean isEven = (number % 2 == 0);
		
		// if(isEven) {
		if (number % 2 == 0) {
			System.out.println("number là số chẵn(+2023) --> " + (currentYear + number));
		}
		
		
		
		// Nhập vào mật khẩu, kiểm tra độ dài của mật khẩu có hợp lệ hay không
		// Nếu độ dài của mật khẩu >= 8 --> in ra mật khẩu hợp lệ
		// Ngược lại --> in ra mật khẩu ko hợp lệ, vui lòng nhập lại
		
		// mở kết nối nhập xuất đến bàn phím
		Scanner ip = new Scanner(System.in);
		
		/*
		System.out.print("Nhập mật khẩu: ");
		String password = ip.nextLine();
		
		int length = password.length();
		if (length >= 8) {
			System.out.println("Mật khẩu hợp lệ");
		} else {
			System.out.println("Mật khẩu không hợp lệ");
		}
		*/
		
		System.out.println("\n\n");
		
		// Random điểm trung bình(số thực) của học sinh [0.0, 10.0]
		// KQ: số ko biết dc số thập phân bao nhiêu, làm tròn lấy 1 chữ số thập phân
		// Nếu điểm mà
		// + [0, 5)   : Yếu
		// + [5, 6.5) : Trung Bình
		// + [6.5, 8) : Khá
		// + [8, 10]  : Giỏi
		float point = rd.nextFloat(0, 11); // [0.0, 11.0) --> 0.0 -> 10.99
		/*
		if (point > 10f) {
			point = 10f;
		}
		*/
		
		point = point > 10f ? 10f : point; 
		// #,###.#
		// point = 7.8642797f; // 7.9
		// point = 7.002f; // 7
		
		// #,###.0 --> luôn luôn tối thiểu và tối đa là 1 chữ số thập phân
		// point = 7.8642797f; // 7.9
		// point = 7.002f; // 7.0
		// point = 7f;
		
		// pattern - công thức, cú pháp
		DecimalFormat df = new DecimalFormat("#,###.0");
		String formattedPoint = df.format(point); // định dạng 1 giá trị KDL ? sang string để in ra
		point = Float.parseFloat(formattedPoint);
		
		System.out.println("Điểm trung bình: " + point);
		
		/*
		if (point < 5) {
			System.out.println("Học lực -> Yếu");
		} else if (point < 6.5f) {
			System.out.println("Học lực -> Trung Bình");
		} else if (point < 8.0f) {
			System.out.println("Học lực -> Khá");
		} else {
			System.out.println("Học lực -> Giỏi");
		}
		*/
		
		/*
		String ranking = "";
		if (point < 5) {
			ranking = "Yếu";
		} else if (point < 6.5f) {
			ranking = "Trung Bình";
		} else if (point < 8.0f) {
			ranking = "Khá";
		} else {
			ranking = "Giỏi";
		}
		*/
		
		String ranking = point < 5 ? "Yếu" 
								   : point < 6.5f ? "Trung Bình"
										          : point < 8.0f ? "Khá"
										        		         : "Giỏi";
		
		System.out.println("Học lực --> " + ranking);
		
		System.out.println("\nToán tử 3 ngôi");
		
		/*
		 
		 if (exp) {
		    // result1(statement1)
		 } else {
		    // result2(statement2)
		 }
		 
		 (exp) ? result1 : result2;
		 */
		
		// VD: random 2 số nguyên ngẫu nhiên a và b [0, 12]
		// Yêu cầu: Tìm max của 2 số
		int a = rd.nextInt(12);
		int b = rd.nextInt(12);
		System.out.println("a --> " + a);
		System.out.println("b --> " + b);
		
		int max = (a > b) ? a : b;
		System.out.println("max --> " + max);
		
		System.out.println("\nKết thúc chương trình ...");
		ip.close(); // đóng kết nối
	}
	
}
