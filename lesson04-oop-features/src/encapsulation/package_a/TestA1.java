package encapsulation.package_a;

public class TestA1 {
	private static String varTestA1 = "var test a1";
	protected static String varTestA1Protected = " test A1 protetcted";
	static String varTestA1NonDeclare = "test a1 non declare";
	
	public static void main(String[] args) {
		
	}
	
	public static void methodTestA1() {
		System.out.println(" calling method test a1");
	}
	
	protected static  void methodTestA1protected() {
		System.out.println(" calling method test a1");
	}
	static void  methodTestA1NoDeclare() {
		System.out.println(" calling method test a1");
	}
}
