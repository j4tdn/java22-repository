package inheritance.iinterface.fromjava08;

public interface Mother {
	void playBadminton();
	default void cooking() {
		System.out.println("Mother --> cooking good");
	}
	default void coding() {
		System.out.println("Father --> default coding database");
	}
}
