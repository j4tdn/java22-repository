package inheritance.iinterface.fromjava08;

public interface Mother {
	
	void palyBadminton();
	
	default void coding() {
		System.out.println("Mother --> coding database");
	}
	
	default void cooking() {
		System.out.println("Mother --> cooking good");
	}

}
