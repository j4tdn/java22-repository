package view.override;

public class Child extends Parent {
	
		String text = "text 02";
		
		String log() {
			return "log 02";
		}
		
		public static void main(String[] args) {
			
		// Child c = new Child();
		// Parent c = new Parent();
		
		// c: lúc compile là KDL Parent
		Parent c = new Child();
		
		System.out.println("c text --> " + c.text); // text 02
		System.out.println("c log --> " + c.log()); // log 02
	}

}
