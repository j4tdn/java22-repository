package io;

import java.util.Scanner;

public class Ex01IoDemo {
	public static void main(String[] args) {
		/*
		 Nhập xuất từ bp
		+String: nextLine
		-->khi gặp dòng ip.nextLine
		-->dừng màn hình output
		-->nhấn Enter-->kết thúc nhập-->lưu giá trị rỗng vào biến string hiện tại
		
		+String: !nextLine
		-->khi gặp dòng ip.nextLine
		-->dừng màn hình output
		--> nhấn Enter--> ko kết thúc việc nhập, yêu cầu nhập giá trị bất kì vào
		--> lưu giá trị đó vào !string
		 */
		Scanner ip=new Scanner(System.in);
		
		System.out.println("Nhập SBD: ");
		String id=ip.nextLine();
		
		System.out.println("Nhập họ tên: ");
		String fullname=ip.nextLine();
		
		System.out.println("Nhập năm sinh: ");		
//		int yearOfBirth=ip.nextInt();
		int yearOfBirth=Integer.parseInt(ip.nextLine());
		
		System.out.println("Nhập điểm trung bình: ");		
		float score=Float.parseFloat(ip.nextLine());
		
		System.out.println("Nhập địa chỉ: ");		
		String address=ip.nextLine();
		
		
		System.out.println("Sinh viên "+ fullname
				+ " có SBD "+id + ",địa chỉ "+ address
				+",năm sinh " + yearOfBirth
				+",điểm trung bình " + score);
//		System.out.println("id-->||"+id);
		
	}

}
