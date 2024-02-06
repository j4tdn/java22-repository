package view.override;

public class Child extends Parent {
	
	//@Override 
	String text = "text 02";
	
	
	//@Override
	String log() {
		return "log 02";
	}

	public static void main(String[] args) {
		
		//Child c = new Child();text 02 log 02
		
		//Parent c = new Parent();text 01 log 01
		
		//c: luc compile la kdl parent
		//c: luc runtime la kdl child
		
		Parent c = new Child();
		
		//duoc phep override ham, k dc phep overide thuoc tinh.
		
		System.out.println("c text --> " + c.text);
		System.out.println("c log --> " + c.log());
	}
}
