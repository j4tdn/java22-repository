package exception;

/**
 * Khi tạo ra 1 exception cần biết
 * + runtime | compile
 * + constructor với message truyền vào
 * + constructor với message mặc định của exception 
 */

public class InvalidAgeException extends Exception {
	
	// Hướng dẫn khi học bài xử lý file
	private static final long serialVersionUID = -8639637553249410321L;
	
	public InvalidAgeException() {
		super("-- Age is not valid --");
	}
	
	public InvalidAgeException(String message) {
		super(message);
	}

}