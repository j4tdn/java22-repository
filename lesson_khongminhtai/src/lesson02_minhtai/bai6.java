package lesson02_minhtai;

import java.util.Scanner;
/*
		 * Viết chương trình tìm số nguyên lớn, nhỏ nhất trong 3 chữ số a,b,c
		Biết rằng a,b,c là số nguyên được nhập từ bàn phiasm và nhỏ hơn 20 [0, 20)
		VD: Nhập a = 6
		Nhập b = “xyz” → báo lỗi, yêu cầu nhập lại
		Nhập b = 12
		Nhập c = 8
		Số lớn nhất là 12
		Số nhỏ nhất là 6
 */

public class bai6 {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập a : ");
            while (!sc.hasNextInt()) {
                System.out.println("Lỗi! Hãy nhập lại ");
                sc.next();
            }
            a = sc.nextInt();
        } while (a < 0 || a >= 20);
        do {
            System.out.print("Nhập b : ");
            while (!sc.hasNextInt()) {
                System.out.println("Lỗi! Hãy nhập lại ");
                sc.next();
            }
            b = sc.nextInt();
        } while (b < 0 || b >= 20);
        do {
            System.out.print("Nhập c: ");
            while (!sc.hasNextInt()) {
                System.out.println("Lỗi! Hãy nhập lại ");
                sc.next();
            }
            c = sc.nextInt();
        } while (c < 0 || c >= 20);
        if( a >= b && a >= c)
            System.out.println(a +" là số lớn nhất!!");
 
        else if (b >= a && b >= c)
            System.out.println(b +" là số lớn nhất!!");
        else
            System.out.println(c +" là số lớn nhất!!");

	}
	
}
