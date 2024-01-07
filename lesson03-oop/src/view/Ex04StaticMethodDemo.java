package view;

public class Ex04StaticMethodDemo {

	private  double score;
		
	public static void main(String[] args) {
		/*
		 *Cú phaps của 1 hàm
		 *[access_modifer] [static] [final] return_data_type method_name(parament)
		 + các hàm phụ thuộc vào đối tượng gọi nó(Đang gọi)
		 --> phụ thuộc : mỗi đối tượng gọi hàm sẽ đưa ra kết quả khác nhau
		 -->non-static
		 
		 + Các hàm không phụ thuộc vào đối tượng gọi nó (Đang gọi)
		 -->ko phụ thuộc : đối tượng nào Sgọi cũng như nhau
		 ..> static
		 */
		Ex04StaticMethodDemo o1 = new Ex04StaticMethodDemo();
		Ex04StaticMethodDemo.printTỉtle();
//		System.out.println("01 is good " + o1.isGood());
	}
	private static int sum(int a ,int b) {
		return a+b;
	}
	//Hàm phụ thuộc vào đối tượng đang gọi. từ đối tượng đó biết đc scỏe bao nhiêu để kiểm tra
	private  boolean isGood(double score) {
		return score > 8;
	}
	private static void printTỉtle() {
		System.out.println("Halo");
	}
	
}
