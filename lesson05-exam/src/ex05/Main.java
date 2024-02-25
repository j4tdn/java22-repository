package ex05;

import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {
		SachGiaoKhoa s1 = new SachGiaoKhoa("SGK", "100", "Nhi Dong", false);
		SachGiaoKhoa s2 = new SachGiaoKhoa("SGK", "140", "Nhi Dong", false);
		SachGiaoKhoa s3 = new SachGiaoKhoa("SGK", "160", "BGDVDT", true);
		
		SachThamKhao t1 = new SachThamKhao("STK", "50", "Nhi Dong", new BigDecimal("5"));
		SachThamKhao t2 = new SachThamKhao("STK", "200", "BGDVDT", new BigDecimal("10"));
		SachThamKhao t3 = new SachThamKhao("STK", "100", "Nhi Dong", new BigDecimal("0"));
		
		Book [] 
		
		System.out.println("s1 --> " + s1);
	}

}
