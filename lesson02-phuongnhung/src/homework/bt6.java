package homework;

import java.util.Scanner;

public class bt6 {

	
	public static void main(String[] args) {
		int N=0;
		int num = 0;
		int[] ArrayN = new int[3];
		do {
			Scanner ip = new Scanner(System.in);
			if(num == 0) {
				System.out.print("Nhập a = ");
			} else if(num == 1) {
				System.out.print("Nhập b = ");
			}else System.out.print("Nhập c = ");
			String Nstr = ip.nextLine();
			
			if(isNumber(Nstr)) {
				N = Integer.parseInt(Nstr);
				if(N<20 && N>=0) {
					ArrayN[num] = N;
					num ++;
					
				}else
					System.out.println(" -> báo lỗi, yêu cầu nhập lại");
				
			}else
				System.out.println(" -> báo lỗi, yêu cầu nhập lại");
			
		} while (num < 3);
		
		//System.out.println(Arrays.toString(ArrayN));
		System.out.println("Số lớn nhất là " + Max(ArrayN));
		System.out.println("Số lớn nhỏ là " + Min(ArrayN));
		
	}
	
	private static int Max(int[] array) {
		int result = 0;
		for (int i = 0 ; i<array.length ; i++) {
			if(result < array[i]) result = array[i];
		}
		
		return result;
	}
	private static int Min(int[] array) {
		int result = 20;
		for (int i = 0 ; i<array.length ; i++) {
			if(result > array[i]) result = array[i];
		}
		
		return result;
	}
	
	private static boolean isNumber(String numStr) {
		for (int i = 0; i < numStr.length(); i++) {
		    if (numStr.charAt(i)<48 || numStr.charAt(i)>57) {
		    	return false;
		    }
		}
		return true;
	}
}
