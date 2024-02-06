package inheritance.iinterface;

public class Ex01InheritanceInterfaceDemo {
	
	public static void main(String[] args) {
		Shape shape = new Shape() {
			
			@Override
			public void paint() {
				System.out.println("Circle --> paint");
			}
			
			@Override
			public void calcS() {
				System.out.println("circle --> calcS");
			}
		};
		shape.calcS();
		shape.paint();
		
		Shape shape2 = new Circle();
		shape2.paint();
		shape2.calcS();
		
		System.out.println("\ncon new con");
		Rectangle rectangle = new Rectangle();
		rectangle.paint();
		rectangle.calcS();
		
		System.out.println("\ncha new con");
		Shape sh1 = new Rectangle();
		sh1.paint();
		sh1.calcS();
		
		Shape sh2 = new Rectangle();
		sh2.paint();
		sh2.calcS();
	}

}
