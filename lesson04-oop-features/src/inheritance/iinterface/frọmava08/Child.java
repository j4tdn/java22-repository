package inheritance.iinterface.frọmava08;

public class Child implements Father, Mother{

	@Override
	public void playBadminton() {
		
	}

	@Override
	public void running() {
		
	}

	@Override
	public void coding() {
		Father.super.coding();
		Mother.super.coding();
	}

}
