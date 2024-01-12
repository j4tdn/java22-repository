package polymorohism.method;

public class Ex01OverloadingDemo {
	public static void main(String[] args) {
		/*
		 Viết hàm để:
		 1.tính tổng 2 số nguyên , trả về số nguyên
		 2.tính tổng 3 số nguyên, trả về số nguyên
		 3.tính tổng 2 số thực, trả về số thực
		 4.tính tổng 2 số thực, trả về số nguyên (là kết quả làm tròn trên số thực trả về)
		 Roud Commercial : làm tròn bình thường
		 Round Up; lt trên
		 Round Down: lt dưới
		 */
		
		System.out.println(sum(5, 7));//sum(int,int)
		System.out.println(sum(5f, 7f));// fl,fl
		System.out.println(sum(5, 7,9));//int,int,int
		System.out.println(sumAndRoundUp(2.2f, 3.1f));
		
	}
	private static int sum(int a, int b) {
		return a + b;
	}
	private static int sum(int a, int c, int b) {
		return a + b + c;
	}
	private static float sum(float a, float b) {
		return a + b;
	}
	private static int sumAndRoundUp(float a, float b) {
		return (int)Math.ceil(a +b );
	}
	
	

}
