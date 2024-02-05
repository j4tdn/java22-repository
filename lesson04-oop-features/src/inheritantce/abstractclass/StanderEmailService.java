package inheritantce.abstractclass;

public class StanderEmailService extends EmailService {
	@Override
	void login() {
		System.out.println("StanderEmailService --> login...");
	}
	
}