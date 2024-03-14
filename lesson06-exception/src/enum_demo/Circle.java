package enum_demo;

public class Circle {

	private Point pO;
	private int r;

	public Circle(Point pO, int r) {
		this.pO = pO;
		this.r = r;
	}

	public Point getPO() {
		return pO;
	}

	public int getR() {
		return r;
	}

	@Override
	public String toString() {
		return "O(" + pO.getX() + "," + pO.getY() + "," + ") & R = " + getR();
	}

}
