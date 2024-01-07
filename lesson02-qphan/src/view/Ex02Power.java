package view;

import utils.IoUtils;

public class Ex02Power {

	public static void main(String[] args) {
		int n = IoUtils.inputNumber();
		
		System.out.println("================");
		
		boolean isPowerOf2 = isPowerOf2(n);
		
		System.out.println("N có phải là lũy thừa của 2 ? " + isPowerOf2);
	}
	
	// n là lũy thừa của 2 nếu 2^x = n(nguyên dương)
	// yêu cầu x là số nguyên
	
	// -> log(n)/log(2) = x
	
	// x là số nguyên --> n là lũy thừa của 2
	
	// n = 4  --> x = 2.0
	// n = 8  --> x = 3.0
	// n = 6  --> x = 2.584962500721156
	// n = 10 --> x = 3,3219280948873626
	
	// kiểm tra số thực có phải là số nguyên hay ko
	
	// làm tròn trên số đó = làm tròn dưới số đó
	
	// true --> là số nguyên
	// false --> ko phải là số nguyên
	
	private static boolean isPowerOf2(int n) {
		double x = Math.log(n)/Math.log(2);
		
		System.out.println("x = " + x);
		
		double ceil = Math.ceil(x);
		double floor = Math.floor(x);
		
		System.out.println("ceil --> " + ceil);
		System.out.println("floor --> " + floor);
		
		/*
		if (ceil == floor) {
			return true;
		} else {
			return false;
		}
		*/
		
		return ceil == floor;
	}
}
