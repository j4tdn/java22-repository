package view.override;

public class Child extends Parent {
	String text = "text 02"; // Ko dc phép override thuộc tính 

	String log() {
		return "log 02";
	}

	public static void main(String[] args) {
		Child c = new Child();
		
		Parent p = new Parent();
		
		
		// pc :  lúc compile là KDL Parent 
		// pc :  lúc runtime là KDL Child 
		Parent pc = new Child();
		
		
		
		
		System.out.println("c text --> " + c.text);
		System.out.println("c log --> " + c.log());
		
		System.out.println("\n==================\n");
		
		System.out.println("c text --> " + p.text);
		System.out.println("c log --> " + p.log());
		
		System.out.println("\n==================\n");
		
		System.out.println("c text --> " + pc.text);
		System.out.println("c log --> " + pc.log());

	}

}
