package vieww;

public class Ex01InterfaceAccessModifier {
	
	public static void main(String[] args) {
		// no declare access modifier
		// Shape: polymorphism.object    --> class
		// Shape: inheritance.iinterface --> interface
		
		polymorphism.object.Shape polyShape = new polymorphism.object.Shape();
		// polyShape.paint();
		// polyShape.calcS();
		
		System.out.println("=================");
		
		inheritance.iinterface.Shape intShape = new inheritance.iinterface.Shape() {
			
			@Override
			public void paint() {
			}
			
			@Override
			public void calcS() {
			}
		};
		intShape.paint();
		intShape.calcS();
		
	}
	
}