package homework;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		System.out.println("8. Kiểm tra số nguyên tố");
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
}
