package exercise3;

import java.util.Scanner;

public class exercise3 {
	static int  getValidNumber(String prompt) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		int counter = 0;
		
		while(counter < 5) {
			System.out.println(prompt);
			String input = sc.next();
			
			try {
				number = Integer.parseInt(input);
				if(number >= 0) {
					
					break;
				}
				System.err.println("Khong phai la so nguyen duong");
				counter++;
			}catch(NumberFormatException e) {
				System.err.println("Khong dung dinh dang so");
				counter++;
				continue;
				
			}
		}
		return number;
	}
	
	static long getGiaiThua(int n) {
		long result = 1;
	    while(n>=1) {
	    	result *= n;
	    	n--;
	    }
		return result;
	}
   public static void main(String[] args) {
	   int number = getValidNumber("Nhap N:");
		
//	   System.out.print(""+number +"!=" );
//	   for(int i = number;i>=1;i--) {
//		   if(i==1) {
//			   System.out.print(i);
//		   }else {
//			   System.out.print(i+".");
//		   }
//		  
//	   }
	   System.out.print("= " + getGiaiThua(number));
	   
}
}
