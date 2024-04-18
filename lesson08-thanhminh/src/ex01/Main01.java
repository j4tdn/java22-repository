package ex01;

import java.util.Scanner;

public class Main01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi ký tự có dấu: ");
		String inp = sc.nextLine();
		
		System.out.println("Mỗi kí tự trên một dòng:");
        for (int i = 0; i < inp.length(); i++) {
            System.out.println("Kí tự thứ " + i + ": " + inp.charAt(i));
        }
        
        System.out.println("Mỗi từ trên một dòng:");
        String[] elements = inp.split("\s"); 
		for (int i = 0; i < elements.length; i++) {
			System.out.println("Từ thứ " + i + ": " + elements[i]);
		}
		
		System.out.println("Chuỗi đảo ngược theo kí tự:");
		for (int i = inp.length() -1; i>= 0; i--) {
            System.out.println("Kí tự thứ " + i + ": " + inp.charAt(i));
        }
        
		System.out.println("Chuỗi đảo ngược theo từ:");
		for (int i = elements.length -1; i>= 0; i--) {
			System.out.println("Từ thứ " + i + ": " + elements[i]);
		}		 
	}
}
