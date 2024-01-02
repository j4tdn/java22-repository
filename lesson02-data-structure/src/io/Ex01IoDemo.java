package io;

import java.util.Scanner;

public class Ex01IoDemo {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		/*
		 * nhap xuat tu ban phim
		 * + String: nextline
		 * -->khi gap dong ip.nextLine
		 * --> dung man hinh output 
		 * --> nhan enter --> ket thuc nhap --> luu gia tri rong vao bien String hien tai
		 * --> Xoa luon ki tu enter nhap tu ban phim 
		 * 
		 * +!String: !nextline
		 * ->khi gap dong !ip.nextLine
		 * --> dung man hinh output 
		 * --> nhan enter -->ko ket thuc viec nhap, yeu cau phai nhap gia tri bat ky vao
		 * --> luu gia tri do vao bien !String hien tai
		 * --> ko xoa ki tu enter nhap tu ban phim 
		 * 
		 */
		
		System.out.print("Nhap SBD: ");
		String id = ip.nextLine();
		
		System.out.print("Nhap ho ten: ");
		String fullname = ip.nextLine();
		
		System.out.print("Nhap dia chi: ");
		String address = ip.nextLine();
		
		System.out.print("Nhap nam sinh: ");
		int yearOfBirth = ip.nextInt();
		// ip.nextline()
		// int yearOfBirth = Integer.parseInt(ip.nextLine());
		
		System.out.println("Sinh vien " + fullname +
				" co SBD " + id + ", dia chi " + address + ", nam sinh " + "yearOfBirth");
	}

}
