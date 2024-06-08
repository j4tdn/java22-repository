package generic.classinterface;

public class GenericClassInterfaceDemo {
	
	public static void main(String[] args) {
		
		IList<String> list = new JavaList<>();
		
		list.add("A1");
		list.add("A2");
		list.add("A3");
		list.add("A4");
		list.add("A5");
		
		System.out.println("size --> " + list.size());
		System.out.println("capacity --> " + list.getCapacity());
		
	}
	
}
