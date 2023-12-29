package controlling;

import java.text.DecimalFormat;
import java.time.Year;
import java.util.Random;
import java.util.Scanner;

public class Ex01IfElse {
	public static void main (String [] args) {
		
		//kiem tra so random tao ra co chia het cho 2 khong
		Random rd = new Random();
		int a = rd.nextInt(5,20);
		
		int currentYear = Year.now().getValue();
		boolean isEven = (a%2 == 0);
		if (isEven) {
			System.out.println(currentYear + a);
		}
		else{
			System.out.println("Ket thuc chuong trinh");
		}
		
		//nhap mat khau va kiem thu
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap mat khau :");
		String password = sc.nextLine();
		if(password.length() >= 8) {
			System.out.println("Mat khau la: " + password);
		}
		else {
			System.out.println("Sai mat khau");
		}
		
		
		//random diem trung binh cua hoc sinh
		float diem = rd.nextFloat(0.0f,10.1f);
		//		float diem =7.8946442f;
		if(diem>10.0f) {
			diem =10.0f;
		}	
		
		//Pattern - công thức, cú pháp
		DecimalFormat df = new DecimalFormat("#,###.#");
		String formattedPoint = df.format(diem);//định dạng 1 giá trị KDL ? sang String
		diem = Float.parseFloat(formattedPoint);
		Float point = diem;
		System.out.println("DTB "+ diem);
		//System.out.println("DTB : " +formattedPoint);
		
		
		if (diem < 5.0f) {
			System.out.println("Yeu");
		}
		else if(diem<6.5f) {
			System.out.println("Trung Binh ");
		}
		else if(diem<8.0f) {
			System.out.println("Kha ");
		}
		else{
			System.out.println("Gioi ");
		}
		
		 String ranking = point <5 ? "Yeu"
										: point < 6.5f ? "Trung Binh"
												: point < 8.0f ? "kha"
														: "gioi";
		 
		 System.out.println(ranking);
		//toan tu 3 ngoi
		System.out.println("\nToan tu 3 ngoi");
		//VD:random 2 so nguyen ngau nhien a va b [0,12]
		//tim max của 2 số
		
		int x = rd.nextInt(12);
		int y = rd.nextInt(12);
		int max = (x>y) ? x : y;
		System.out.println("max " + max);
		
		
		System.out.println("\nKet thuc chuong trinh ");
		sc.close();
		
	}
}
