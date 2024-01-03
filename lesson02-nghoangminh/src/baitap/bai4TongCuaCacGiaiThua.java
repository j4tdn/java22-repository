package baitap;

import java.util.Random;

public class bai4TongCuaCacGiaiThua {
	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt(11) + 10;
        int b = rd.nextInt(11) + 10;
        int c = rd.nextInt(11) + 10;
        int d = rd.nextInt(11) + 10;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        long tongGiaiThua = giaiThua(a) + giaiThua(b) + giaiThua(c) + giaiThua(d);
        System.out.println("Tổng giai thừa: " + tongGiaiThua);

	}
	private static long giaiThua(int n) {
		if(n < 0) {
			return 0;
		}
		if(n == 0 || n == 1) {
			return 1;
		}
		long giaithua = 1;
		for (int i = 2; i <= n; i++) {
			giaithua = giaithua * i;
		}
		return giaithua;
	}

}
