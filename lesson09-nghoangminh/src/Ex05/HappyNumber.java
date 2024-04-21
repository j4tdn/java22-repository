package Ex05;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Nhập số cần kiểm tra: ");
	        int number = sc.nextInt();

	        if (isHappy(number)) {
	            System.out.println(number + " là số hạnh phúc.");
	        } else {
	            System.out.println(number + " không phải là số hạnh phúc.");
	        }

	        sc.close();
	    }
	static int sumOfSquares(int n) {
		int sum = 0;
		while(n!=0) {
			int digit = n % 10;
			sum += digit * digit;
			n/=10;
		}
		return sum;
	}
	static boolean isHappy(int n) {
		Set<Integer> seen = new HashSet<>();
		while(n!= 1 && !seen.contains(n)) {
			seen.add(n);
			n = sumOfSquares(n);
		}
		return n == 1;
	}
	

}
