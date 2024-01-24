package view.override;

public class Child extends Parent {

	String text = "text 02";

	@Override
	String log() {
		return "log 02";
	}

	public static void main(String[] args) {

//		Child c = new Child(); // tex02 log02 
		
//		Parent c = new Parent(); // text02 log01
		

//		c: luc complie la KDL Parent
//		c: luc compile la KDL Child
		
		Parent c = new Child();  //text01 log02

		System.out.println("c text --> " + c.text); //text01
		System.out.println("c log -->" + c.log());  //log 01
	}
}
