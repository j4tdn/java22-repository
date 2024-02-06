package inheritance.iinterface.fromjava08;

public interface Father {
	
	void running();
	
	default void coding() {
		System.out.println("Father --> coding backend");
		drinkBeer();
	}
	
	static void playgame() {
		System.out.println("Father --> play game");
	}
	
	private void drinkBeer() {
		System.out.println("Father --> drink beer");
	}
}
