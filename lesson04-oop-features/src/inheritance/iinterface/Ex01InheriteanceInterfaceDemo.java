package inheritance.iinterface;

public class Ex01InheriteanceInterfaceDemo {
	public static void main(String[] args) {
		// cha, con --> class --> new OK
		// Cha: interface
		// Con: class
		// cha new cha
		System.out.println("Con new con");
		Rectangle rectangle = new Rectangle();
		rectangle.calcS();
		rectangle.paint();
		System.out.println("\nCha new Con");
		//
		Shape sh1 = new Rectangle();
		sh1.paint();
		sh1.calcS();
		
		Shape sh2 = new Square();
		sh2.paint();
		sh2.calcS();
	}

}
