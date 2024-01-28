package inheritance.iinterface;

public class Circle implements Shape {
	@Override
	public void paint() {
		System.out.println("circle --> paint");
	}
	
	@Override
	public void calcS() {
		System.out.println("circle --> calcS");
	}
}
