package polymorphism.object;

public class Rectangle extends Shape{
	@Override
	void paint() {
		System.out.println("Square--> paint");

	}
	@Override
	void calcS() {
		System.out.println("calcS--> paint");

	}
}
