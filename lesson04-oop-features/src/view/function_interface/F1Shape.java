package view.function_interface;

@FunctionalInterface
public interface F1Shape {
	void paint(String color);
	//Sử dụng annotation @FunctionInterface để đánh dấu đây là
	//function interface
	//void get();
	default String getColor() {
		return "F1Shape color" ;
	}
}
