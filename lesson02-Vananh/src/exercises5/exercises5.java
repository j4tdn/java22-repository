package exercises5;

import java.util.Scanner;

public class exercises5 {
    public static boolean checkSoDoiXung(int n) {
        String s = (n+"");
    	int left = 0;
    	int right = s.length()-1;
    	while(left < right) {
    		if(s.charAt(left) != s.charAt(right)) {
    			return false;
    		}
    		left++;
    		right--;
    	}
    	return true;
    }
    
   
    
    static int  getValidNumber(String prompt) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		int counter = 0;
		
		while(counter < 5) {
			System.out.println(prompt);
			String input = sc.next();
			
			try {
				number = Integer.parseInt(input);
				if((number+"").length() >= 2) {
					
					break;
				}
				System.err.println("Khong du 2 ki tu");
				counter++;
			}catch(NumberFormatException e) {
				System.err.println("Khong dung dinh dang so");
				counter++;
				continue;
				
			}
		}
		return number;
	}
	public static void main(String[] args) {
		
		int n = getValidNumber("Nhap N = ");
		
        if(checkSoDoiXung(n)) {
        	System.out.println("so doi xung");
        }else {
        	System.out.println("ko so doi xung");
        }
       
	}
}
