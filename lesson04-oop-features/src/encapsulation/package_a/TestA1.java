package encapsulation.package_a;

public class TestA1 {
	
	//TestA1 -> ok
	//TestA2 -> no
	//TestB1 -> no 
	
	
	private static String varTestA1 = "Var Test A1";
	
	public static void main(String[] args) {
		System.out.println("--> " + varTestA1);
	}
	// ko phuj thuoc vao doi tuong dang goi cho static
	//TestA1 -> ok
		//TestA2 -> ok
		//TestB1 -> ok
	public static void methodTestA1Public() {
		System.out.println("Calling Method Test A1 Public");
	}
		//TestA1 -> ok
		//TestA2 -> ok
		//TestB1 -> no 
	protected static void methodTestA1Protected() {
		System.out.println("Calling Method Test A1 Protected");
	}
		//TestA1 -> ok
		//TestA2 -> ok
		//TestB1 -> no 
	static void methodTestA1NoDeclare() {
		System.out.println("Calling Method Test A1 Public");

}
}
