package polymorphism.method;

public class PolyMethodChild extends PolyMethodParent{
  
	
	@Override
	void log() {
		System.out.println("CHild---> LOG 2...");
	}
	
	// 1. co the override thuoc tinh(static/non-static) duoc khong
	// 2. co the override ham static duoc khong
	//--> cho vi du
}
