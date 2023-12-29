package demomain;

public class Ex01TestMainMethod {
	public static void main(String[] args) {
		System.out.println("Welcome To Java 22 class");
		
		System.out.println("Today: lesson02-data-structure");
		
		System.out.println("====================");
		
		printStarTriangle("1. Tam giác ngôi sao");
		
		printStarTriangle("2. Tam giác ngôi sao");
		
		printStarTriangle("3. Tam giác ngôi sao");
	}
	
	// Khai báo hàm in ra tam giác ngôi sao
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
