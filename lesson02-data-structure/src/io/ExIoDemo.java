package io;

import java.util.Scanner;

public class ExIoDemo {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	
	System.out.println("NHAP SBD:  ");
	String id = ip.nextLine();
	
	System.out.println("nhập họ tên :  ");
	String fullname = ip.nextLine();
	
	System.out.println("Nhập địa chỉ :  ");
	String address = ip.nextLine();
	
	System.out.println("Nhập năm sinh :  ");
	int yearOfBirth = ip.nextInt();
	
	System.out.println("Sinh viên " + fullname // ?? vd gadgY
	        + "có SBD " + id
	        + ", địa chỉ " + address
	        + ", năm sinh " +yearOfBirth);
	
	System.out.println("id --> ||| " + id + "|||");
}
}
