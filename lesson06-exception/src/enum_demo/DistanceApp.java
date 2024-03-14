package enum_demo;

import static java.lang.Math.*;

public class DistanceApp {
	/*
	 * Xác định vị trí của một điểm so với đường tròn tâm O
	 * 
	 * 	+Ngoài đường tròn
	 * 	+Trong đường tròn
	 * 	+Trên đường tròn
	 * 
	 *  ==> nếu điểm đó nằm trên đường tròn --> vẽ đường thẳng từ tâm O đến điểm đó
	 */
	
	//enum - Enumation
	// 
	
	public static void main(String[] args) {
		
		
		Point pointA = new Point(4,4);
		Point pO = new Point(0,0);
		
		Circle circle = new Circle(pO,5);
		
		double distance =getDistance(pointA, circle);
		System.out.println("=========================");
		CirclePos position = getPosition(distance, circle);
		System.out.println("position " + position.getValue());
		
	}
	
	private static double getDistance(Point pA, Circle circle) {
		Point pO = circle.getPO();
		return sqrt(pow((pA.getX() - pO.getX()),2) + pow((pA.getY() - pO.getY()),2) );
	}
	
	private static CirclePos getPosition(double distance, Circle circle) {
		int R = circle.getR();
		
		if(distance == R) {
			return CirclePos.ONSIDE;
		}
		if(distance >= R) {
			return CirclePos.OUTSIDE;
		}
		return CirclePos.INSIDE;
		
	}
}
