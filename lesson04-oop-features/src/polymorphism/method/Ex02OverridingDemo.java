package polymorphism.method;

public class Ex02OverridingDemo {
	
	public static void main(String[] args) {
		
		
		Ex02OverridingDemo o2 = new Ex02OverridingDemo();
		System.out.println("toString --> " + o2.toString());
		
		System.out.println("\n==================\n");
		
		PolyMethodChild pc = new PolyMethodChild();
		pc.log();
		
		
	// @Override
	public String stringTo() {
		return "-- Custom ToString from Ex02 --";
	}
	
	@Override
	public String toString() {
		return "-- Custom ToString from Ex02 --";
	}
	
	
	
}