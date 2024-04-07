package p2_singleton;

public class SDate {
	
	//được khởi tạo lúc load class, chỉ bị clear khi kết thúc chương trình
	private static SDate INSTANCE = null;
	private SDate() {
		
	}
	
	public static SDate getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new SDate();
		}
		return INSTANCE;
	}
}
