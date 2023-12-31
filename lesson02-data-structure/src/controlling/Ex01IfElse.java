package controlling;

import java.text.DecimalFormat;
import java.time.Year;
import java.util.Random;
import java.util.Scanner;

public class Ex01IfElse {
	
	public static void main(String[] args) {
		
		// Mở kết nối nhập xuất đến bàn phím
		Scanner ip = new Scanner(System.in);
		
		// Random 1 số nguyên ngẫu nhiên từ [5, 20)
		/* 
		Random rd = new Random();
		int number = rd.nextInt(5, 20);
		System.out.println("số ngẫu nhiên --> " + number);
		
		// Kiểm tra số nguyên đó có phải là số chẵn không
		// Nếu nó là số chẵn thì sẽ in ra năm hiện tại + số chẵn đó
		// Nếu không phải --> ko làm gì cả
		
		int currentYear = Year.now().getValue();
		//boolean isEven = (number % 2 == 0);
		
		//if(isEven ) {
		if(number % 2 == 0) {
			System.out.println("number là số chẵn (+2023) " + (currentYear + number));
		}
		
		// Nhập vào mật khẩu, kiểm tra độ dài của mật khẩu có hợp lệ hay không
		// Nếu độ dài mật khẩu >= 8 --> in ra mật khẩu hợp lệ
		// Nếu ko thỏa mãn <=8 --> in ra mật khẩu ko hợp lệ vui lòng nhập lại
		
		
		System.out.print("Nhập mật khẩu: ");
		String password = sc.nextLine();
		
		if(password.length() >= 8 ) {
			System.out.println("Mật khẩu hợp lệ");
		}
		else {
			System.out.println("Mật khẩu không hợp lệ");
		}
		*/
		
		// Random điểm trung bình (số thực) của học sinh [0, 10]
		// KQ: số ko biết được số thập phân bao nhiêu, làm tròn lấy 1 chữ số thập phân
		// Nếu điểm mà 
		// + [0, 5) : yếu
		// + [5, 6.5) : trung bình
		// + [6.5, 8) : khá
		// + [8, 10] : giỏi
		
		Random rd = new Random();
		float point = rd.nextFloat(0, 11);
		if (point > 10f ) {
			point = 10;
		}
		
		DecimalFormat df = new DecimalFormat("#,###.0");
		String formattedPoint = df.format(point);
		point = Float.parseFloat(formattedPoint);
		System.out.println("Điểm trung bình: " + point);
		
		/*
		if (point < 5) {
			System.out.println("Học lực --> Yếu");
		}
		else if (point < 6.5f) {
			System.out.println("Học lực --> Trung bình");
		}
		else if (point < 8.0f) {
			System.out.println("Học lực --> Khá");
		}
		else {
			System.out.println("Học lực --> Giỏi");
		}
		*/
		String ranking = "";
		if (point < 5) {
			ranking = "yếu";
		}
		else if (point < 6.5f) {
			ranking = "Trung bình";
		}
		else if (point < 8.0f) {
			ranking = "Khá";
		}
		else {
			ranking = "Giỏi";
		}
		
		System.out.println("Học lực --> " + ranking);
		
		System.out.println("\nToán Tử 3 ngôi");
		
		// VD: Random 2 số nguyên ngẫu nhiên a và b [0, 12]
		// Yêu cầu: Tìm max của 2 số
		
		int a = rd.nextInt(12);
		int b = rd.nextInt(12);
		System.out.println("a --> " + a);
		System.out.println("b --> " + b);
		/*
		int max;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		*/
		int max = (a > b) ? a : b;
		System.out.println("max --> " + max);
		
		System.out.println("Kết thúc chương trình...");
		ip.close();
	}

}
