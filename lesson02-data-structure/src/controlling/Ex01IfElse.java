package controlling;

import java.text.DecimalFormat;
import java.time.Year;
import java.util.Random;
import java.util.Scanner;

public class Ex01IfElse {
	public static void main(String[] args) {
		
		// Random 1 số nguyên ngẫu nhiên từ [5, 20)
		Random rd = new Random();
		int number = rd. nextInt(5, 20);
		System.out.println("Số ngẫu nhiên --> " + number);
		
		// Kiểm tra số nguyên đó có phải là số chẵn không
		// Nếu là số chẵn thì sẽ in ra năm hiện tại + số chẵn
		// Nếu k phải --> k in ra k làm gì cả
		int currentYear = Year.now().getValue();
		boolean isEven = (number % 2 == 0);
		
		// if(number % 2 == 0){
		if(isEven) {
			System.out.println("number là số chẵn(+2023) --> " + (currentYear + number));
		}
		System.out.println("Kết thúc chương trình ...");
		
		// Nhập vào mật khẩu, kiểm tra độ dài của mật khẩu có hợp lệ hay k
		
		Scanner ip = new Scanner(System.in);
		/*
		System.out.println("Nhập mật khẩu: ");
		String password = ip.nextLine();
		
		int length = password.length();
		if(length >=8) {
			System.out.println("Mật khẩu hợp lệ");
		}else {
			System.out.println("Mật khẩu không hợp lệ");
		}
		*/
		
		System.out.println("\n\n");
		
		float point = rd.nextFloat(0, 11);
		if(point > 10f) {
			point = 10f;
		}
		
		point = point > 10f ? 10f : point;
		//point = 7f;
		
		DecimalFormat  df = new DecimalFormat("#,###.0");
		String formatedPoint = df.format(point);
		point = Float.parseFloat(formatedPoint);
		
		System.out.println("ĐTB: " + point);
		
//		if (point < 5) {
//			System.out.println("Học lực -> Yếu");
//		}else if(point < 6.5) {
//			System.out.println("Học lực -> Trung bình");
//		}else if(point < 8) {
//			System.out.println("Học lực -> Khá");
//		}else {
//			System.out.println("Học lực -> Giỏi");
//		}
//		String ranking = "";
//		if (point < 5) {
//			ranking = "Yếu";
//		}else if(point < 6.5) {
//			ranking = "Trung bình";
//		}else if(point < 8) {
//			ranking = "Khá";
//		}else {
//			ranking = "Giỏi";
//		}
		
		String ranking = point < 5 ? "Yếu"
							: point < 6.5f ? "Trung bình"
									: point < 8.0f ? "Khá"
													: "Giỏi";
		
		System.out.println("Học lực --> " + ranking);
		
		System.out.println("\nToán tử 3 ngôi");
		
		int a = rd.nextInt(12);
		int b = rd.nextInt(12);
		System.out.println("a --> " + a);
		System.out.println("b --> " + b);
		
		int max = (a > b) ? a : b;
		System.out.println("max --> " + max);
		
		System.out.println("\nKết thúc chương trình ...");
		ip.close();
	}
}
