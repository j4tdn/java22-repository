package baitap1;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = 5;

        while (A > 0) {
            System.out.print("nhap so  N ");
            
            if (scanner.hasNextInt()) {
                int N = scanner.nextInt();

                if (N > 0) {
                    if ((N & (N - 1)) == 0) {
                        System.out.println(N + " la luy thua cua  2");
                        break;
                    } else {
                        System.out.println(N + " khong la luy thua cua 2");
                        A--;
                    }
                } else {
                    System.out.println("vui long nhap lai");
                    A--;
                }
            } else {
                System.out.println("vui long nhap so nguyen ");
                A--;
                scanner.next(); 
            }
}
	}
}
