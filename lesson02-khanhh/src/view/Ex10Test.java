package view;

import java.util.Random;

public class Ex10Test {
	
	public static void main(String[] args) {
		Random rd = new Random();
		
		int[] n = new int[5];
		int d = 0;
		
		while (d < 5) {
			int number = rd.nextInt(20,31);
			boolean kiemTra = true;
			
			for (int i = 0; i < d; i++) {
				if(n[i] == number) {
					kiemTra = false;
					continue;
				}
			}
			
			if(kiemTra) {
				n[d] = number;
				d++;
			}
			
		}
		
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
	}

}
