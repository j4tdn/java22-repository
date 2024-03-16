package enum_demo;
import static java.lang.Math.*;
public class DistanceApp {
	/*
	 Xác định vị trí của 1 điểm so với đường tròn tâm O bán kính R 
	 + ngoài đg tròn
	 + trong đg tròn
	 + trên dg tròn
	 */
	
	// Enum - Enumeration
	// KDL đối tượng 
	public static void main(String[] args) {
		Point pA = new Point(4,3);
		Point pO = new Point(0,0); 
		Circle circle = new Circle(pO, 5);
		
		double distance = getDistanceApp(pA, circle);
		CirclePos position = getPosition(distance, circle);
		System.out.println("position :" + position.getValue());
		if(position.equals(CirclePos.ONSIDE)) {
			System.out.println("vẽ đường thẳng từ O đến điểm đó");
		}
	}
	
	private static CirclePos getPosition(double dis, Circle c) {
		int R = c.getR();
		if(R==dis) return CirclePos.ONSIDE;
		else if(R<=dis) return CirclePos.INSIDE;
		else return CirclePos.OUTSIDE;
		
	}
	
	public static double getDistanceApp(Point a,Circle circle) {
		Point pO = circle.getpO();
		
		return sqrt(pow(a.getX() - pO.getX(), 2) + pow(a.getY() - pO.getY(), 2)) ;
	}
}
