package inheritance.iinterface.fromjava08;

public interface Father {
	
	void running();
	
	default void coding() {
		System.out.println("Father --> coding backend");
		drinkBeer();
	}

	static void playGame() {
		System.out.println("Father-->play game");
	}
	
	private void drinkBeer() {
		System.out.println("Father--> drink beer");
	}
	
	//JDK 1.7
	
	//interface: Collection:add,remove,get,set...
	
	//new feature: removeIf, addIfAbsent, foreach...
	//body, thực thi lại giống nhau trong List,Set,Stack,Queue
	
	//class: List,Set,Stack,Queue
}
