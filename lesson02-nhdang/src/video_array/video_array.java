package video_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
public class video_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int c;
		do {
			System.out.println("Chọn chức năng");
			System.out.println("1. Case 1");
			System.out.println("2. Case 2");
			System.out.println("3. Case 3");
			System.out.println("4. Case 4");
			System.out.println("5. Case 5");
			System.out.println("6. Case 6");
			System.out.println("7. Case 7");
			System.out.println("8. Case 8");
			System.out.println("9. Case 9");
			System.out.println("10. Case 10");
			c = sc.nextInt();
			switch (c) {
			case 1:
				case1();
				break;
			case 2:
				case2();
				break;
			case 3:
				case3();
				break;
			case 4:
				case4();
				break;
			case 5:
				break;
			case 6:
				case6();
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			case 10:
				break;
			case 11: 
				System.out.println("Ket thuc");
				break;
			default:
				System.out.println("Khong ho tro");
				break;
			}
		} while (c!=11);
	}


	public static void case1() {
		int x;
		int count = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap so nguyen N");
		do {
			try {
				String a = sc.nextLine();
				x = Integer.parseInt(a);
				if (x%2==0 && x>0) {
					System.out.println(x + "->True");
				}
				else {					
					count=count +1;
					if (count <= 5) {
						System.out.println(x+ "->False");
					}
				}
			} catch (NumberFormatException e) {
				count = count + 1;
				if(count<5) {
					System.out.println("Sai dinh dang");
				}
			}
		} while (count<5);

		if (count==5) {
			System.out.println("Qua so lan thu");
		}
	}
	public static void case2() {
		int x;
		int count = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap so nguyen N");
		do {
			try {
				String a = sc.nextLine();
				x = Integer.parseInt(a);
				if ((x!=0)&&((x&((x-1))))==0) {
					System.out.println("->True");
				} 
				else {					
					count=count +1;
					if (count <= 5) {
						System.out.println(x+ "->False");
					}
				}
			} catch (NumberFormatException e) {
				count = count + 1;
				if(count<=5) {
					System.out.println("Sai dinh dang");
				}
			}
		} while (count<5);

		if (count==5) {
			System.out.println("Qua so lan thu");
		}
	}
	public static void case3() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap so nguyen N");
		int sum = 1;


		try {
			String a = sc.nextLine();
			int x = Integer.parseInt(a);
			if(x==0) {
				System.out.println("Gia thua cua 1 la: 1");
			}
			else {
				for (int i=1;i<=x;i++) {
					sum*=i;
				}
				System.out.println("Giai thua cua "+ x + " la: "+sum);
			}
		} catch (NumberFormatException e) {
			System.out.println("Sai dinh dang");
		}
	}
	public static void case4() {
		Random rd = new Random();
		long sum1 = 1;
		long sum2 = 2;
		long sum3 = 3;
		long sum4 = 4;
		long sum;
		long i, j, k , l;
		int d[] = new int[] {10,11,12,13,14,15,16,17,18,19,20};
		long a = d[rd.nextInt(d.length)];
		for (i=1; i<=a; i++) {
			sum1*=i;
		}
		long b = d[rd.nextInt(d.length)];
		for (j=1; j<=b; j++) {
			sum2*=j;
		}
		long c = d[rd.nextInt(d.length)];
		for (k=1;k<=c;k++) {
			sum3*=k;
		}
		long f = d[rd.nextInt(d.length)];
		for (l=1;l<=f;l++) {
			sum4*=l;
		}
		sum = sum1+sum2+sum3+sum4;
		System.out.println("So random thu nhat: "+a);
		System.out.println("So random thu hai: "+b);
		System.out.println("So random thu ba: "+c);
		System.out.println("So random thu tu: "+f);

		System.out.println("Tong giai thua cua 4 so random trong mang [10, 20]: " + sum);
	}
	public static void case5() {

	}
	public static void case6() {
		Scanner sc = new Scanner(System.in);
		int a=0;
		int b=0;
		int c=0;
		int Max;
		boolean isInt;
		do {
			try {  System.out.println("Nhap a");
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
			try {  System.out.println("Nhap b");
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
			try {  System.out.println("Nhap c");
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
		if (b>Max) {
			Max = b;
		}
		if (c>Max) {
			Max = c;
		}
		System.out.println("Max la: " + Max);
	}
}
