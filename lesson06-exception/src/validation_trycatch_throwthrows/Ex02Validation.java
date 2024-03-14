package validation_trycatch_throwthrows;

import java.time.Year;
import java.util.Scanner;

public class Ex02Validation {
	public static void main(String[] args) {
		
		//Nhập vào thông tin --> in ra thông tin tuổi 
				Scanner ip = new Scanner(System.in);
				
				//System.out.println(" Enter your year of birth : ");
				
				//để đảm bảo Integer.parseInt không bị exception
				//-> phải đảm bảo chuỗi nhập vào phải chính xác chỉ chứa kí tự số
				String text = null;
				
				do {
					System.out.println(" Enter your number : ");
					text = ip.nextLine();
					if (isNumber(text) && text.length() <= 4) {
						break;
					}	
					System.out.println("Please enter ad Valid number : ");
				}while(true); 
				
//				while(true){
//					if (isNumber(text)) {
//						break;
//					}	
//					System.out.println("Please enter ad Valid number : ");
//					text = ip.nextLine();
//				}
				
				int year = Integer.parseInt(text);
				
				System.out.println("\n ==> Your age = " + ((Year.now().getValue())-year));
				
				ip.close();
		
	}
	
	private static boolean isNumber(String text) {
		for(int i = 0; i< text.length();i++) {
			char letter = text.charAt(i);
			if(!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}
	
}
