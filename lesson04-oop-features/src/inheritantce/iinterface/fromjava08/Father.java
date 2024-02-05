package inheritantce.iinterface.fromjava08;

public interface Father {
	void running();
	
	//java08
	default void coding() {
		System.out.println("Father --> default coding backend");
	}
	//java08
	static void playGame() {
		System.out.println("Father --> static playGame");
	}
	//java09
	private void drinkBeer() {
		System.out.println("Father --> private drinkBeer");
	}
}