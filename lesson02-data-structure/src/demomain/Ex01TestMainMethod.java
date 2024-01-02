package demomain;

public class Ex01TestMainMethod {

	public static void main(String[] args) {
		System.out.println("Welcome To Java 22 class");
		System.out.println("Today: lesson02-data-structure");
		System.out.println("===================");
		printStarTriangle("1. Tam giac ngoi sao");
		printStarTriangle("2. Tam giac ngoi sao");

		printStarTriangle("3. Tam giac ngoi sao");

	}
   public static void printStarTriangle(String prefixLine) {
	   System.out.println(prefixLine);
		System.out.println("*");
		System.out.println("* *");
		System.out.println("* * *");
		System.out.println("* * * *");
   }
   public static void printNumberTriangle(String prefixLine) {
	   System.out.println(prefixLine);
	   System.out.println("1");
	   System.out.println(" 2 3 ");
	   System.out.println(" 4 5 6 ");
	   System.out.println(" 7 8 9 10 ");
   }
}

// 1.Static: thuộc phạm vi class, có thể được gọi trực tiếp từ trên class
// Vd        Ex01TestMainMethod.printTriangle();
