package view;

import java.util.Random;

public class Ex04StaticMethodDemo {
	double score;
	public static void main(String[] args) {
		/*
		 Cú pháp của 1 hàm:
		 [AccessModifier] [static] [final] return_DataType methodName(parameters) {
		   //body: statements
		     }
		  + Các hàm phụ thuộc vào đối tượng gọi nó(đang gọi)
		  --> phụ thuộc: mỗi đối tượng gọi hàm sẽ đưa ra kết quả khác nhau
		  --> non-static
		  + Các hàm ko phụ thuộc vào đối tượng gọi nó(đang gọi)
		  --> ko phụ thuộc: đối tượng nào gọi cũng như nhau
		  --> static
		 */
		//Tạo ô nhớ tốn memory
		
		Ex04StaticMethodDemo.printTitle();
		System.out.println(" ===== Ví dụ 2 =====");
		Ex04StaticMethodDemo o1 = new Ex04StaticMethodDemo();
		Ex04StaticMethodDemo o2 = new Ex04StaticMethodDemo();
		//ko nên gọi :
		//o1.sum(5, 10);
		//o2.sum(7, 12);
		Ex04StaticMethodDemo.sum(5, 10);
		Ex04StaticMethodDemo.sum(7, 12);
		
		o1.score = 7.8d;
		o2.score = 8.8d;
		System.out.println("o1 is good? " + o1.isGood());
		System.out.println("o2 is good? " + o2.isGood());
		
	}
	//private static boolean isGood(double score) {
	//return score >= 8d;
    //}
	//Ex04StaticMethodDemo#score(non-static)
	//Hàm phụ thuộc vào đối tượng đang gọi, từ đối tượng đó biết được
	//score bao nhiêu để kiểm tra
	private boolean isGood() {
		return score >= 8d;
	}
	private static int sum(int a, int b) {
		return a + b;
	}
	//Hàm này tạo đối tượng nào gọi
	//cũng cho ra kết quả giống nhau --> hàm này ko phụ thuộc vào đối tượng đang gọi
	private static void printTitle() {
		System.out.println("Title: Welcome to OOP section");
	}

}
