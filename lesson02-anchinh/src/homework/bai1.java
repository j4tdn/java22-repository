package homework;

import java.util.Scanner;

/* 
Viết chương trình(hàm) kiểm tra số nguyên N có phải là bội của 2 hay không
Yêu cầu: N là số nguyên dương được nhập từ bàn phím
bắt buộc nhập lại nếu N không hợp lệ (tối đa 5 lần)
 */
public class bai1 {
	public static void main(String[] args) {
		int n = 0;
		int count = 0; 
		Scanner sc = new Scanner(System.in);
		
		while(count < 5) {
			System.out.print("Nhập số nguyên N: ");
			if(sc.hasNextInt()) {
				n = sc.nextInt();
				if(n > 0) {
					checkN(n);
					break;
				}else {
					count++;
					System.out.println("N không phải là số nguyên dương");
				}
			}else {
				count++;
				System.out.println("N không phải là số nguyên");
				sc.next();
			} 
		}
		sc.close();
	}
	public static void checkN(int N) {
		if(N % 2 == 0) {
			System.out.println(N + " -> true");
		} else {
			System.out.println(N + " -> false");
		}
	}	
}
