package view.function_interface;
@FunctionalInterface
public interface F1Shape {
	void paint(String color);
	// functional interface
	
	//void log();
	default String getColor() {
		return "F1Shape color";
	}
	//nếu tạo ra interface, mục đích nó chỉ có duy nhất 1 hàm trừu tượng
	//để tránh dev khác thêm vào các hàm trừu tượng khác --> làm lối ở chỗ gọi(dùng lambda)
	//sử dụng annotation @FunctionalInterface để đánh dấu đây là Functional Interface
	//ko thể chứa nhiều hơn 1 hàm trừu tượng

}
