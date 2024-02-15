package inheritance.iinterface;

public class Ex01InheritanceInterfaceDemo {
	
	public static void main(String[] args) {
		System.out.println("shape a --> " + Shape.a);
		
		// Cha, Con --> Class --> new OK
		
		// Cha: interface
		// Con: class
		
		// interface new interface
		
		// anonymous class of interface
		// dùng 1 lần
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
		shape1.calcS();
		shape1.paint();
		
		// implementation class of interface
		// dùng n lần -> reuse
		Shape shape2 = new Circle();
		shape2.calcS();
		shape2.paint();
		
		System.out.println("\nCon New Con");
		Rectangle rectangle = new Rectangle();
		rectangle.paint();
		rectangle.calcS();
		
		System.out.println("\nCha New Con");
		Shape sh1 = new Rectangle();
		sh1.paint();
		sh1.calcS();
		
		Shape sh2 = new Square();
		sh2.paint();
		sh2.calcS();
	}
	
}
