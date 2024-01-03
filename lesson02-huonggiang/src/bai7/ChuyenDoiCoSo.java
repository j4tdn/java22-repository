package bai7;

import java.util.Scanner;

public class ChuyenDoiCoSo {
	public static void main(String[] args) {
		
	
	Scanner ip = new Scanner(System.in);
	System.out.println("NHap so tu nhien co so 10: ");
	
	int soThapPhan = ip.nextInt();
	String soNhiPhan = chuyenDoi(soThapPhan);
	System.out.println("So o he co so 2: " + soNhiPhan);

    
	
	}
	private static String chuyenDoi(int soThapPhan) {
		if(soThapPhan == 0) {
			return "0";
		}
		StringBuilder nhiPhan = new StringBuilder();
		while(soThapPhan > 0) {
			int du = soThapPhan % 2;
			nhiPhan.insert(0, du);
			soThapPhan /= 2;
		}
		return nhiPhan.toString();
	}
}
