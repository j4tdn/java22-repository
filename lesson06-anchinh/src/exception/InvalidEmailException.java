package exception;

public class InvalidEmailException extends Exception{

	private static final long serialVersionUID = 8692442393967564016L;

	public InvalidEmailException() {
		super("Email không hợp lệ, hãy nhập lại!");
	}
	
	public InvalidEmailException(String message) {
		super(message);
	}
}
