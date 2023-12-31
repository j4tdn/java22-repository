package Controlling;

import java.text.DecimalFormat;
import java.time.Year;
import java.util.Random;
import java.util.Scanner;

public class Ex01IfElse {
	public static void main(String[] args) {
		// Random 1 số nguyên ngẫu nhiên từ [5;20)
		Random rd = new Random();
		int number = rd.nextInt(5,20);
		System.out.println("Số ngẫu nhiên -->" + number);
		
		int currentYear = Year.now().getValue();
		//boolean isEven = (number % 2 == 0);
		if ( (number % 2 == 0)) {
			System.out.println("number là số chẵn (+2023) -->" + (currentYear + number));
		}
		Scanner ip = new Scanner(System.in);
//		System.out.println(" Nhập mật khẩu : ");
//		String password = ip.nextLine();
//		int length = password.length();
//		if (length >= 8) {
//			System.out.println("Mật khẩu hợp lệ :");
//		}else {
//			System.out.println("Mật khẩu không hợp lệ :");
//		}
		
		
		float point = rd.nextFloat(0,11);
		if (point > 10f) {
			point = 10f;
		}
		
		
		DecimalFormat df = new DecimalFormat("#,###.0");
		String formatttedPoint = df.format(point);
		point = Float.parseFloat(formatttedPoint);
		
		System.out.println("DTB :" + formatttedPoint);
		
		
//		if (point<5) {
//			System.out.println("Học lực -> Yếu");
//		}else if(point < 6.5f){
//			System.out.println("Học lực -> TB");
//		}else if(point < 8.0f){
//			System.out.println("Học lực -> Khá");
//		}else {
//			System.out.println("Học lực -> Giỏi");
//		}
//		String ranking = "";
//		if (point<5) {
//			ranking = " Yếu";
//		}else if(point < 6.5f){
//			ranking = " TB";
//		}else if(point < 8.0f){
//			ranking = " Khá";
//		}else {
//			ranking = " Giỏi";
//		}
//		System.out.println("Học lực -> " + ranking);
		///t/
		System.out.println("\nToans tử 3 ngôi");
		
		int a  = rd.nextInt(12);
		int b  = rd.nextInt(12);

		
		int max = (a>b) ? a : b;
		System.out.println("Max " + max);

		System.out.println("Kết thúc chương trình ...");
		
		ip.close();
	}
	
}
