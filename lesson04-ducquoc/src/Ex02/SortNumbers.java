package Ex02;

import java.util.Scanner;
import java.util.ArrayList;
public class SortNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("số lượng phần tửu của dãy");
		System.out.print(" số lượng phần tử của dãy số (5 <= n <= 100) ");
        int n = scanner.nextInt();
        System.out.println("Nhập dãy số nguyên ");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số thứ " + (i + 1) );
            numbers.add(scanner.nextInt());
            
        }
        ArrayList<Integer> divisibleBy7 = new ArrayList<>();
        ArrayList<Integer> divisibleBy5 = new ArrayList<>();
        ArrayList<Integer> otherNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (number % 7 == 0 && number % 5 == 0) {
                divisibleBy7.add(number);
            } else if (number % 7 == 0) {
                divisibleBy7.add(number);
            } else if (number % 5 == 0) {
                divisibleBy5.add(number);
            } else {
                otherNumbers.add(number);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(divisibleBy7);
        result.addAll(otherNumbers);
        result.addAll(divisibleBy5);
        System.out.println("sau khi xắp xếp  ");
        for (int number : result) {
            System.out.print(number + " ");
        }
	}
}
