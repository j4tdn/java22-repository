package exam;

import java.util.Scanner;

public class Ex02 {
	/*
	 2(20đ):Cho n xâu chuỗi, mỗi chuỗi bao gồm các ký tự la tinh thường và chữ số. Đoạn các
	ký tự số liên tục tạo thành một số nguyên. 
	Ở mỗi xâu chuỗi trích ra các số nguyên và tìm số lớn nhất, 
	sắp xếp các số lớn nhất nhận được từ các xâu đã cho và in ra theo thứ tự không giảm, mỗi số
	được đưa ra dưới dạng không có các số 0 không có nghĩa (024)
	Nếu chuỗi rỗng hoặc chuỗi chỉ chứa các ký tự latinh thì số lớn nhất của chuỗi đó là 0
	Ví dụ: với n = 1 : xâu 01a2b3456cde478 : Kết quả: 3456
	với n = 2 : xâu aa6b546c6e22h, aa6b326c6e22h: Kết quả: 326, 546
	Method signature: getLargestNumbers(String ...ss) >> String[]
	 */
	
	public static void main(String[] args) {
		String s1 = "01a2b3456cde478";
		
		String number = s1.replaceAll("[a-z]+","");
		int count = 0;
		for(int i = 0; i < number.length(); i++) {
			System.out.print(number.charAt(i));
			
		}
	}

//	private static String getLargestNumbers(String s) {
//		String[] elements = s.split("\s+");
//		
//	}
}
