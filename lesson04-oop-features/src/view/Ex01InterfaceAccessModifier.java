package view;

import inheritance.iinterface.Shape;

public class Ex01InterfaceAccessModifier {
	
	public static void main(String[] args) {
		
		System.out.println("shape a --> " + Shape.a);
		
		//Shape: polymorphism.object --> class
		//Shape: inheristance.iinterface --> interface
		
		polymorphism.object.Shape polyShape = new polymorphism.object.Shape();
//		polyShape.paint();
//		polyShape.calcS();
		System.out.println("=====================");
		
		inheritance.iinterface.Shape intShape=new inheritance.iinterface.Shape() {
			
			@Override
			public void paint() {
				System.out.println("Circle-->paint");
			}
			
			@Override
			public void calcS() {
				// TODO Auto-generated method stub
				System.out.println("Circle-->calcS");
				
			}
		};
		intShape.paint();
		intShape.calcS();
	}

}
