package homework;

import java.util.Scanner;

public class Ex2 {
   public static void main(String[] args) {
	   System.out.println("2. Kiểm tra số nguyên N có phải là lũy thừa của 2 hay không");
	   int x;
		int count = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap so nguyen N");
		do {
			try {
				String a = sc.nextLine();
				x = Integer.parseInt(a);
				if ((x!=0)&&((x&((x-1))))==0) {
					System.out.println("So nguyen " + x + " la luy thua cua 2");
				} 
				else {					
					count=count +1;
					if (count <= 5) {
						System.out.println("So nguyen " + x + " khong phai la luy thua cua 2");
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
}
