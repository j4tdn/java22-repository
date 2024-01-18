package polymorphism.method;

public class Ex02OverridingDemo {

	public static void main(String[] args) {
		
		//Before override --> toString cua class object 
     Ex02OverridingDemo o2 = new Ex02OverridingDemo();
     
     //After override
     System.out.println("ToString -->" + o2.toString());
     
     System.out.println("\n====================\n");
     PolyMethodChild pc = new PolyMethodChild();
     pc.log();
	}

	@Override
	public String toString() {
		return " -- Custom ToString from Ex02 -- ";
	}
	
	//@Override
	public String Stringto() {
		return " -- Custom ToString from Ex02 -- ";
	}
	

}
