package exception;

public class InvalidPasswordException extends Exception{

	private static final long serialVersionUID = -2486940237164512267L;

	public InvalidPasswordException() {
		super("Mật khẩu không hợp lệ!");
	}
	
	public InvalidPasswordException(String message){
		super(message);
	}
}
