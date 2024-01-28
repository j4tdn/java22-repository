package inheritance.abstractclass;

public class BussinesEmailService extends EmailService{
	@Override
	void login() {
		System.out.println("BussinesEmailService --> login...");
		
	}
	@Override
	void login2Steps() {
		System.out.println("BussinesEmailService --> login2Steps...");
		
	}
}
