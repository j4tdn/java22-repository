package ex04;

public class InvalidInputException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7550974013038803915L;

	public InvalidInputException(String input) {
		super(input);
	}
}
