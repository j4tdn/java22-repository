package homework;

import java.util.Scanner;

public class bt8 {

	public static void main(String[] args) {
		int N=0;
		int time = 0;
		boolean a = false;
		do {
			Scanner ip = new Scanner(System.in);
			System.out.println(" Nhập N = ");
			String Nstr = ip.nextLine();
			
			if(isNumber(Nstr)) {
				N = Integer.parseInt(Nstr);
				if ( isPrime(N)) {
					System.out.println(" -> true");
					a = true;
				}else
					System.out.println(" -> false");
			}else
				System.out.print(" -> báo lỗi, yêu cầu nhập lại");
			time++;
			
		} while (time <5 && a == false);

	}
	private static boolean isNumber(String numStr) {
		for (int i = 0; i < numStr.length(); i++) {
		    if (numStr.charAt(i)<48 || numStr.charAt(i)>57) {
		    	return false;
		    }
		}
		return true;
	}
	
	private static boolean isPrime(int N) {
		
		for (int i = 2; i < N; i++) {
		    if(N%i == 0) return false;
		}
		return true;
	}
	
}
