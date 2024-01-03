package lesson02_minhtai;

import java.util.Scanner;
	/* Viết chương trình(hàm) kiểm tra số nguyên N có phải là bội của 2 hay không
	đa 5 lần)
	VD: Nhập N = abc → báo lỗi, yêu cầu nhập lại 
	= 4 → true
	= 6 → true
	= 7 → false
	 */

public class bai1 {
	public static void main(String[] args) {
		// n la so lan false khi N khong phai la boi 2
		int  n = 0;
		Scanner sc = new Scanner(System.in);
		
		while (n < 5) {
            System.out.println("Nhap mot so : ");
            int N = sc.nextInt();

            if (N % 2 == 0) {
                System.out.println(N + " là bội của 2");
                break; 
                //Thoát khỏi vòng lặp khi đã tìm được số chẵn
            } else {
                System.out.println(N + " không là bội của 2");
                n++;
            }
        }

        if (n == 5) {
            System.out.println("Bạn đã nhập quá 5 lần không thể tiếp tục nhập");
        }
}
}
