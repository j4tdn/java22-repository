package view;

import java.util.Random;

public class Ex04StaticMethodDemo {
	
	private double score;

	public static void main(String[] args) {
		/*
		 cú pháp của 1 hàm 
		  
			 [access_modifier] [static] [final] return_data_type method_name(parameters){
			 }
		 
		 + Các hàm phụ thuộc đối tượng gọi nó(dang gọi)
		 	--> phụ thuộc: mỗi đối tượng gọi hàm sẽ đưa ra kết quả khác nhau
		 	--> non-static
		 	
		 + Các hàm không phụ thuộc vào đối tượng gọi nó(đang gọi)
		 	--> ko phụ thuộc: đối tượng nào gọi cũng như nhau
		 	--> static
		 */
		
		//tạo ô nhớ tốn memory
//		Ex04StaticMethodDemo o1 = new Ex04StaticMethodDemo();
//		Ex04StaticMethodDemo o2 = new Ex04StaticMethodDemo();
//		o1.printTitle();
//		o2.printTitle();
		
		Ex04StaticMethodDemo.printTitle();
		Ex04StaticMethodDemo.printTitle();
		
		System.out.println("========Ví dụ 02 =======");
		Ex04StaticMethodDemo o1 = new Ex04StaticMethodDemo();
		o1.score = 7.8d;
		Ex04StaticMethodDemo o2 = new Ex04StaticMethodDemo();
		o2.score= 8.8d;
		//không nên
//		o1.sum(5, 10);
//		o2.sum(7, 12);
		
		Ex04StaticMethodDemo.sum(5, 10);
		Ex04StaticMethodDemo.sum(7, 12);
		
		System.out.println("o1 is good ? "+o1.isGood());
		System.out.println("o2 is good ? "+o2.isGood());
		
	}
	private static boolean isGood(double score) {
		return score > 8d;
	}
	
	// Hàm phụ thuộc vào đối tượng đag gọi, từ đối tượng đó
	// biết đc score bao nhiêu để kiểm tra
	private /*static*/ boolean isGood() {
		return this.score >= 8d;
	}
	private static void printTitle() {
		
		System.out.println("");
	}
	// hàm phụ thuộc vào giá trị của tham số truyền vào a, b
	// cho a,b mất thì return sum a và b như vậy
	private static int sum(int a, int b) {
		return a + b;
	}
}
