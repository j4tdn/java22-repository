package validation_trycatch_throwthows_finally;
	/*
	 * khi tạo ra 1 exception cần biết 
	 * + runtime|compile
	 * + contructor với message truyền vào 
	 * + contructor với message mặc định của exception
	 */
public class InvalidAgeException  extends Exception{

	// hướng dẫn khi học bài xử lí file 
	
	
	private static final long serialVersionUID = 4786598065512232344L;

	public InvalidAgeException() {
		super("Age is not valid");
	}
	public InvalidAgeException(String mes) {
		super(mes);
	}
}
