package ex02;

import java.util.Scanner;

public class SpecialNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so: ");
		
		int s = sc.nextInt();
		
		if(isSpecialNumber(s)) {
			System.out.println("s la specialnumber ");
		} else {
			System.out.println("s ko phai la specialnumber ");
		}
		sc.close();
				
	}
	static int sum = 0;
	public static boolean isSpecialNumber(int s) {
		if(sum == s) {
			int sum = 0;
			for (int i = 1; sum < s; i++) {
	            sum += i;
	            if (sum == s)
	                return true;
	        }
		}
		return false;
	}
}
	
		
	// Function to find no. of elements
    // to be added from 1 to get sum = s
	
	
   
	
	/*static int findS(int s)
    {
        int sum = 0;
 
        // Start adding numbers from 1
        for (int i = 1; sum < s; i++) {
            sum += i;
 
            // If sum becomes equal to s
            // return i
            if (sum == s)
                return i;
        }
 
        return -1;
    }
 
    // Drivers code
    public static void main(String[] args)
    {
 
        int s = 10;
        System.out.println(findS(s));
    }

*/

		
