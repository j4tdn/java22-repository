package controlling;

import java.text.DecimalFormat;
import java.time.Year;
import java.util.Random;
import java.util.Scanner;

public class Ex01IfElse {

	public static void main(String[] args) {
		
		// Randome q so nguyen nhien tien tu [5, 20)
		
		Random rd = new Random();
		int number = rd.nextInt(5,20);
		
		// kiem tra so nguyen do cps phai la so chan khong
		
		
		int currentYear = Year.now().getValue();
		boolean isEven = (number % 2 == 0);
		if(isEven) {
			System.out.println("Number la so chan (+ 2023)--> " + (currentYear + number));
		}
		
		System.out.println("ket thuc chhong trinh ...");
		
		
		// nhap vao mat khau , kiem tra do dai cua mat khau co hop le hay khong
		// neu do dai cua mat khau >=8 --> in ra mat khau hop le
		// nguoc kai --> in ra mat khau hop le, vui long nhap lai
		// mo ket noi nhpa xuat den ban phim
		Scanner ip = new Scanner(System.in);
		
		/*System.out.println("nhap mat khau: ");
		String password = ip.nextLine();
		
		int length = password.length();
		if(length >= 8) {
			System.out.println("mat khau hop le");
		}
		else  {
			System.out.println("mat khau khong hop le");
		}
		*/
		System.out.println("\n\n");
		//Random điểm trung bình (số thực) của học sinh [0.0, 10.0]

				// KQ: số ko biết để số thập phân bao nhiêu, làm tròn lấy 1 chữ số thập phâ
				// Nếu điểm mà
				// [0, 5) yeu
				//[5, 6.5): Trung Bình
				// [6.5, 8): Kha
				//[8, 18]: Gioi
		float point = rd.nextFloat(0,11);//[0.0,11.0)-->0.0 -> 10.99
		if(point > 10f) {
			point = 10f;
		}
		point = point > 10f ? 10f : point;
		
		
		
		//#,###.#
		// point = 7.8642797f; // 7.9
		// point 7.002f; // 7
		//#,###.0--> luôn luôn tối thiểu và tối đa là 1 chữ số thập phân
		// point = 7.8642797f; // 7.9
		// point 7.002f; // 7.0
		// point 7f
		
		//patten cong thuc , cu phap

		DecimalFormat df = new DecimalFormat("#,###.#");
		String formattedPoint = df.format(point);// dinh dang 1 gia tri KDL ? sang String de in ra
		point = Float.parseFloat(formattedPoint);
		
		System.out.println("Diem Trung Binh :  " + point) ;
		
		/*if( point < 5 ) {
			System.out.println("hoc luc -> Yếu " );
		}else if(point < 6.5f) {
			System.out.println("học lực -> trung bình ");
		}else if(point < 8.0f) {
			System.out.println("học lực -> khá ");
		}else {
			System.out.println("học lực -> Giỏi");
		}
		*/
		/*String ranking =  "";
		if (point < 5) {
		ranking = "Yếu";
		} else if (point < 6.5f) {
		ranking= "Trung Bình";
		} else if (point < 8.0f) {
		ranking = "Khá";
		} else {
		ranking = "Giỏi";
		System.out.println("Học lực-->" + ranking);
		*/
		String ranking = point < 5 ? "Yếu"
				: point < 6.5f ? "Trung bình"
						: point < 8.0f ? "Khá"
								: "Giỏi";
		System.out.println("Học lực --> " + ranking);
									
		
		System.out.println("\nToán tử  3 ngôi");

		/*if (exp) {

			// result1(statement1) } 
			 else {
			  // result2(statement2)
			    }

			(exp)? resulti: result2;

			// VD: random 2 số nguyên ngẫu nhiên a và b [0, 12]

			//Yêu cầu: Tìm max của 2 só*/

			int a = rd.nextInt(12);

			int b = rd.nextInt(12);

			System.out.println("a --> " + a);

			System.out.println("b -->" + b);

			int max = (a > b) ? a:b;

			System.out.println("max--> " + max);

		
		
		System.out.println("ket thuc chuong trinh");
		ip.close();// dong ket noi
				

	}

}