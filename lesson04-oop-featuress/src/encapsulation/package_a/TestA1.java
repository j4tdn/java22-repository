package encapsulation.package_a;

public class TestA1 {
	
	
		private static String varTestA1 = "Var Test A1";
		
		protected static String varTestA1Protected = "Var Test A1 Protected";
		
		static String varTestA1NoDeclare = "Var Test A1 No Declare";
		
		public static void main(String[] args) {
			System.out.println("--> " + varTestA1);
		}
		
		public static void methodTestA1Public() {
			System.out.println("Calling Method Test A1 Public");
		}
	
		protected static void methodTestA1Protected() {
			System.out.println("Calling Method Test A1 Protected");
		}
		
		static void methodTestA1NoDeclare() {
			System.out.println("Calling Method Test A1 No Declare");
		}
		

}
