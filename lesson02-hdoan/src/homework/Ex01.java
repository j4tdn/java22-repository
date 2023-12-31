package homework;

import java.util.Scanner;

/*
 	Bài 1: Viết chương trình(hàm) kiểm tra số nguyên N có phải là bội của 2 hay không
	Yêu cầu: N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ (tối
	đa 5 lần)
	VD: Nhập N = abc → báo lỗi, yêu cầu nhập lại
	
	= 4 → true
	= 6 → true
	= 7 → false
 */

public class Ex01 {

	  public static boolean isMultipleOf2(String n) {
	        if (!n.matches("\\d+")) {
	            return false;
	        }
	        return Integer.parseInt(n) % 2 == 0;
	    }

	    public static void main(String[] args) {
	    	Scanner ip = new Scanner(System.in);
	        int count = 0;
	        while (count < 5) {
	            System.out.print("Nhập số nguyên dương N: ");
	            String input = ip.nextLine();
	            if (isMultipleOf2(input)) {
	                System.out.println(input + " là bội của 2");
	                return;
	            } else if (!input.matches("\\d+")) { // matches() so sánh chuỗi "\d+" Bt chính quy \d khớp vs 1 chữ số, "+" 1 || nhiều 
	                System.out.println("không hợp lệ. Nhập lại: ");
	            } else {
	                System.out.println("không phải là bội của 2. Nhập lại: ");
	            }
	            count++;
	        }
	        System.out.println("Số lần nhập vượt quá giới hạn.");
	        ip.close();
	    }
}