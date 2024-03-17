package exception;

public class InvalidAgeException extends Exception{

	private static final long serialVersionUID = -8639637553249410321L;

	public InvalidAgeException() {
		super("-- Age is not valid --");
	}
	
	public InvalidAgeException(String message) {
		super(message);
	}
}
