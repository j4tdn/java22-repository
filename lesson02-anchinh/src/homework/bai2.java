package homework;

import java.util.Scanner;

public class bai2 {
/*
Viết chương trình(hàm) kiểm tra số nguyên N có phải là lũy thừa của 2 hay không
Biết rằng N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ
(tối đa 5 lần) hoặc khai báo biến có sẵn giá trị hợp lệ
 */
	public static void main(String[] args) {
		int n=0;
	    int count = 0;
	    Scanner scanner = new Scanner(System.in);
	
	    while (count < 5) {
	        System.out.print("Nhập số nguyên N: ");
	        if (scanner.hasNextInt()) {
	            n = scanner.nextInt();
	            if (n > 0) {
	                break; 
	            } else {
	                count++;
	                System.out.println("N không phải là số nguyên dương");
	            }
	        } else {
	            count++;
	            System.out.println("N không hợp lệ");
	            scanner.next(); 
	        }
	    }
	    scanner.close();
	
	    boolean isPower = checkN(n);
	
	    if (isPower) {
	        System.out.println(n + "-> true");
	    } else {
	        System.out.println(n + "-> false");
	    }
}

	public static boolean checkN(int N) {
	    if (N == 0) {
	        return false; 
	    }
	
	    while (N != 1) {
	        if (N % 2 != 0) {
	            return false; 
	        }
	        N = N / 2;
	    }
	    return true; 
		}
}
