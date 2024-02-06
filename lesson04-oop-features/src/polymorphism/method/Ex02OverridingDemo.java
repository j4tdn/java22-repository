package polymorphism.method;
// Tat ca moi class trong Java mac dinh deu ke thua tu class Object
public class Ex02OverridingDemo {
	public static void main(String[] args) {
		
		// Khi in ra 1 bien KDL doi tuong
		// Mac dinh lay bien do goi ham toString cua class do hoac class Object
		
		// before override --> polymorphism.method.Ex02OverridingDemo@515f550a
		// goi toString cua class cha Object
		
		// after override --> --Custom ToString from Ex02
		Ex02OverridingDemo o2 = new Ex02OverridingDemo ();
		System.out.println("toString --> " + o2.toString());
		
		System.out.println("\n==========\n");
		
		PolyMethodChild pc = new PolyMethodChild ();
		pc.log();
		
		//1. Co the override thuoc tinh duoc ko
		
		//2. Co the overide ham static duoc ko
		
		// --> cho vi du
	}
	
	//Shape: calS
	//Rectangle, Triangle, Square extends Shape 
	// --> override calS
	
	//Shape: calS
	//Rectangle, Triangle, Square extends Shape 
	//Rectangle --> tinhDienTichHinhChuNhat
	// Triangle --> calSTriangle
	// Square --> tinhS
	//@Override
	public String stringTo() {
		
		return "--Custom ToString from Ex02 --";
	}
	
	@Override
	public String toString() {
		
		return "--Custom ToString from Ex02 --";
	}
	
}
