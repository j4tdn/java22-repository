package inheritance.iinterface;

public class Ex01InheritanceInterfaceDemo {
	public static void main(String[] args) {
		
		 System.out.println("Shape a --> " + Shape.a);
		
		//Cha con--> clas --> new ok
		
		//cha : interface
		//con:class
		
		
		//interface new interface(class ẩn danh)
		// anonymous class of interface
		// dùng 1 lần
		Shape shape1 =  new Shape() {

			@Override
			public void pain() {
				System.out.println(" Circle--> paint");
			}

			@Override
			public void calcS() {
				System.out.println("Cỉcle--> calcS ");
				
			}
			
		};
		shape1.calcS();
		shape1.pain();
		
		
		
		//implemention class of interfcae
		//dùng n lần -> reuse
		Shape shape2 = new Circle();
		shape2.calcS();
		shape2.pain();
		
		
		//con new con
		System.out.println("\n Con new Con");
		Rectangle rectangle = new Rectangle();
		rectangle.pain();
		rectangle.calcS();
		
		//cha new con
		System.out.println("\n Cha new Con");
		Shape sh1 = new Square();
	    sh1.pain();
	    sh1.calcS();
	    
	    Shape sh2 = new Square();
	    sh2.pain();
	    sh2.calcS();
			
				
			
		
	}

}
