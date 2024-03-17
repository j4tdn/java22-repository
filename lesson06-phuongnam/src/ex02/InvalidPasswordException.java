package ex02;

public class InvalidPasswordException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6498053798176211819L;

	public InvalidPasswordException(String password) {
		super(password);
	}
}
