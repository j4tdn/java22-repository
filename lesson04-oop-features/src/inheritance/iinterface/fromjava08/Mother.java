package inheritance.iinterface.fromjava08;

public interface Mother {
	
	void playBadminton();
	
	default void coding() {
		System.out.println("Father --> coding backend");
	}
	
	default void cooking() {
		System.out.println("Mother --> cooking good");
	}
}
