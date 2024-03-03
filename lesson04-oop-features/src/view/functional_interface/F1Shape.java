package view.functional_interface;

@FunctionalInterface
public interface F1Shape {
	void paint(String color);
	// nếu tạo ra interface, mục đích nó chỉ có duy nhất 1 hàm trừu tượng 
	// để tránh dev khác thêm vào caccs hàm trừu tượng khác --> làm lỗi ở chỗ gọi (dùng lambda)
	// sử dụng anonymuos @@FunctionalInterfaceđể đánh dấu đây là 1 @FunctionalInterface
	//=> không chứa thêm 1 hàm trừu tượng
}
