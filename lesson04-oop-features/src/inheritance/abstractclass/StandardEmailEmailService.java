package inheritance.abstractclass;

public class StandardEmailEmailService extends EmailService {

	@Override
	void login() {
		System.out.println("StandardEmailService --> login... ");
		
	}

}
