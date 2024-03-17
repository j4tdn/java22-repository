package view;


public class Ex01InterfaceAccessModifier {
	public static void main(String[] args) {
		polymorphism.object.Shape polyShape = new polymorphism.object.Shape();
		
		
		System.out.println("================");
		inheritance.iinterface.Shape intShape = new inheritance.iinterface.Shape() {
			@Override
			public void paint() {
				System.out.println("");
			}
			@Override
			public void calcS() {
				System.out.println("");
			}
		};
		intShape.paint();
		intShape.calcS();
	}
}
