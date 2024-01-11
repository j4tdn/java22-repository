package polymorphism.method;

public class Ex01OverloadingDemo {
	public static void main(String[] args) {
        /*
         Viết hàm:
         1. Tính tổng 2 số nguyên, trả về số nguyên
         2. Tính tổng 3 số nguyên, trả về số nguyên
         3. Tính tổng 2 số thực, trả về số thực
         4. Tính tổng 2 số thực, trả về số nguyên (làm tròn từ kết quả số thực trả về)
         
         Round Commercial
         Round Up
         Round Down
         */
		System.out.println(sum(5,7));
		System.out.println(sum(5f,7f));
		System.out.println(sum(5,7,9));
		System.out.println(timsum(2.2f, 3.3f));
     		
		
	}
	private static int sum(int a, int b) {
	     return a+b;	
	}
    
	private static int sum(int a, int b, int c) {
		return a+b+c;
	}
	private static float sum(float a, float b) {
		return a+b;
	}
	private static int timsum(float a, float b) {
		return (int)Math.ceil(a+b);
	}
}
