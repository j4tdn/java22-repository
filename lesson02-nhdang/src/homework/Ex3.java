package homework;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		System.out.println("3. Tìm giai thừa của một số nguyên dương N");
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap so nguyen N");
		long sum = 1;
		try {
			String a = sc.nextLine();
			long x = Long.parseLong(a);
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
}
