package polymorphism.method;

public class Ex01OverloadingDemo {

	public static void main(String[] args) {

		System.out.println(sum(5,7));
		System.out.println(sum(5f,7f));
		System.out.println(sum(5,7,9));
		System.out.println(sumround(5.7f,3.1f));



	}
	private static int sum(int a, int b) {
		return a+ b;
		
	}
	private static int sum(int a, int b,int c) {
		return a+ b + c;
		
	}
	private static float sum(float a, float b) {
		return a+ b;
		
	}
	private static int sumround(float a, float b) {
		return (int) Math.ceil(a+b) ;
		
	}
	
	//Khác số lượng tham số và khác kiểu dữ liệu (1 cái là dc: của tham số truyền vào  )  --> Đặt tên trùng nhau cũng được  
    //Khác kiểu trả về ko thể đặt tên cùng nhau vì sẽ ko biết gọi hàm nào 
	
}
