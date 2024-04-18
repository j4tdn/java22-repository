package ex04;

import java.util.Scanner;

public class Unsigned {
	public static void main(String[] args) {
		System.out.println(" nhập 2 số nguyên dương bạn muốn kiểm tra ");
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0 ;
		StringBuilder sb = new StringBuilder();
		  
		try {
			System.out.println("Nhập số nguyên dương a:");
			 a = sc.nextInt();
			System.out.println("Nhập số nguyên dương b:");
			 b = sc.nextInt();
			if (a > 0 && b > 0) {
				
			}
		} catch (Exception e) {
			System.out.println("Nhập lại 2 số nguyên dương a và b.");
		} 
		if(a  > b) {
			for(int i = 1 ; i < b ; i++) {
				if(b % i == 0 && a % i ==0) {
					sb.append(i).append(" ");
				}
			}
		} else {
			for (int i = 1; i < a; i++) {
				if(a % i == 0 && b % i ==0) {
					sb.append(i).append(" ");
				}
		}
		
	}
		String str = sb.toString();
		String[] array = str.split(" ");
		if(hasMoreThanTwoPrimes(array)) {
			System.out.println("hai số a và b là 2 số nguyên tố tương đương ");
		}
		else {
			System.out.println("hai số a và b ko phải là 2 số nguyên tố tương đương ");
		}
	}
	public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
	public static boolean hasMoreThanTwoPrimes(String[] array) {
	    int count = 0;
	    for (String str : array) {
	        int num = Integer.parseInt(str); 
	        if (isPrime(num)) {
	            count++;
	        }
	        if (count >= 2) {
	            return true;
	        }
	    }
	    return false;
	}

	}
