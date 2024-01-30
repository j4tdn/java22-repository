package inheritance.iinterface.multiple;

import inheritance.cclass.multiple.Ancestor;

//ko gọi là đa thừa kế
//class đồng thời implements từ nhiều interface và extends class
public class Child extends Ancestor implements Father, Mother{

	@Override
	public void playBadminton() {
		
	}

	@Override
	public void running() {
			
	}

	@Override
	public void coding() {
				
	}

}
