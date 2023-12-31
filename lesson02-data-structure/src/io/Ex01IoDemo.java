package io;

import java.util.Scanner;

public class Ex01IoDemo {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		/*
		 + String: nextLine
		 --> khi gặp dòng ip.nextLine
		 --> dừng màn hình output
		 --> nhấn enter --> kết thúc việc nhập --> lưu giá trị rỗng vào biến string hiện tại
		 
		 + !String: !nextLine	
		 --> khi gặp dòng ip.nextLine
		 --> dừng màn hình output
		 --> nhấn enter --> ko kết thúc việc nhập, yêu cầu phải nhập giá trị bất kỳ vào
		 --> lưu giá trị đó vào biến !string hiện tại
		 */
		
		System.out.print("Nhập SBD: ");
		String id = ip.nextLine();
		
		System.out.print("Nhập họ tên: ");
		String fullname = ip.nextLine();
		
		System.out.print("Nhập địa chỉ: ");
		String address = ip.nextLine();
		
		System.out.print("Nhập năm sinh:");
		int yearOfBirth = ip.nextInt();
		
		System.out.println("Sinh viên " + fullname + " có SBD " +id + ", địa chỉ " + address + ", năm sinh " + yearOfBirth);
		
		System.out.println("id --> |||" + id + "|||");
	}

}
