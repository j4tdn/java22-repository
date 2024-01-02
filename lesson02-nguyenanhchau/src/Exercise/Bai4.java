package Exercise;

import java.lang.reflect.Array;
import java.util.Random;

public class Bai4 {

	public static void main(String[] args) {
		long[] array = new long[4];
		Random rd = new Random();
		for (int i = 0; i < 4; i++) {
			array[i] = rd.nextInt(10)+11;
			System.out.println("So nguyen thu " + (i+1)+" la : " + array[i]);
			//System.out.println(tinhGiaithua(array[i]));

		}
		System.out.println("Tong giai thua: S = " + array[0] + "! + "+ array[1] + "! + "
		+ array[2] + "! + "+ array[3] + "! = " + tinhtongGiaithua(array) );
		

	}

	private static long tinhtongGiaithua(long[] a) {
		long sum = 0 ;
		for (int i = 0; i < a.length ; i++) {
			sum += tinhGiaithua(a[i]);	
		}
		return sum;
	}
	private static long tinhGiaithua(long a) {
		long ketqua = 1;
		for (int i = 1; i <= a; i++) {
			ketqua *= i;
		}
		return ketqua;
	}
}
