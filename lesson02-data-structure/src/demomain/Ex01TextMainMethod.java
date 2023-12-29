package demomain;

public class Ex01TextMainMethod {
	public static void main(String[] args) {
		System.out.println("1.Ngoi sao");
		
		PrintStarTriangle("1.sda");
		PrintStarTriangle("2.sda");
		PrintStarTriangle("3.sda");
	}
	public static void PrintStarTriangle(String prefixline) {
		System.out.println(prefixline);
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
