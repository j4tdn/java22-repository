package controlling;

import java.text.DecimalFormat;
import java.time.Year;
import java.util.Random;
import java.util.Scanner;

public class Ex01IfElse {
	public static void main(String[] args) {
		
		//Random 1 so nguyen ngau nhien tu [5,20)
		
		Random rd = new Random();
//		int number = rd.nextInt();
		int number = rd.nextInt(5,20);
		System.out.println("so ngau nhien --> " + number);
		
		int currentYear = Year.now().getValue();
		boolean isEven = (number % 2 == 0);
		
//		if (isEven) {
		if (number % 2 == 0) {
			System.out.println("Number la so chan(+2023) -->" + (currentYear + number ));
		}
		
//		System.out.println("Ket thuc chuong trinh");
		
		Scanner ip = new Scanner(System.in);
		
		/*
		System.out.println("Nhap mat khau: ");
		String password = ip.nextLine();
		
		
		int length = password.length();
		if (length >=8) {
			System.out.println("Mat khau hop le");
		}
		else {
			System.out.println("Mat khau ko hop le");
		}
		
		*/
		
		System.out.println("\n\n");
		
		float point = rd.nextFloat(0,11);
		if (point > 10f) {
			point = 10f;
		}
		
//		point = 7f;
		
		DecimalFormat df = new DecimalFormat("#,###.0");
		String formattedPoint = df.format(point);  // dinh dang 1 gia tri KDL sang string de in ra
		point = Float.parseFloat(formattedPoint);
		
		System.out.println("ĐTB: " + point);
		
		if (point < 5) {
			System.out.println("Hoc luc -> Yếu");
		}
		else if (point < 6.5f) {
			System.out.println("Hoc luc -> Trung bình");
		}
		
		else if (point < 8.0f) {
			System.out.println("Học luc -> Kha");
		}
		else {
			System.out.println("Học lực -> Giỏi");
		}
		
		String ranking = point < 5 ? "Yếu"
								   : point < 6.5f ? "Trung bình"
										          : point < 8.0f ? "Khá"
										        		           : "Giỏi";
		
		System.out.println("Diem trung binh: " + formattedPoint);
		
		System.out.println("\n Toán tử 3 ngôi");
		
		int a = rd.nextInt(12);
		int b = rd.nextInt(12);
		System.out.println("a --> " + a);
		System.out.println("b --> " + b);
		
		int max = (a > b) ? a : b;
		System.out.println("max --> " + max);
		
		System.out.println("Ket thuc chuong trinh");
		ip.close();
	}
}
