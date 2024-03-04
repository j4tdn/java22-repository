package homework;

import java.util.Scanner;

public class Ex6 {
public static void main(String[] args) {
	System.out.println("6. Tìm số nguyên lớn, nhỏ nhất trong 3 chữ số");
	Scanner sc = new Scanner(System.in);
	int a=0;
	int b=0;
	int c=0;
	int Max;
	int Min;
	boolean isInt;
	do {
		try {  
		System.out.println("Nhap a");
		String x = sc.nextLine();
		a = Integer.parseInt(x);
		if (a<0||a>20) {
			System.out.println("Gia tri nam trong khoang tu 0 den 20");
			isInt=false;
		}
		else {
			break;
		}
		} catch (NumberFormatException e) {
			System.out.println("Sai dinh dang");
			isInt = false;
		}
	} while (isInt = true);
	do {
		try {  
		System.out.println("Nhap b");
		String y = sc.nextLine();
		b = Integer.parseInt(y);
		if (b<0||b>20) {
			System.out.println("Gia tri nam trong khoang tu 0 den 20");
			isInt=false;
		}
		else {
			break;
		}
		} catch (NumberFormatException e) {
			System.out.println("Sai dinh dang");
			isInt = false;
		}
	} while (isInt = true);
	do {
		try {  
		System.out.println("Nhap c");
		String z = sc.nextLine();
		c = Integer.parseInt(z);
		if (c<0||c>20) {
			System.out.println("Gia tri nam trong khoang tu 0 den 20");
			isInt=false;
		}
		else {
			break;
		}
		} catch (NumberFormatException e) {
			System.out.println("Sai dinh dang");
			isInt = false;
		}
	} while (isInt = true);
	Max = a;
	Min = b;
	if (b>Max) {
		Max = b;
		Min = a;
	}
	if (c>Max) {
		Max = c;
	} else {
		if(c<Min) {
			Min=c;
		}
	}
	System.out.println("So lon nhat la: " + Max);
	System.out.println("So nho nhat la: " + Min);
}
}
