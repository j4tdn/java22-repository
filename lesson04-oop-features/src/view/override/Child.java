package view.override;

public class Child extends Parent {
	

	String text = "text 02";
	
	//@Override
	String log() {
		return "log 02";
	}

	
	public static void main(String[] args) {
		//Child c = new Child();		
		//Parent c = new Parent();		
		// KDL tenBien = value;
		
		// c: luc compile la KDL Parent
		// c: luc runtime laf KDL Child 
		
		Parent c = new Child();
		
		// chi dc override ham, ko override thuoc tinh
		System.out.println("c text --> " +c.text);// cha
		System.out.println("c log --> " +c.log());// override lai : log 02
	}

}
