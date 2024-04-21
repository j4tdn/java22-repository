package ex02;

public class Main {
	/*
	 :Cho n xâu chuỗi, mỗi chuỗi bao gồm các ký tự la tinh thường và chữ số. 
	 Đoạn các ký tự số liên tục tạo thành một số nguyên.
	 Ở mỗi xâu chuỗi trích ra các số nguyên và tìm số lớn nhất, sắp xếp các số lớn nhất
	  nhận được từ các xâu đã cho và in ra theo thứ tự không giảm, mỗi số
	được đưa ra dưới dạng không có các số 0 không có nghĩa (024)
	
	Nếu chuỗi rỗng hoặc chuỗi chỉ chứa các ký tự latinh thì số lớn nhất của chuỗi đó là 0
	
	Ví dụ: với n = 1 : xâu 01a2b3456cde478 : Kết quả: 3456
	với n = 2 : xâu aa6b546c6e22h, aa6b326c6e22h: Kết quả: 326, 546
	Method signature: getLargestNumbers(String ...ss) >> String[]
	 */
	public static void main(String[] args) {
		String[] nStr = {"aa6b546c6e22h", "aa6b326c6e22h"};
		
		String[] largestNumbers = getLargestNumbers(nStr);
		
//		sort(largestNumbers);
		
		for (int i=0 ; i<largestNumbers.length ; i++ ) {
			if (i==largestNumbers.length-1) {
				System.out.print(largestNumbers[i]);
			}
			else System.out.print(largestNumbers[i] + ", " );
		}
		
		
	}
	private static String[] getLargestNumbers(String[] input) {
		
		String[] largestNumbers = new String[input.length];

 		for(int i=0; i<largestNumbers.length ; i++) {
 			int maxNum = 0;
 			String maxNumString = "";
 			String[] numsString  = input[i].replaceAll("[a-z]+", "-").split("-");
 			
 			for(String numString : numsString ) {
 				try {
 					
 					int num  = Integer.parseInt(numString);
 					if (num > maxNum ) {
 						maxNum = num;
 						maxNumString = numString;
 					}
 					
 				}catch (NumberFormatException e) {
 				}
 			}

 			
			largestNumbers[i] = maxNumString;
		}
		
		
		return largestNumbers;
	}
	private static void sort(int[] numbers) {
		int[] result = new int[numbers.length];
		for (int i=0 ; i<result.length ; i++ ) {
			int max = 0;
			for(int num : numbers ) {
				
				if (num > max ) {
					max = num; 
				}
				result[i] = max;
			}
		}
	
		for (int i=0 ; i<result.length ; i++ ) {
			if (i==result.length-1) {
				System.out.println(result[i]);
			}
			else System.out.println(result[i] + "," );
		}
	}
}
