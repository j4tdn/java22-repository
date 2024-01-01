package io;

import java.util.Scanner;

public class Ex01IoDemo {

	public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	
	System.out.print("Nhap SBD : ");
	String id = ip.nextLine();
	
	System.out.print("Nhap ho ten : ");
	String fullname = ip.nextLine();
	
	System.out.print("Nhap dia chi : ");
	String address = ip.nextLine();
	
	System.out.print("Nhap nam sinh: ");
	int yearOfBirth = ip.nextInt();
	
	System.out.println("Sinh Vien " + fullname
			+ "co SBD " + id
			+ ", dia chi " + address
			+", nam sinh" + yearOfBirth);
	}

}