package inheritance.iinterface;

public class Ex01InheritanceInterfaceDemo {

	public static void main(String[] args) {
		System.out.println(Shape.a);
		
		//Cha, con --> Class --> new OK
		
		//Cha: interface
		//COn: class 
		
		//interface new interface
		
		//anoymous class of interface
		// dùng 1 lần
		Shape shape1 = new Shape() {

			@Override
			public void paint() {
				System.out.println("Circle --> paint");
				
			}

			@Override
			public void calcS() {
				System.out.println("Circle --> calS");
				
			}
			

		};
		shape1.paint();
		shape1.calcS();
		
		//cha new cha
		//con new con
		
		// implementation class of interface
		// dùng n lần -> reuse 
		Shape shape2 = new Circle();
		shape2.calcS();
		shape2.calcS();
		
		System.out.println("\nCon New Con");
		Rectangle rectangle = new Rectangle();
		rectangle.paint();
		rectangle.calcS();
		
		//cha new con
		Shape sh1 = new Rectangle();
		sh1.paint();
		sh1.calcS();
		
		Shape sh2 = new Square();
		sh2.paint();
		sh2.calcS();
		
	}
}
