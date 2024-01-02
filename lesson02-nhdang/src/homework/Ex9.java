package homework;

import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		System.out.println("9. Tìm số nguyên tố thứ 200");
		Scanner sc = new Scanner (System.in);
		int n = 200;
		int num = 1;
		int count = 0;
		int i;
	    while (count < n) {
	    	num = num + 1;
	    	for (i = 2; i<num;i++) {
	    		if(num%i==0) {
	    			break;
	    		}
	    	}
	    	if(i==num) {
	    		count = count + 1;
	    	}
	    }
	    System.out.println(num);
	}
}
