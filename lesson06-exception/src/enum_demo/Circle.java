package enum_demo;


public class Circle {
	private Point pO;
	private int r;
	public Circle() {
	}
	public Circle(Point pO, int r) {
		super();
		this.pO = pO;
		this.r = r;
	}
	public Point getpO() {
		return pO;
	}
	public void setpO(Point pO) {
		this.pO = pO;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	@Override
	public String toString() {
		return "O (" + pO.getX() + "," + pO.getY() + ") , R = "+ r;
	}
	
}
