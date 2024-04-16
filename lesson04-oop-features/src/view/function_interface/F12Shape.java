package view.function_interface;

public class F12Shape implements F1Shape {
	
	@Override
	public void paint(String color) {
		System.out.println("f12shape(impl class) --> paint(" + color + ")");
	}
	
}
