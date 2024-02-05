package inheritance.iinterface.fromjava08;

public class Child implements Father, Mother {

	@Override
	// mothe: abstract
	public void playBadminton() {
		// TODO Auto-generated method stub
		
	}

	@Override
	// father: abstract
	public void running() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void coding() {
		System.out.println("Frontend");
	}

}
