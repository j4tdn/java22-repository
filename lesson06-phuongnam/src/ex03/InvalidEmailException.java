package ex03;

public class InvalidEmailException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6992914309499606668L;

	public InvalidEmailException(String email) {
		super(email);
	}
	
}
