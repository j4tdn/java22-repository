package view.functional_interface;

// @FunctionalInterface
public interface F1Shape {
	
	//nếu tạo ra interface mục đích chỉ có duy nhất 1 hàm trừu tượng
	//để tránh dev khác thêm vào hàm trừu tượng khác làm lỗi ở chỗ gọi dùng lambda
	// sử dụng annotation @FunctionalInterface để đánh dấu đây là function interface
	
	//functional interface
	void paint(String color);
	
	default String getColor() {
		return "F1Shape color";
		
	}

}
