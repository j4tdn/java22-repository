package view.override;

public class Child extends Parent {
	
	String text = "text 02";
	//@override
	String log () {
		return "log 02"; 
	}

	public static void main(String[] args) {
		
		// Child c = new Child (); // text 02 log 02
		// Parent c = new Parent (); // text 01 log 01
		// c: luc compile la KDL parent
		// c: luc runtime la KDL Child
		Parent c = null ;
		//Child c = new Child ();
		Parent c = new Child ();
		System.out.println(" c text --> " + c.text);
		System.out.println(" c log --> " + c.log());
	}

}
