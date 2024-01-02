package homework;

import java.util.Scanner;

/* 
  Viết chương trình tìm số nguyên lớn, nhỏ nhất trong 3 chữ số a,b,c
Biết rằng a,b,c là số nguyên được nhập từ bàn phiasm và nhỏ hơn 20 [0, 20)
 */
public class bai6 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[3];

        String[] ip = {"a", "b", "c"};

        for (int i = 0; i < n.length; i++) {
            do {
                System.out.print("Nhập " + ip[i] + ": ");
                n[i] = sc.nextInt();
            } while (n[i] < 0 || n[i] >= 20);
        }

        sc.close();

        int max = Max(n[0], n[1], n[2]);
        int min = Min(n[0], n[1], n[2]);

        System.out.println("Số nguyên lớn nhất: " + max);
        System.out.println("Số nguyên nhỏ nhất: " + min);
    }

    public static int Max(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static int Min(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }
}

