package inheritance.iinterface;

public class Square implements Shape{

	@Override
	public void pain() {
		System.out.println("square --> pain");
		
	}

	@Override
	public void calcS() {
		System.out.println("Square --> calcS");
	}

}
