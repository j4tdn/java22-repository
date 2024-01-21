package view.override;

public class Child extends Parent {

	String text = "text 02";
	
	@Override
	String log() {
		return "log 02";
	}
	
	public static void main(String[] args) {
		
//		Child c = new Child();
//		Parent c = new Parent();
		
		//c : lúc compile là kdl Parent
		//c: lúc runtime là kdl Child
		
		Parent c = new Child(); //test 01 log 02
		
		
		System.out.println("c test -->" + c.text);
		System.out.println("c log -->" + c.log());
	}
}
