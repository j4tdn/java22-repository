package inheritance.iinterface;


public class InheritanceInterfaceDemo {
	public static void main(String[] args) {
		
		//cha, con-->Class-->new OK
		
		//cha : interface
		//con: class
		
		//interface new interace
		
		//anonymous class of interface
		//dùng 1 lần
		Shape shape1 = new Shape() {
			
			@Override
			public void paint() {
				System.out.println("Circle->paint");
			}
			
			@Override
			public void calcS() {
				System.out.println("Circle->calcS");
				// TODO Auto-generated method stub
				
			}
		};
		shape1.paint();
		shape1.calcS();
		
		//implements class of interface
		//dùng n lần -> reuse
		Shape shape2=new Circle();
		shape2.calcS();
		shape2.paint();
		
		//con new con
		System.out.println("\nCon new con");
		Rectangle rectangle=new Rectangle();
		rectangle.paint();
		rectangle.calcS();
		
		//cha new con
		System.out.println("\ncha new con");
		Shape sh1=new Rectangle();
		sh1.paint();
		sh1.calcS();
		
		Shape sh2=new Square();
		sh2.paint();
		sh2.calcS();
	}

}
