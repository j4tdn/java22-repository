package inheritance.iinterface.fromjava08;

public interface Father {

	void running();
	
	default void coding() {
		System.out.println("Father --> coding backend");
	}
	
	static void playGame() {
		System.out.println("Father --> play game");
		
	}
	
	private void drinkBeer() {
		System.out.println("Father --> drink beer");
	}
	
	//JDK 1.7 
	
	//interface: Collection: add, remove, get, set ...
	
	//class: List, Set, 
	
	
}
