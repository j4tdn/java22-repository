package homework;

import java.util.Scanner;

/*
 * 8: Viết chương trình(hàm) kiểm tra số nguyên N có phải là số nguyên tố hay không
Biết rằng N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ
(tối đa 5 lần) hoặc khai báo biến có sẵn giá trị hợp lệ
 */
public class bai8 {
	public static void main(String[] args) {
		 int n = 0;
	     int count = 0;
	        Scanner sc = new Scanner(System.in);

	        while (count < 5) {
	            System.out.print("Nhập số nguyên N: ");
	            if (sc.hasNextInt()) {
	                n = sc.nextInt();
	                if (n > 0) {
	                    checkN(n);
	                    break;
	                } else {
	                    count++;
	                    System.out.println("N không phải là số nguyên dương");
	                }
	            } else {
	                count++;
	                System.out.println("N không phải là số nguyên");
	                sc.next();
	            }
	        }
	        sc.close();
	        
	        boolean isPrime = checkN(n);
	        if(isPrime) {
	        	System.out.println(n + " -> true");
	        }else {
	        	System.out.println(n + " -> false");
	        }
	    }

	    public static boolean checkN(int N) {
	        if (N <= 1) {
	            return false;
	        } else {
	            for (int i = 2; i <= Math.sqrt(N); i++) {
	                if (N % i == 0) {
	                    return false;
	                }
	            }
	        }
	        return true;
	    }
}
