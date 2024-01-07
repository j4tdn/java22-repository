package view;

import java.util.Random;

public class Ex04StaticMethodDemo {
	private double score;

	public static void main(String[] args) {
		Ex04StaticMethodDemo.printRandNumber();
		Ex04StaticMethodDemo.num(1, 9);
        /*
         cú pháp của 1 hàm
         [access_modifier] [static] [final] return_data_type method_name(parameter)
         //body: statements
          +các hàm phụ thuộc vào đối tượng gọi nó(đang gọi)
           -->phụ thuộc: mỗi đối tượng gọi hàm sẽ đưa ra kết quả khác nhau
           -->non-static
           +Các hàm k phụ thuộc vao đối tượng gọi nó(đang gọi)
           --> k phụ thuộc: đối tượng nào gọi cũng như nhau
           --> static
         */
		System.out.println("====vÍ dụ=====");
		Ex04StaticMethodDemo o2 = new Ex04StaticMethodDemo();
		int score; 
		o2.score=8.8d;
		System.out.println("o2 is good? " + o2.isGood());
		
	}
	//hàm này tạo đối tượng nào gọi cũng cho ra kết quả giống nhau,
	//k phụ thuộc vào đối tượng đang gọi
	private static void printRandNumber(){
		System.out.println("Random numer --> " + new Random().nextInt(20,31));
	}
	//hàm này phụ thuộc vào giá trị tham số truyền vào a,b
	//cho a, b mấy thì return sum a + b như vậy
	private static int num(int a, int b) {
		return a+b;
		
	}
	
	private /*static*/ boolean isGood() {
		return score >= 8d;
	}
}
