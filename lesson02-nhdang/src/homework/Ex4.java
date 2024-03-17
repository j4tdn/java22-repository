package homework;

import java.util.Random;

public class Ex4 {
	public static void main(String[] args) {
		System.out.println("4. Tính tổng giải thừa");
		Random rd = new Random();
		long sum1 = 1;
		long sum2 = 2;
		long sum3 = 3;
		long sum4 = 4;
		long sum;
		long i, j, k , l;
		int d[] = new int[] {10,11,12,13,14,15,16,17,18,19,20};
		long a = d[rd.nextInt(d.length)];
		for (i=1; i<=a; i++) {
			sum1*=i;
		}
		long b = d[rd.nextInt(d.length)];
		for (j=1; j<=b; j++) {
			sum2*=j;
		}
		long c = d[rd.nextInt(d.length)];
		for (k=1;k<=c;k++) {
			sum3*=k;
		}
		long f = d[rd.nextInt(d.length)];
		for (l=1;l<=f;l++) {
			sum4*=l;
		}
		sum = sum1+sum2+sum3+sum4;
		System.out.println("So random thu nhat: "+a);
		System.out.println("So random thu hai: "+b);
		System.out.println("So random thu ba: "+c);
		System.out.println("So random thu tu: "+f);

		System.out.println("Tong giai thua cua 4 so random trong mang [10, 20]: " + sum);
	}
}
