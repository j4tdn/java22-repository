package p2_singleton;

public class SDate {
	
	// được khởi tạo lúc load class, chỉ bị clear khi kết thúc chương trình
	// INSTNACE là biến chứa đối tượng duy nhất sẽ được tạo ra trong class SDate
	private static SDate INSTNACE = null;
	
	private SDate() {
		
	}
	
	public static SDate getInstance(){
		if(INSTNACE == null) {
			INSTNACE = new SDate();
		}
		return INSTNACE;
	}
}
