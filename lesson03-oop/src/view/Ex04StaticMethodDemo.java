package view;

import java.util.Random;

public class Ex04StaticMethodDemo {
	private double score;
	public static void main(String[] args) {
		/*
		 +Các hàm mà phụ thuộc vào đối tượng đang gọi nó 
		 --> Non-Static 
		 		 PHỤ THUỘC : Mỗi đối tượng gọi hàm sẽ đưa ra kết quả khác nhau 

		 +Các hàm không phụ thuộc vào đối tượng đang gọi nó 
		 --> Static 
		         Ko PHỤ THUỘC : Mỗi đối tượng gọi hàm sẽ đưa ra kết quả như nhau  
		 
		 */
//		Ex04StaticMethodDemo o1 = new Ex04StaticMethodDemo();
//		Ex04StaticMethodDemo o2 = new Ex04StaticMethodDemo();
//		o1.printTitle();
//		o2.printTitle();
		Ex04StaticMethodDemo.printTitle();
		Ex04StaticMethodDemo.printTitle();
		System.out.println("============================");
		Ex04StaticMethodDemo o1 = new Ex04StaticMethodDemo();
		o1.score = 7.8d;
		Ex04StaticMethodDemo o2 = new Ex04StaticMethodDemo();
		o2.score = 8.8;
		
		System.out.println("o1 is good ?" + o1.isGood());
		System.out.println("o2 is good ?" + o2.isGood());

		o1.sum(2, 0);//ko nên 
		o2.sum(3, 2);//ko nên 
		Ex04StaticMethodDemo.sum(2, 4);//Nên 
	}
     private static void printTitle() {
    	 System.out.println("Hellp JAVA");
     }
     //Hàm phụ thuộc vào giá trị của tham số truyền vào a,b chứ ko phải là phụ thuộc vào đối tượng 
     //Vẫn phải có static 
     private static int sum( int a, int b) {
    	 return a + b;
     }
     //Hàm phụ thuộc vào đối tượng đang gọi, từ đối tượng đó mới biết được score bao nhiêu để kiểm tra 
     private boolean isGood() {
    	 return score >= 8d;
     }
     //Chuyển hàm trên thành có static 
     private static boolean isGoodstatic(double score) {
    	 return score >= 8d;
     }
     
     

}
