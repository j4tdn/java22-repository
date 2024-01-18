package view.override;

public class Child extends Parent{
	
	// @Override
	String text = "text 02";
	
	// @Override
	String log() {
		return "log 02";
	}
	
	public static void main(String[] args) {
		
		// Child c = new Child(); // text 02 log 02
		// Parent c = new Parent(); // text 01 log 01
		
		// c: lúc compile là KDL Parent
		// c: lúc runtime là KDL Child
		
		Parent c = new Child(); // text 01 log 02
		
		System.out.println("c text --> " + c.text);  // text 01 
		System.out.println("c log  --> " + c.log()); // log 01
		
	}
	
}
