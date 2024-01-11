package encapsulation.package_a;

public class TestA1 {
    private static String varTestA1= "Var Test A1";
    protected static String varTestA1protected = "varTestA1protected";
    static String varTestA1NoDeclared = "varTestA1NoDeclared";
    public static void main(String[] args) {
		System.out.println("--> " + varTestA1);
	}
    /*
     TestA1-> ok
     TestA2-> ok
     TestA3-> ok
     */
    public static void methodTestA1Public() {
    	System.out.println("Calling Method Test A1");
    }
    /*
     *TestA1-> ok
     *TestA2-> ok
     *TestA3-> no
     */
    protected static void methodTestA1Protected() {
    	System.out.println("Calling Method Test A1");
    }
    /*
     TestA1-> ok
     TestA2-> ok
     TestA3-> no
     */
    static void methodTestA1NonDeclared() {
    	System.out.println("Calling Method Test A1");
    }
}
