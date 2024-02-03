package view;

import polymorphism.object.Shape;

public class Ex01InterfaceAccessModifier {
	
	public static void main(String[] args) {
		// no declare access modifier
		// Shape: polymorphism.object	 --> class
		// Shape: inheritance.iinterface --> interface
		
		Shape polyShape = new Shape();
		//polyShape.paint();
		//polyShape.calcS();
		
		System.out.println("===========");
	}
	
}
