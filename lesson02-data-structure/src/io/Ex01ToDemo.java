package io;

import java.util.Scanner;

public class Ex01ToDemo {
	public static void main (String[] args) {
		Scanner ip = new Scanner(System.in);
		
		/*
		 * Nhập xuất từ bàn phím 
		 *  +String: nextLine
		 *  -> khi gặp dòng ip.nextLine
		 *  ->dùng hàn hình output
		 *  ->nhấn enter--> kết thúc việc nhập -->lưu giá trị rỗng vòa biến string hiện tại
		 *  
		 *  +!String: !nextLine
		 *  dừng màn hình output
		 *  -> nhấn enter --> khi nào có giá trị mới dừng lại
		 */
		
		System.out.print("Nhập SBD: ");
		int id =Integer.parseInt(ip.nextLine());
		
		System.out.print("Nhập họ tên: ");
		String fullname = ip.nextLine();
		
		System.out.print("Nhập địa chỉ: ");
		String address = ip.nextLine();
		
		System.out.print("Nhập năm sinh: ");
		String yearOfBirth = ip.nextLine();
		
		System.out.println("Sinh Viên " + fullname + " có SBD " + id + ",Địa chỉ " + address +", năm sinh " +yearOfBirth);
	}
}
