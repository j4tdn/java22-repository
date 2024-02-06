package view;

import java.util.Random;

public class Ex04StaticMethodDemo {
	private double score;
	
	public static void main(String[] args) {
		Ex04StaticMethodDemo.printRandomNumber();
		
		Ex04StaticMethodDemo.sum(4,8);
		
		Ex04StaticMethodDemo o1 = new Ex04StaticMethodDemo();
		o1.score = 7.8d;
		
		Ex04StaticMethodDemo o2 = new Ex04StaticMethodDemo();
		o2.score = 8.8d;
		
		System.out.println(o1.isGood());
		System.out.println(o2.isGood());
	}
	
	private boolean isGoods(double score) {
		return score >= 8d;
	}
	
	private boolean isGood() {
		return score >= 8d;
	}
	
	private static void printRandomNumber() {
		System.out.println("Random number --> " + new Random().nextInt(20));
	}
	
	private static int sum(int a, int b) {
		return a + b;
	}

}
/*
 cú pháp của một hàm
 
  [access-modifier] [static] [final] return_data_type method_name(parameters){
    body: statements
 */


/*
 các hàm phụ thuộc vào đối tượng gọi nó (đang gọi)
 -->phụ thuộc: mỗĩ đói tượng gọi hàm sẽ đưa ra kết quả khác nhau
 --> non-static
 
 cac hàm không phụ thuộc vào đối tượng gọi nó(đang gọi)
 --> không phụ thuộc: đối tượng nào gọi cung như nhau
 --> static
 */
 
