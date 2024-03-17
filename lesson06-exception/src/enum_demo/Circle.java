package enum_demo;

public class Circle {
	private Point pO;
	private int r;
	
	public Circle(Point pO, int r) {
		this.pO = pO;
		this.r = r;
	}
	
	public Point getpO() {
		return pO;
	}
	
	public int getR() {
		return r;
	}
	
	@Override
	public String toString() {
		return "O(" ;
	}
}
