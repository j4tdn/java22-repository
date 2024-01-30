package inheritance.iinterface.frọmava08;

public interface Father {
	void running();
	default void coding() {
		System.out.println("Father --> coding backend");
		drinkBeer();
	}
	static void playGame() {
		System.out.println("Father --> play game");
	}
	private void drinkBeer() {
		System.out.println("Father --> drink beer");
	}
	
    /* JDK 1.7
     interfave: Collection: add, remove, get, set...
     new features: removeIf, addIfAbsent, forEach
     body, thực thi lại giống nhau trong List, Set, Stack
     Class: List, Set, Stack, Queue, 100 classes implêmnts Collection
     
     */

}
