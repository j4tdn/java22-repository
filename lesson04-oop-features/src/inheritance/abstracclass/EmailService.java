package inheritance.abstracclass;

public abstract class EmailService {
	
	abstract void login();
	
	void loginWith2Steps() {
		System.out.println("EmailService --> loginWith2Steps ...");
	}
	
}