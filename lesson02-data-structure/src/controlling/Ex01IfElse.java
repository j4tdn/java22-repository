package controlling;

import java.text.DecimalFormat;
import java.time.Year;
import java.util.Random;
import java.util.Scanner;

public class Ex01IfElse {
	public static void main(String[] args) {
		//Random 1 so nguyen ngau nhien tu [5,20)
		Random rd = new Random();
		int n = rd.nextInt(5, 20);
		System.out.println("n --> " + n);
		
		//kiem tra so nguyen do co phai la so chan ko
		// neu no la so chan thi in ra nam hien tai + 	so chan do
		// neu ko phai --> ko in ra
	int currentYear = Year.now().getValue();
	boolean isEven = (n % 2 == 0);
	//if (isEven) {
	if(n % 2 == 0) {
		System.out.println("number la so chan(+2023) --> " + (currentYear + n));
	}
	System.out.println("ket thuc chuong trinh ...");
	
	//nhap vao mat khau, kiem tra do dai cua mat khau co hop le ko
	// neu do dai cua mat khau >=8 --> in ra mk hop le
	// nguoc lai --> in ramk ko hop le, vui long nhap lai
	
	Scanner ip = new Scanner(System.in);
	/*
	System.out.println("Nhap mat khau: ");
	String passsword = ip.nextLine();

	int length = passsword.length();
	if(length >= 8) {
		System.out.println("Mat khau hop le");
		
	} else {
		System.out.println("mat khau ko hop le");
	}
	*/
	
	// nhap vao diem trung binh cua hoc sinh [0,10]
	// KQ: SO ko biet dc so thap phan bao nhieu, lam tron lay 1 chu so thap phan
	// neu diem ma 
	// + [0,5) : yeu
	// + [5, 6.5): Trung binh
	// + [6.5, 8): Kha
	// + [8, 10] : Gioi
	
	float point = rd.nextFloat(0, 11); // [0.0, 11) --> 0.0 --> 10.99
	if (point > 10f) {
		point = 10f;
	}
	//#,###.#
	//point = 7.864224f; // 7.9
	// point = 7.002f; // 7
	
	// #,###.0 --> luon luon toi thieu va toi da 1 chu so thap phan
	// point = 7.8528434f;// 7.9
	// point = 7.002f; // 7.0
	//point = 7f;
	
	// pattern - cong thuc; cu phap
	DecimalFormat df = new DecimalFormat("#,,###.#");
	String formattedPoint = df.format(point);// dinh dang 1 gia tri kdl ? sang string de in ra
	point = Float.parseFloat(formattedPoint);
	
	System.out.println("DTB:" + point);
	
	if (point < 5) {
			System.out.println("Hoc luc -> Yeu");
	} else if (point < 6.5f) {
		System.out.println("hoc luc -> Trung Binh");
	} else if (point < 8.0f) {
		System.out.println("hoc luc -> kha");
	} else {
		System.out.println("hoc luc - gioi");
	}
	System.out.println("DTB:" + formattedPoint);
	System.out.println("DIem trung binh: " + point);
	
	System.out.println("Ket thuc chuong trinh ...");
	ip.close(); //dong ket noi 
	}
	
}

