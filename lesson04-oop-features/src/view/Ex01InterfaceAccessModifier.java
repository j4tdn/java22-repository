package view;

public class Ex01InterfaceAccessModifier {
	public static void main(String[] args) {
		//shape: polimorphims --> class
		//shape: inheritance --> interface
		
		polymorphism.object.Shape polyShape = new polymorphism.object.Shape();
		//polyShape.paint();
		//polyShape.calcS();
		
		System.out.println("==================");
		
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
