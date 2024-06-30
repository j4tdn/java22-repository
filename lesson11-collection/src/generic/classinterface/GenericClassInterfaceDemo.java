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
		
		System.out.print("ForIndex --> ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		System.out.print("\n\nForEach --> ");
		
		// for each
		list.forEach(element -> System.out.print("Value " + element + " "));
		
	}
	
}