package view.function_interface;

@FunctionalInterface
public interface F1Shape {
	
	void paint(String color);
	
	// void log();
	
	default String getColor() {
		return "F1Shape color";
	}
	
	// nếu tạo ra interface, mục đích nó chỉ có duy nhất 1 hàm trừu tượng
	// để tránh dev khác thêm vào các hàm trừu tượng khác --> làm lỗi ở chỗ gọi(dùng lambda)
	// sử dụng annotation @FunctionalInterface để đánh dấu đây là functional interface
	// ko thể chứa nhiều hơn 1 hàm trừu tượng
	
	// functional interface
}
