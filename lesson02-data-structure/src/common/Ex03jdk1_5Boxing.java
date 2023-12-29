package common;

public class Ex03jdk1_5Boxing {
	
	public static void main(String[] args) {
		
		// Với những kiểu dữ liệu có sẵn(nguyên thủy và đối tượng) của Java
		// int Integer: int 
		// float Float: float
		// long Long: long
		
		// int có thể nhận giá trị từ Integer --> ko cần ép kiểu
		// Integer có thể nhận giá trị từ int --> ko cần ép kiểu
		
		// Từ V1.0 đến V1.4
		// Chưa xuất hiện khái niệm auto-boxing, auto-unboxing
		
		// Từ V.15
		// Xuất hiện khái niệm
		// auto-boxing -> Java sẽ tự động convert kiểu nguyên thủy sang kiểu đối tượng tương ứng
		// -> int(Integer), long(Long)
		
		// auto-unboxing -> Java sẽ tự động convert kiểu đối tượng sang kiểu nguyên thủy tương ứng
		
		
		int x1= 2;
		int x2 = 8;
		
		Integer xo1 = 17;
		Integer xo2 = 91;
		
		swapInt(x1, x2);
		
		System.out.println("\n==============\n");
		
		swapInteger(xo1, xo2);
		
		// Cẩn thận khi mà unboxing(đối tượng sang nguyên thủy) 
		// đối tượng(null,value)
		// nguyên thủy(value)
		Integer a = null;
		int b = a;
		System.out.println("b -> "+b);
		
		
	}
	
	private static void swapInt(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	
	// swap at stack
	private static void swapInteger(Integer a, Integer b) {
		Integer temp = a;
		a = b;
		b = temp;
	}
	
}
