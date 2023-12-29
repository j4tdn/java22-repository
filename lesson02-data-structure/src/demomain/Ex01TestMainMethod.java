package demomain;

public class Ex01TestMainMethod {
	
	/*
	  Comments - chú thích - được bỏ qua khi chạy chương trình
	  Ex01TestMainMethod: Java executable class
	  Method main: nơi bắt đầu và kết thúc của một chương trình
	 */
	
	public static void main(String[] args) {
		System.out.println("Welcome To Java 22 class");
		System.out.println("Today: lesson02-data-structure");
		System.out.println("===========");
		printStarTriangle("1. tam giac ngoi sao");
		printStarTriangle("2. tam giac ngoi sao");
		printStarTriangle("3. tam giac ngoi sao");
	}
	
	// khai bao ham in ra tam giac ngoi sao
	public static void printStarTriangle(String prefixLine) {
		System.out.println(prefixLine);
		System.out.println("*");
		System.out.println("* *");
		System.out.println("* * *");
		System.out.println("* * * *");
	}
	
	public static void printNumberTriangle() {
		System.out.println("1");
		System.out.println("2 3");
		System.out.println("4 5 6");
		System.out.println("7 8 9 10");
	}
}	
