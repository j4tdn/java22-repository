package inheritance.iinterface;

public class Circle implements Shape {
	
	@Override
	public void paint() {
		System.out.println("Circle --> paint");
		
	}
	
	@Override
	public void calcS() {
		System.out.println("Circle --> calcS");
		
	}
}
