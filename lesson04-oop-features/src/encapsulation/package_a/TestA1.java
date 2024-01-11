package encapsulation.package_a;

public class TestA1 {
	
	//TestA1 ->ok
	//TestA2 ->no
	//TestB1 ->no
	private static String varTestA1 = "Var Test A1";
	
	protected static String varTestA1Protected = "Var Test A1 Protected";
	
	static String varTestA1NoDeclare = "Var Test A1 NoDeclare";
	
	public static void main(String[] args) {
		
	}
	
	//TestA1 ->ok
	//TestA2 ->ok
	//TestB1 ->ok
	public static void methodTestA1() {
		System.out.println("Calling Method Test A1");
	}
	
	//TestA1 ->ok
	//TestA2 ->ok
	//TestB1 ->no
	protected static void methodTestA1Protected() {
		System.out.println("Calling Method Test A1 Protected");
	}
	
	//TestA1 ->ok
	//TestA2 ->ok
	//TestB1 ->no
	static void methodTestA1NoDeclare() {
		System.out.println("Calling Method Test A1 No Declare");
	}
}
