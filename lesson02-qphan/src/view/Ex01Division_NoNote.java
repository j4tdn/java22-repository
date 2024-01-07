package view;

import java.util.Scanner;

import utils.IoUtils;

public class Ex01Division_NoNote {
	
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = IoUtils.inputNumber();
		
		System.out.println("Nhập N thành công N = " + n);
		
		System.out.println("=================");
		
		System.out.println(isMultipleOf2(n));
		
		ip.close();
	}
	
	private static String isMultipleOf2(int n) {
		if (n % 2 == 0) {
			return "--> " + n + " là bội số của 2";
		}
		return "--> " + n + " không phải là bội số của 2";
	}
}
