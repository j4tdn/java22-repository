package view.override;

public class Child extends Parent {
//	@Override // --> thuộc tín không được phép Override
	String text = "text 02";  

	@Override
	String log() {
		return "log 02";
	}

	public static void main(String[] args) {
//		Child c = new Child();

//		Parent c = new Parent();
		
		
		// c lúc Compile(khi gõ code): là kdl Parent
		// c lúc Runtime(khi chạy code): là thuộc KDL Child
		Parent c = new Child();
		
		System.out.println("c text --> " + c.text); 
		System.out.println("c log --> " + c.log());
		
		
	}
}
