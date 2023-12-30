package io;

import java.util.Scanner;

public class Ex01IoDemo {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Nhap SBD: ");
		String id = ip.nextLine();
		
		System.out.println("Nhập họ tên: ");
		String fullname = ip.nextLine();
		
		System.out.println("Nhập năm sinh: ");
		int yearOfBirth = Integer.parseInt(ip.nextLine());
		
		System.out.println("Nhập ĐTB: ");
		float score = Float.parseFloat(ip.nextLine());
		
		System.out.println("Nhập địa chỉ: ");
		String address = ip.nextLine();
		
	
		System.out.println("==========================");
		
		System.out.println("Sinh viên " + fullname  
				+ " có SBD " + id 
				+ ", địa chỉ " + address
				+ ", năm sinh " + yearOfBirth
				+ ", điểm trung bình " + score);
		
		System.out.println("id --> |||" + id + "|||");
	}
}
