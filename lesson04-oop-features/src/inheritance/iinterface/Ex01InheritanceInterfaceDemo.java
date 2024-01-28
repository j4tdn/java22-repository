package inheritance.iinterface;

public class Ex01InheritanceInterfaceDemo {

	public static void main(String[] args) {
		System.out.println(" Shape a --> "+Shape.a);
		
		//con new con
		System.out.println("\n con new con:");
		Rectangle rectangle = new Rectangle();
		rectangle.paint();
		rectangle.calcS();
		
		//cha new cha
		Shape shape = new Shape() {
			
			@Override
			public void paint() {
				System.out.println("Circle --> paint");
				
			}
			
			@Override
			public void calcS() {
				System.out.println("Circle --> calcS");
				
			}
		};
		shape.calcS();
		shape.paint();

		
		//cha new con
		System.out.println("\n Cha new con:");
		Shape sh1 = new Rectangle();
		sh1.calcS();
		sh1.paint();
		
		Shape sh2 = new Square();
		sh2.paint();
		sh2.calcS();
	}
}
