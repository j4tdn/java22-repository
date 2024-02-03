package inheritance.iinterface.fromjava08;

public class Child implements Father, Mother{

	@Override
	// Mother: abstract
	public void playBadminton() {
		// TODO Auto-generated method stub
		
	}

	@Override
	// Father: abstract
	public void running() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void coding() {
		System.out.println("Frontend");
	}
	
	// functional interface
	
	// lambda expression
	
	// strategy pattern

}
