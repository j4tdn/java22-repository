package view.function_interface;

@FunctionalInterface
public interface F1Shape {

	
	void paint(String color);
	//functional interface
	
	default String getColor() {
		return "F1Shape color";
	}
}
