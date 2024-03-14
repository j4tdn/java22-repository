package exception;


	/*
	 * Khi tạo ra 1 exception cần biết
	 * + runtime | compile
	 * + contructor với message truyền vào
	 * + contructor với message mặc định của exception
	 */
public class InvalidAgeException extends Exception{

	//Hướng dẫn khi học bài xử lí file
	private static final long serialVersionUID = -8639637553249410321L;
	
	public InvalidAgeException() {
		super("Age is not valid");
	}
	
	public InvalidAgeException(String message) {
		super(message);
	}
	
}
