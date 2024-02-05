package view;




public class Ex01InterfaceAccessModifier {
	public static void main(String[] args) {
		//no declare access modifier
		//Shape: polymorphism.object     --> class
		//Shape : inheritance>iinterface -->interface
		
		polymorphism.object.Shape polyShape = new polymorphism.object.Shape();
		//polyShape.calcS();
		//polyShape.pain();
		
		System.out.println("----------------");
		
		inheritance.iinterface.Shape intShape = new inheritance.iinterface.Shape() {
			
			@Override
			public void pain() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void calcS() {
				// TODO Auto-generated method stub
				
			}
		};
		intShape.pain();
		intShape.calcS();
			
		}
	
	

}
