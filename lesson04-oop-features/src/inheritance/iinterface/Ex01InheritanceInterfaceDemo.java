package inheritance.iinterface;


public class Ex01InheritanceInterfaceDemo {
	public static void main(String[] args) {
		//cha, con : class--> ok
		
		//cha: intreface
		//con: class
		
		//cha new cha
		//Interface  new Interface --> ko đc
		Shape shape = new Circle() {// anonymous class ==> cách 1
			
			@Override
			public void paint() {
				System.out.println("circle --> paint");
			}
			
			@Override
			public void calcS() {
				System.out.println("circle --> calcS");
			}
		};
		shape.paint();
		shape.calcS();
		// cách 2 
		Shape shape1 = new Circle();
		shape1.paint();
		shape1.calcS();
		
		//con new con
		System.out.println("con new con");
		Rectangle rectangle = new Rectangle();
		rectangle.paint();
		rectangle.calcS();
		
		//cha new con
		System.out.println("cha new con");
		Shape sh1 = new Rectangle();
		sh1.paint();
		sh1.calcS();
	}
}
