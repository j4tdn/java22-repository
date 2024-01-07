package view;

import java.util.Random;

public class Ex04StaticMethodDemo {
	
	private double score;
	
	public static void main(String[] args) {
		
		/*
		 + Các hàm phụ thuộc vào đối tượng gọi nó
		   phụ thuộc: mỗi đối tượng gọi hàm sẽ đưa ra kết quả khác nhau
		   --> non-static
		   
		 + Các hàm ko phụ thuộc vào đối tượng gọi nó
		   ko phụ thuộc: đối tượng nào gọi cũng như nhau
		   --> static
		 */
		
		Ex04StaticMethodDemo o1 = new Ex04StaticMethodDemo();
		o1.score = 7.8d;
		Ex04StaticMethodDemo o2 = new Ex04StaticMethodDemo();
		o2.score = 8.8d;
		
		// o1.sum(5, 10);
		// o2.sum(7, 12);
		
		Ex04StaticMethodDemo.sum(5,10);
		
		System.out.println("o1 is Good? " + o1.isGood());
		System.out.println("o2 is Good? " + o2.isGood()						);
		
		
		// Ex04StaticMethodDemo.printTitle();
		// Ex04StaticMethodDemo.printTitle();

		
	}
	
	// Hàm phụ thuộc vào đối tượng đang gọi, từ đối tượng đó biết được
	// score bao nhiêu để kiểm tra
	private boolean isGood() {
		return score >= 8d;
	}
	
	// hàm phụ thuộc vào giá trị tham số truyền vào
	// cho a, b mấy thì return sum a và b như vậy
	private static int sum(int a, int b) {
		return a + b;
	}
	
	// Hàm này tạo  đối tượng nào gọi
	// cũng cho ra kết quả giống nhau --> hàm này ko phụ thuộc vào đối tượng đang gọi
	private static void printTitle() {
		System.out.println("Title: Welcome to OOP section");
	}

}
