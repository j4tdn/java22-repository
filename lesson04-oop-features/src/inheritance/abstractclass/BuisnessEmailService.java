package inheritance.abstractclass;

public class BuisnessEmailService extends EmailService {
	
	@Override
	void login() {
		System.out.println("BusinessEmailService -->login ...");
		
	}
	@Override
	void loginWith2Steps() {
		System.out.println("loginWith2Steps -->loginWith2Steps ...");
		
	}

}
