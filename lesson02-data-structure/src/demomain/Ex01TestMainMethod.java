package demomain;

public class Ex01TestMainMethod {
	/*
	 Comments - chú thích - được bỏ qua khi thực thi chương trình
	 Class Ex01TestMainMethod Java executable class 
	 Method main : nơi bắt đầu và kết thúc của 1 chương trình
	 */
	public static void main(String[] args) {
		System.out.println("Welcome To Java 22 Class");
		System.out.println("1");
		Ex01TestMainMethod.printStarTriangle();
		System.out.println("2");
		Ex01TestMainMethod.printStarTriangle();

		System.out.println("3");
		Ex01TestMainMethod.printStarTriangle();


		

	}
	private static void printStarTriangle() {
		System.out.println("print star triangle");
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
	}
}
