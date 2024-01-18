package view.override;

public class Child extends Parent{
	//@Override
	String text ="text02";
	
	//@Override
	String log() {
		return "log02";
	}
	public static void main(String[] args) {
//		Child c = new Child();
//		Parent c = new Parent();
		
		
		// C; lúc compile là KDL Parent
		// C; lúc runtime là KDL Child

		Parent c = new Child();// text01  log02
		System.out.println(" c text " + c.text);
		System.out.println(" c log  " + c.log());

	}
}
