package polymorphism.object;

public class Square extends Shape {
	@Override
	void paint() {
		System.out.println("Square --> paint ...");
	}
	
	@Override
	void calcS() {
		System.out.println("Square --> calS ...");
	}
	
	void setBackground() {
		System.out.println("Square --> setBackground");
	}
}
