package view.override;

public class Child extends Parent{
	String text = "text02";
	String log() {
		return "log 02";
	}
	public static void main(String[] args) {
//		Child c = new Child();
		
		/*
		  
		 c: lúc compile là KDL Parent
		 c: lúc runtime là KDL Child
		 */
		/*
		 được phép override hàm nhưng không được phép override thuộc tính
		 */
		Parent c = new Child();
		
		System.out.println("c text --> " + c.text);
		System.out.println("c log --> " + c.log());
	}
}
