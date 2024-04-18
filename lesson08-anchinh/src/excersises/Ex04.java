package excersises;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
        System.out.print("Nhập n: ");
        long n = ip.nextLong();
        System.out.print("Nhập m: ");
        long m = ip.nextLong();
    
        if (areRelativePrime(n, m)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        ip.close();
		
	}
	//check số nguyên tố tương đương 
	public static boolean areRelativePrime(long a, long b) {
		return calculateGcd(a, b) == 1;
	}
	
	//tính ước chung lớn nhất
	public static long calculateGcd(long a, long b) {
		while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
