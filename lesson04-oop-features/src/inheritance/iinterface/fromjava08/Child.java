package inheritance.iinterface.fromjava08;

public class Child implements Father, Mother{

	@Override
	public void playBadminton() {
		
	}

	@Override
	public void running() {
		
	}

	@Override
	public void coding() {
		// TODO Auto-generated method stub
		Father.super.coding();
		Mother.super.coding();
	}
	
}
