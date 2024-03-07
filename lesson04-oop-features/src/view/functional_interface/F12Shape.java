package view.functional_interface;

public class F12Shape implements F1Shape {

	@Override
	public void paint(String color) {

		System.out.println("f12Shape(impl class) --> paint(" + color + ")");

	}
}
