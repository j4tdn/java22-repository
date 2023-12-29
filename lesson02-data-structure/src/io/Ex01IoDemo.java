package io;

import java.util.Scanner;

public class Ex01IoDemo {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		/*
		 Nhập xuất từ bàn phím
		 + String: nextLine
		 --> khi gặp dòng ip.nextLine
		 --> dừng màn hình output
		 + !String : !nextLine
		 */
		
		System.out.print("Nhập SBD: ");
		String id = ip.nextLine();
		
		System.out.print("Nhập họ tên: ");
		String fullname = ip.nextLine();
		
		System.out.print("Nhập năm sinh: ");
		int yearOfBirth = Integer.parseInt(ip.nextLine());
	//c1//int yearOfBirth = ip.nextInt();
		//ip.nextLine();
		
		System.out.print("Nhập ĐTB: ");
		float score = Float.parseFloat(ip.nextLine());
		
		System.out.print("Nhập địa chỉ: ");
		String address = ip.nextLine();	
		
		System.out.println("Sinh viên " + fullname
				+ " có SBD " + id 
				+ ", địa chỉ " + address
				+ ", năm sinh " +yearOfBirth
				+ ", điểm trung bình " +yearOfBirth);
		
	}
	
}
