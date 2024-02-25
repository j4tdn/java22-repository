package polymorphism.object;

public class Ex01PolymorphismObjectDemo {
	public static void main(String[] args) {
		// 1. Khoi tao doi tuong cho chinh kieu du lieu cua no 
		Shape shape = new Shape ();
		
		shape.paint();
		shape.calcS();
		
		Square square = new Square ();
		square.paint();
		square.calcS();
		
		Rectangle rectangle = new Rectangle ();
		rectangle.paint();
		rectangle.calcS();
		
		System.out.println("==============================");
		
		long a = 10;
		a= Integer.MAX_VALUE + 200; 
		a = Integer.MIN_VALUE;
		
		int b = (int)a;
		
		System.out.println("b --> " + b);
		// 2. Khoi tao doi KDL con cho bien KDL cha
		// Cha new Con 
		
		// 1 bien shape luc compile la kieu Shape nhung luc runtime no 
		// co the la/ tro den KDL Shape/Rectangle/Square
		
		//1 bien luc compile la KDL X nhung luc runtime no co the / tro den
		// doi tuong chinh no hoac cac KDL con cua X
		
		// Bien cua x luc compile no se goi cac ham cua KDL cha, luc runtime se goi ham cua KDL con
	
	Shape sh1 = new Square ();
	sh1.paint ();
	sh1.calcS ();
	
	Shape sh2 = new Rectangle ();
	sh2.paint ();
	sh2.calcS ();
	}
	
	// COn new cha
	Square sq1 = (Square) new Shape();
	//sq1.paint();
	//sq1.calcS();
	

}
