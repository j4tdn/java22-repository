package view;

import inheritance.iinterface.Shape;

public class Ex01InterfaceAccessModifier {

	public static void main(String[] args) {
		// Shape : polymorphism.object --> class
		//shape: inheritance.iinterface --> interface
		
		polymorphism.object.Shape polyShape = new polymorphism.object.Shape();
		//polyShape.calcS();
		//polyShape.paint();
		
		System.out.println("====================");
		
		inheritance.iinterface.Shape intShape = new inheritance.iinterface.Shape() {
			
			@Override
			public void paint() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void calcS() {
				// TODO Auto-generated method stub
				
			}
		};
		intShape.paint();
		intShape.calcS();
		}
	}

