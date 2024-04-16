package inheritance.iinterface;

public class Square implements Shape{

	@Override
	public void paint() {
		System.out.println("Square --> paint");
	}

	@Override
	public void calcS() {
		System.out.println("Square --> calcS");
	}

}
