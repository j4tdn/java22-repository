package Ex01;

import java.util.Scanner;

public class ex01 {
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		int count = 0;
		String numStr;
		do {
			if(count==3) break;
			else count ++;
			System.out.println("Nhập 1 số thực có phần thập phân khác 0:"); 
			numStr = ip.nextLine();
			if (isDouble(numStr)) {
				double num = Double.parseDouble(numStr);
				decimalToFraction(num);
				break;
			}
			
		}while(true);
		
		System.out.println("kết thúc"); 
	}
	
    public static int findGCD(int a, int b) {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }

    public static void decimalToFraction(double num) {
        int pNguyen = (int) num;
        int pThapPhan = (int)((num - pNguyen)*10000000);
        
        int tu = pThapPhan;
        int mau = 10000000;
        
      
        int gcd = findGCD(tu, mau);
        tu /= gcd;
        mau /= gcd;
        if (pNguyen == 0)
        	System.out.println("-> "+tu + "/" + mau); 
        else
        	
        	System.out.println("-> "+pNguyen + " " + tu + "/" + mau); 
    }
	
	 private static boolean isDouble(String text) {
	        try {
	            double num = Double.parseDouble(text);
	            if (num%1>0)
	            return true;
	            else return false;
	        } catch (NumberFormatException e) {
	            return false;
	        }
	    }
}

