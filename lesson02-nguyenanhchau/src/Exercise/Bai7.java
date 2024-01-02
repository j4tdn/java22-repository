package Exercise;

import java.util.Scanner;

public class Bai7 {

	public static void main(String[] args) {
		    Scanner ip = new Scanner(System.in);
			System.out.print("Nhap so nguyen thap phan = ");
			if (ip.hasNextInt()) {
				int a = ip.nextInt();
				System.out.println("So nhi phan = " + thapphanSangnhiphan(a));
			} else {
				System.out.println("Loi, nhap vao so nguyen.");
				ip.next();
			}
	}

	private static String thapphanSangnhiphan(int n) {
		String ketqua = "";
		do {
           int sodu = n % 2;
           ketqua += Integer.toString(sodu);
           n = n / 2;
			
		}while(n > 0);
		
	    return daonguocString(ketqua)	;
	}
	private static String daonguocString(String input) {
	    StringBuilder b = new StringBuilder(input);
	    return b.reverse().toString();
	}
	
}
