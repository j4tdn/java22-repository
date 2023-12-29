package io;

import java.util.Scanner;

public class Ex01IoDemo {
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhập sbd: ");
	int id = Integer.parseInt(sc.nextLine());
	System.out.println("Nhập họ tên: ");
	String fullName = sc.nextLine();
	System.out.println("Nhập năm sinh: ");
	int year = Integer.parseInt(sc.nextLine());
	System.out.println("Nhập địa chỉ: ");
	String address = sc.nextLine();
	System.out.println("Sinh viên " + fullName + " có thông tin cơ bản: " + id + ", " + " địa chỉ " + address + ", "+" năm sinh " + year);
}
}
