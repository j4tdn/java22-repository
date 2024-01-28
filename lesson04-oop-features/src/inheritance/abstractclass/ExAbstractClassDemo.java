package inheritance.abstractclass;

public class ExAbstractClassDemo {

		public static void main(String[] args) {
			//anonymous class
			EmailService emailService = new EmailService() {
				
				@Override
				void login() {
					System.out.println("Test login");
					
				}
			};
			emailService.login();
		}
}
