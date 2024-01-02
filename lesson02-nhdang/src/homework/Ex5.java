package homework;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		System.out.println("5. Kiểm tra N có phải là số đối xứng");
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
}
