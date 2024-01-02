package io;

import java.util.Scanner;

public class Ex01IoDemo {
   public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	System.out.print("nhap so bao danh: ");
	String id =ip.nextLine();
	System.out.print("nhap ho ten: ");
	String fullname =ip.nextLine();
	System.out.print("dia chi: ");
	String address =ip.nextLine();
	System.out.print("nam sinh: ");
	int yearOfBirth =ip.nextInt();
	
	System.out.println("Sinh viên "+fullname 
			+" SBD "+ id
			+" dia chi "+ address+
			" nam sinh "+ yearOfBirth);
}
}
