package io;

import java.util.Scanner;

public class Ex01ToDemo {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		/*
		 
		  */
		
		System.out.println("Nhập SBD: ");
		String id = ip.nextLine();
		
		System.out.println("Nhập Họ Tên: ");
		String fullname = ip.nextLine();
		
		System.out.println("Nhập năm sinh: ");
//		int yearOfBirth = ip.nextInt();
//		ip.nextLine();
		int yearOfBirth = Integer.parseInt(ip.nextLine());
		
		System.out.println("Nhập địa chỉ: ");
		String address = ip.nextLine();
		
		
		System.out.println("Sinh viên:"+ fullname +", có SBD: " + id + ", địa chỉ: "+address+ ", Năm Sinh:"+yearOfBirth);

	}
}
