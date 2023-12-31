package contronlling;

import java.text.DecimalFormat;
import java.time.Year;
import java.util.Random;
import java.util.Scanner;

public class Ex01IfElse {

	public static void main(String[] args) {
		// tạo hàm random
		Random rd = new Random();
		int number = rd.nextInt(5,20);
		System.out.println("Số ngẫu nhiên là số -->" + number);
		
		//kiểm tra số nguyên đó có phải số chẳn? print(year + number): ko in gì cả
		
		int currentYear = Year.now().getValue();
		boolean isEven = (number % 2 == 0);
		if(isEven) {
			System.out.println("number là số chẳn (+2023) "+(currentYear + number));
		}
		System.out.println("==========================");
		// nhập mk, kiểm tra độ dài của mk hợp lệ hay ko
		//nếu length>= 8 thì in ra mk hợp lệ ko thì nhập lại
		
		
		// mở kết nối nhập xuất đến bàn phím
		Scanner ip = new Scanner(System.in);
		/*
		System.out.println("Nhập mật khẩu: ");
		String password = ip.nextLine();
		int length  = password.length();
		if (length >= 8) {
			System.out.println("Mật khẩu hợp lệ");
		}else {
			System.out.println("Mật khẩu không hợp lệ");
		}
		*/
		System.out.println("==========================");

		
		// random điểm trung bình số thực (0,10)
		float point = rd.nextFloat(0,11);
		
		point = point>10f? 10f:point;
		System.out.println("Random điểm TB:"+ point);
		
		// pattern - công thức, cú pháp
		DecimalFormat df = new DecimalFormat("#,###.0");
		String formattedPoint = df.format(point);
		System.out.println("Random điểm TB:"+ formattedPoint);
		//ép kiểu lại float
		point = Float.parseFloat(formattedPoint);
		System.out.println("Random điểm TB:"+ point);
		
		/*
		if(point < 5) {
			System.out.println("Học lực -> Yếu");
		}else if(point < 6.5f ) {
			System.out.println("Học lực -> trung bình");
		}else if(point < 8 ) {
			System.out.println("Học lực -> khá");
		}else {
			System.out.println("Học lực -> giỏi");
		}
		*/
		/*
		String ranking;
		if(point < 5) {
			ranking = "Yếu";
		}else if(point < 6.5f ) {
			ranking = "trung bình";
		}else if(point < 8 ) {
			ranking = "khá";
		}else {
			ranking = "giỏi";
		}
		System.out.println("Học lực -->" + ranking);
		*/
		
		String ranking = point < 5 ? "yếu":
							point <6.5f? "Trung bình":
									point <8.0f? "khá": "giỏi";
		System.out.println("Học lực --> " +ranking);
		
		System.out.println("==========================");

		System.out.println("\n Toán tử 3 ngôi" );
		// (exp) ? result1: result2
		//random 2 số nguyên, rồi tim max(a,b);
		int a = rd.nextInt(12);
		int b = rd.nextInt(12);
		System.out.println("a-->"+ a);
		System.out.println("b-->"+ b);
		int max = (a>b)? a:b;
		System.out.println("max --> " +max);
		
		System.out.println("Kết thúc chương trình ...");
		ip.close(); // đóng kết nối 
	}
}
