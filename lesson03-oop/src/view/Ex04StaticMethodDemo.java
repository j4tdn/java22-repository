package view;

import java.util.Random;

public class Ex04StaticMethodDemo {
	private double score;
	public static void main(String[] args) {
		
		/*
		 * các hàm phụ thuộc vào đối tượng gọi nó
		 * -->phụ thuộc:mỗi đối tượng gọi hàm sẽ đưa ra kết quả khác nhau
		 * -->non-static
		 * +các hàm ko phụ thuộc vào đối tượng gọi nó(đang gọi)
		 * --> ko phụ thuộc(đối tượng nào gọi cũng như nhau)
		 * -->static*/
		Ex04StaticMethodDemo o1 = new Ex04StaticMethodDemo();
		o1.score=7.8d;
		Ex04StaticMethodDemo o2 = new Ex04StaticMethodDemo();
		o2.score=8.8d;
		
		System.out.println("o1 is good ? " + o1.isGood());
		System.out.println("o2 is good ? " + o2.isGood());
		Ex04StaticMethodDemo.printTitle();
		
		Ex04StaticMethodDemo.sum(5, 10);
	}
	private static boolean isGood(double score) {
		return score > 8d;
	}
	
	private boolean isGood() {
		return score >=8d;
	}
	// hàm phụ thuộc tham số truyền vào
		private static int sum(int a, int b) {
			return a + b;
		
	}
		// hàm này đối tượng nào gọi
	private static void printTitle() {
		
		System.out.println("Tilte: Welcome to OOP ");
	}

}
