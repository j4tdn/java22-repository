package demomain;

public class Ex01TestMainMethod {
	/*
	 Commets - chu thich - duoc bo qua khi thuc thi chuong trinh
	  Class Ex01TestMainMethod : Java executable class
	  Method main: noi bd hay ket thuc 1 chuong trinh
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Java 22 class");
		System.out.println("khanh dit hoi ");
		System.out.println("1. Tam giac ngoi sao");
		Ex01TestMainMethod.printStarTriangle();	
		// ko can goi ten class. vi  nam trong class r
		System.out.println("2. Tam giac ngoi sao");
		printStarTriangle();	
	}
	public static void printStarTriangle() {
		System.out.println("print Star Triangle");
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
	}
	public static void printNumberTriangle(String prefixLine) {
		System.out.println(prefixLine);
		System.out.println("1");
	    System.out.println("2 3");
	    System.out.println("4 5 6 ");
	    System.out.println("7 8 9 10"); 
	    
	}

}