package baitap1;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        int a, b, c;

	        
	        System.out.print("Nhap a : ");
	        while (!scanner.hasNextInt()) {
	            System.out.println("Nhap lai");
	            scanner.next(); 
	        }
	        a = scanner.nextInt();
	        if (a < 0 || a >= 20) {
	            System.out.println("Nhap lai");
	            return;
	        }

	        
	        System.out.print("Nhap b: ");
	        while (!scanner.hasNextInt()) {
	            System.out.println("Nhap lai");
	            scanner.next(); 
	        }
	        b = scanner.nextInt();
	        if (b < 0 || b >= 20) {
	            System.out.println("Nhap lai");
	            return;
	        }

	        
	        System.out.print("nhap c ");
	        while (!scanner.hasNextInt()) {
	            System.out.println("Nhap lai");
	            scanner.next(); 
	        }
	        c = scanner.nextInt();
	        if (c < 0 || c >= 20) {
	            System.out.println("Nhap lai");
	            return;
	        };

       
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        int min = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);

       
        System.out.println("max" + max);
        System.out.println("min" + min);

        scanner.close();
    }

    
   
    

}
