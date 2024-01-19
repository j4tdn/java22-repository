package view.override;

public class Child extends Parent {
    String text = "text 02";
	
	String log() {
		return "log 02";
	}
	public static void main(String[] args) {
		// Child c = new Child(); // text 02 log 02
		//Parent c = new Parent(); // text 01 log 01
		
		// c: lúc compile là KDL Parent
		// c: lúc runtime là KDL CHild
		
		Parent c = new Child();// text 01 log 02
		System.out.println("c text --> " + c.text);
		System.out.println("c log --> " + c.log());
	}

}
