package inheritantce.abstractclass;

public class Ex01AbstractClassDemo {
	public static void main(String[] args) {
		EmailService emailService = new EmailService() {
			
			@Override
			void login() {
				System.out.println("Test login");
			}
		};
		emailService.login();
	}
	
}