package lesson05;

import java.util.Scanner;

public class bai1 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int k = 0;
	        
	        do {
	            System.out.print("Nhap so thuc: ");
	            String input = scanner.nextLine();
	            
	            if (isDouble(input) && Double.parseDouble(input) % 1 != 0) {
	                System.out.println("So thuc vua nhap: " + input);
	                Double x = Double.parseDouble(input);
	                long[] a = getMinFract(x);
	                
	                System.out.println("Phân số tối giản của số thực là: " + a[0] + "/" + a[1]);
	                break;
	            } else {
	                System.out.println("Nhap sai");
	                k++;
	            }
	        }while (k < 3);
	    }

	    public static boolean isDouble(String input) {
	        try {
	            Double.parseDouble(input);
	            return true;
	        } catch (NumberFormatException e) {
	            return false;
	        }
	    
	    }
	    
	    public static long[] getMinFract(double number) {
	        long phannguyen = (long) number;
	        double phanthuc = number - phannguyen;
	        long gcd = gcd(Math.abs(phannguyen), Math.round(phanthuc * 1000000));

	        long numerator = Math.abs(phannguyen) * 1000000 + Math.round(phanthuc * 1000000);
	        long denominator = 1000000;
	        numerator /= gcd;
	        denominator /= gcd;
	        
	        if (phannguyen < 0 || number < 0) {
	            numerator *= -1;
	        }

	        return new long[]{numerator, denominator};
	    }
	    
	    public static long gcd(long a, long b) {
	        if (b == 0) {
	            return a;
	        }
	        return gcd(b, a % b);
	    }
}