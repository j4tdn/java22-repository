package enum_demo;

public class Circle {
	
	private Point p0;
	private int r;
	
	public Circle(Point p0, int r) {
		this.p0=p0;
		this.r=r;
	}

	public Point getP0() {
		return p0;
	}
	public int getR() {
		return r;
	}
	@Override
	public String toString() {
		return "O(" + p0.getX() + "," + p0.getY() + ") & R" +getR();
	}
}
