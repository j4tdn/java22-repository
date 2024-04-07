package p2_singleton;

public class SDate {

	// được khởi tạo lúc load class, chỉ bị clear khi kết thúc chương trình
		// INSTANCE là biến chứa đối tượng duy nhất sẽ được tạo ra trong class SDate
	
	//Trong 1 class, chỉ khởi tạo 1 đối tượng thông qua hàm getInstance
		private static SDate INSTANCE = null;

		private SDate() {
		}

		public static SDate getInstance() {
			if (INSTANCE == null) {
				INSTANCE = new SDate();
			}
			return INSTANCE;
		}
}
