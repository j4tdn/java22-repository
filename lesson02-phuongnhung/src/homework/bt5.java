package homework;

import java.util.Scanner;

public class bt5 {

	public static void main(String[] args) {
		int N=0;
		boolean a = false;
		do {
			Scanner ip = new Scanner(System.in);
			System.out.println(" Nhập N = ");
			String Nstr = ip.nextLine();
			
			if(isNumber(Nstr)) {
				N = Integer.parseInt(Nstr);
				if (N<10) System.out.print(" -> báo lỗi, yêu cầu nhập lại");
				else if (N > 10 && isSymmetrical(Nstr)) {
					System.out.print(" -> true");
					a = true;
				}else
					System.out.print(" -> false");
			}else
				System.out.print(" -> báo lỗi, yêu cầu nhập lại");
			
		} while (a == false);

	}
	private static boolean isNumber(String numStr) {
		for (int i = 0; i < numStr.length(); i++) {
		    if (numStr.charAt(i)<48 || numStr.charAt(i)>57) {
		    	return false;
		    }
		}
		return true;
	}
	
	private static boolean isSymmetrical(String N) {
		int Length = N.length();
		
		for (int i = 0; i <= Length/2; i++) {
		    if(N.charAt(i) != N.charAt(Length-1-i)) return false;
		}
		return true;
	}
}
