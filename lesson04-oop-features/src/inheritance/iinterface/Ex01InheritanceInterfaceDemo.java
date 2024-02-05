package inheritance.iinterface;

public class Ex01InheritanceInterfaceDemo {
	
	public static void main(String[] args) {
		// Cha, con --> Class new OK
		
		// Cha: interface
		// Con: class
		
		// interface new interface
		Shape shape1 = new Shape() {
			
			@Override
			public void paint() {
				System.out.println("Circle --> paint");
			}
			
			@Override
			public void calcS() {
				System.out.println("Circle --> calcS");
			}
		};
		shape1.paint();
		shape1.calcS();
		
		// implementation class of interface
		// dùng n lần --> reuse
		Shape shape2 = new Circle();
		shape2.paint();
		shape2.calcS();
		
		// con new con
		System.out.println("Con new Con");
		Rectangle rectangle = new Rectangle();
		rectangle.paint();
		rectangle.calcS();
		
		// cha new con
		System.out.println("Cha new Con");
		Shape sh1 = new Rectangle();
		sh1.paint();
		sh1.calcS();
		
		Shape sh2 = new Square();
		sh2.paint();
		sh2.calcS();
	}

}
