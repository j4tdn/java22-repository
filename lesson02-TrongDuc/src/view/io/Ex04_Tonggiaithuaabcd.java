package view.io;

import java.util.Random;

public class Ex04_Tonggiaithuaabcd {
	public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(11) + 10;
        int b = random.nextInt(11) + 10;
        int c = random.nextInt(11) + 10;
        int d = random.nextInt(11) + 10;
        
        
        
        System.out.println(a + "! = " + tinhgiaithua(a));
        System.out.println(b + "! = " + tinhgiaithua(b));
        System.out.println(c + "! = " + tinhgiaithua(c));
        System.out.println(d + "! = " + tinhgiaithua(d));
        int tonggiaithua	= tinhgiaithua(a) + tinhgiaithua(b) + tinhgiaithua(c) + tinhgiaithua(d);
        System.out.println("tonggiathuala: " + tonggiaithua );
}

	private static int tinhgiaithua(int n) {
		
	int gt = 1;
    for (int i = 1; i <= n; i++) {
        gt *= i; 
    }
    return gt;
	}
}