package encapsulation.packege_a;

public class TestA1 {
	
    //Test A1 -> ok
	//Test A2 -> no
	//Test B1 -> no
	private static String varTestA1 = "Var Test A1";
	
	protected static String varTestA1Protected = "Var Test A1 Protected";
	
	static String varTestA1NoDeclare = "Var Test A1 No Declare";
	
	public static void main(String[] args) {
			System.out.println("--> " + varTestA1);
		}
	//Test A1 -> ok
	//Test A2 -> ok
	//Test B1 -> ok
	public static void methodTestA1() {
			System.out.println("Calling Method Test A1 Public");
		}
	//Test A1 -> ok
	//Test A2 -> ok
	//Test B1 -> no
	public static void methodTestA1Protected() {
			System.out.println("Calling Method Test A1 Public Protected");
		}
	//Test A1 -> ok
	//Test A2 -> ok
	//Test B1 -> no
	public static void methodTestA1NoDeclare() {
			System.out.println("Calling Method Test A1 Public No Declare");
		}

}