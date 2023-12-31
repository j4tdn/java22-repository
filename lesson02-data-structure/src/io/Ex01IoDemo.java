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
		 --> nhấn enter --> kết thúc nhập --> lưu giá trị rỗng vào biến string hiện tại
		 --> xóa luôn kí tự enter nhập từ bàn phím
		 
		 + !String: !nextLine
		 --> khi gặp dòng !ip.nextLine
		 --> dừng màn hình output
		 --> nhấn enter --> ko kết thúc việc nhập, yêu cầu phải nhập giá trị bất kỳ vào
		 --> lưu giá trị đó vào biến !string hiện tại
		 --> ko xóa kí tự enter nhập từ bàn phím
		 */
		
		System.out.print("Nhập SBD: ");
		String id = ip.nextLine();
		
		System.out.print("Nhập họ tên: ");
		String fullname = ip.nextLine();
		
		System.out.print("Nhập năm sinh: ");
		// int yearOfBirth = ip.nextInt();
		// ip.nextLine()
		int yearOfBirth = Integer.parseInt(ip.nextLine());
		
		System.out.print("Nhập ĐTB: ");
		// float score = ip.nextFloat();
		// ip.nextLine();
		float score = Float.parseFloat(ip.nextLine());
		
		System.out.print("Nhập địa chỉ: ");
		String address = ip.nextLine();
		
		System.out.println("=====================");
		
		System.out.println("Sinh viên " + fullname 
				+ " có SBD " + id
				+ ", địa chỉ " + address
				+ ", năm sinh " + yearOfBirth
				+ ", điểm trung bình " + score);
		
		System.out.println("id --> |||" + id + "|||");
	}
	
}