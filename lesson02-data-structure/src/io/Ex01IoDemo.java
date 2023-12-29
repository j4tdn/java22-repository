package io;

import java.util.Scanner;

public class Ex01IoDemo {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.print("nhap sbd: ");
		String id = ip.nextLine();
		
		System.out.print("nhap ho ten: ");
		String fullname = ip.nextLine();
		
		System.out.print("nhap dia chi: ");
		String address = ip.nextLine();
		
		System.out.println("nhap nawm sinh: ");
		int yearOfBirth = ip.nextInt();
		
		System.out.println("sv " + fullname + " co sbd " + id + ", dia chi " + address + ", nam sinh " + yearOfBirth);
		
	}
}
