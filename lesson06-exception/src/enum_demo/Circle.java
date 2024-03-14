package enum_demo;

public class Circle {
	private Point pO;
	private int r;
	
	public Circle(Point pO, int r) {
		this.pO =pO;
		this.r = r;
	}

	public int getR() {
		return r;
	}

	public Point getPO() {
		return pO;
	}

	@Override
	public String toString() {
		return "Circle [pO=" + pO + ", r=" + r + "]";
	}
	
	
}
