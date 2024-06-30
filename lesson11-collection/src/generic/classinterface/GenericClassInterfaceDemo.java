package generic.classinterface;


public class GenericClassInterfaceDemo {
	
	public static void main(String[] args) {
		IList<String> list = new JavaList<>();
		
		list.add("A1");
		list.add("A2");
		list.add("A3");
		list.add("A4");
		list.add("A5");
		
		list.set(2, "A33");
		
//		System.out.println("size --> " + list.size());
//		System.out.println("capacity --> " + list.getCapacity());
		
		//for index
		System.out.print("ForIndex --> ");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		//for each
		System.out.print("\n\nForEach --> ");
		list.forEach(element -> System.out.print("Value " + element + " "));
		
	}
	

}
