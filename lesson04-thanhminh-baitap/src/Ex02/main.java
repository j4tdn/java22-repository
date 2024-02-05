package Ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số lượng phần tử của dãy số (5 <= n <= 100: ");
		int n = sc.nextInt();
		
		if (n < 5 || n > 100) {
			System.out.println("Số lượng phần tử không hợp lệ. Vui lòng nhập lại. ");
			return;
		}
		System.out.println("Nhập dãy số nguyên ngẫu nhiên: ");
		int[] number = new int[n];
		for (int i = 0; i< n; i++) {
			number[i] = sc.nextInt();		
		}
		arrangeNumbers(number);
		System.out.println("Dãy số sau khi sắp xếp:");
        for (int num : number) {
            System.out.print(num + " ");
        }
	}
	private static void arrangeNumbers(int[] number) {
		ArrayList<Integer> divisibleBy7 = new ArrayList<>();
        ArrayList<Integer> divisibleBy5 = new ArrayList<>();
        ArrayList<Integer> otherNumbers = new ArrayList<>();
        
        for (int num : number) {
            if (num % 7 == 0 && num % 5 == 0) {
                divisibleBy7.add(num);
            } else if (num % 7 == 0) {
                divisibleBy7.add(num);
            } else if (num % 5 == 0) {
                divisibleBy5.add(num);
            } else {
                otherNumbers.add(num);
            }
        }
        
        int index = 0;
        for (int num : divisibleBy7) {
            number[index++] = num;
        }
        for (int num : otherNumbers) {
            number[index++] = num;
        }
        for (int num : divisibleBy5) {
            number[index++] = num;
        }
        
	}
}
