package io;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class Ex01ToDemo {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Nhập SBD: ");
		String id = ip.nextLine();
		
		System.out.println("Nhập họ tên: ");
		String fullname = ip.nextLine();
		
		System.out.println("Nhập năm sinh: ");
		//int yearOfBirth = ip.nextInt();
		//ip.nextLine();
		int yearOfBirth = Integer.parseInt(ip.nextLine());
		
		System.out.println("Nhập địa chỉ: ");
		String address = ip.nextLine();
		
		
		/* Nhập vào từ bàn phím:
		 + String: nextLine
		 --->khi gặp dòng ip.nextLine
		 --->dừng màn hình output
		 --->nhấn enter --> kết thúc nhập --> lưu giá trị rỗng vào biến String hiện tại
		 ---> xóa luôn kí tự enter nhập từ bàn phím
		 
		 + !String: !nextLine
		 --->khi gặp dòng ip.nextLine
		 --->dừng màn hình output
		 --->nhấn enter --> ko kết thúc nhập, yêu cầu phải nhập giá trị mới dừng
		 ---> lưu giá trị vào biến !String hiện tại
		 ---> ko xóa kí tự enter nhập từ bàn phím
		 
		 -TH Trôi lệnh: nhập 1 hàm khác String trước lệnh String --> thêm 1 dòng lệnh ip.nextLine;
		                                                         --> dùng lệnh parse..(ip.nextLine())
		
		 */
		
		System.out.println("Sinh viên " + fullname + " có SBD " + 
		                    id + ", địa chỉ " + address 
		                    + ", năm sinh " + yearOfBirth);
	}

}
