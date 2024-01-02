package homework;

import java.util.ArrayList; 
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
public class homework {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int c;
		do {
			System.out.println("=======================");
			System.out.println("1. Kiểm tra số nguyên N có phải là bội của 2 hay không");
			System.out.println("2. Kiểm tra số nguyên N có phải là lũy thừa của 2 hay không");
			System.out.println("3. Tìm giai thừa của một số nguyên dương N");
			System.out.println("4. Tính tổng giải thừa");
			System.out.println("5. Kiểm tra N có phải là số đối xứng");
			System.out.println("6. Tìm số nguyên lớn, nhỏ nhất trong 3 chữ số");
			System.out.println("7. Chuyển cơ số nhị phân");
			System.out.println("8. Kiểm tra số nguyên tố");
			System.out.println("9. Tìm số nguyên tố thứ 200");
			System.out.println("10. In ra 5 số nguyên ngẫu nhiên từ 20 đến 30");
			System.out.println("11. Kết thúc chương trình");
			System.out.println("=======================");
			c = sc.nextInt();
			switch (c) {
			case 1:

				ex1();
				break;
			case 2:
				ex2();
				break;
			case 3:
				ex3();
				break;
			case 4:
				ex4();
				break;
			case 5:
				ex5();
				break;
			case 6:
				ex6();
				break;
			case 7:
				ex7();
				break;
			case 8:
				ex8();
				break;
			case 9:
				ex9();
				break;
			case 10:
				break;
			case 11: 
				System.out.println("JAVA BKIT 22");
				break;
			default:
				System.out.println("Khong ho tro");
				break;
			}
		} while (c!=11);
	}





	public static void ex1() {
		System.out.println("=======================");
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
	
	public static void ex2() {
		System.out.println("=======================");
		int x;
		int count = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap so nguyen N");
		do {
			try {
				String a = sc.nextLine();
				x = Integer.parseInt(a);
				if ((x!=0)&&((x&((x-1))))==0) {
					System.out.println("So nguyen " + x + "la luy thua cua 2");
				} 
				else {					
					count=count +1;
					if (count <= 5) {
						System.out.println("So nguyen " + x + " khong phai la luy thua cua 2");
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
	
	public static void ex3() {
		System.out.println("=======================");
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
	
	public static void ex4() {
		System.out.println("=======================");
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
	
	public static void ex5() {
		System.out.println("=======================");
		Scanner sc = new Scanner(System.in);
		boolean isInt;
		do {
			try {  
				System.out.println("Nhap N");
				String x = sc.nextLine();
				int a = Integer.parseInt(x);
				int temp = a;
				int sum = 0;
				if (a<10) {
					System.out.println("N phai co it nhat 2 chu so");
					isInt=false;
				}
				else {
					while(temp!=0) {
						sum = sum*10+temp%10;
						temp = temp/10;
					}
					if(sum==a) {
						System.out.println("Day la so doi xung");
					} else {
						System.out.println("Day khong phai la so doi xung");
					}
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("Sai dinh dang");
				isInt = false;
			}
		} while (isInt = true);
	}
	
	public static void ex6() {
		System.out.println("=======================");
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
	
	public static void ex7() {
		System.out.println("=======================");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so can kiem tra");
		int n = sc.nextInt();
		String binary = "";
		while (n>0) {
			binary = n%2+binary;
			n = n/2;
		}
		System.out.println("He nhi phan cua " + n + " la" + binary);
	}
	
	public static void ex8() {
		System.out.println("=======================");
		Scanner sc = new Scanner(System.in);
		boolean isInt;
		do {
			try {  
				System.out.println("Nhap N");
				String x = sc.nextLine();
				int a = Integer.parseInt(x);
				int count = 0;
				if(a==0&&a==1) {
					System.out.println(a + " khong phai la so nguyen to");
				}
				
				for (int i = 1; i<=a; i++) {
					if(a%i==0) {
						count = count+1;
					}
				}
				if (count==2) {
					System.out.println(a + " la so nguyen to");
					break;
				} else {
					System.out.println(a + " khong phai la so nguyen to");
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("Sai dinh dang");
				isInt = false;
			}
		} while (isInt = true);

	}
	
	public static void ex9() {
		System.out.println("=======================");
		long count = 0;
		long n = 1;
		while (count < n) {
			
		}
	}
}
