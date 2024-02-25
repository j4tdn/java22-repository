package Ex02;

import java.util.Scanner;

public class ex02 {
	private static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
    	do {

			System.out.println("Nhập số nguyên: "); 
			String Nstr = ip.nextLine();
			if (isNumber(Nstr)) {
				isSpecialNumber(Integer.parseInt(Nstr));
				break;
			}
		}while(true);
    }
	public static void isSpecialNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            if (sum >= n) {
                break;
            }
        }
        if( sum == n) System.out.println("=> là số đặc biệt"); 
        else System.out.println("=> không phải là số đặc biệt "); 
        
    }

    private static boolean isNumber(String text) {
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}
}
