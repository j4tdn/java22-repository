package enum_demo;

import static java.lang.Math.*;

public class DistanceApp {
	/*
	 Xác định vị trí của 1 điểm so với đường tròn tâm O bán kính R
	 
	 + Ngoài đường tròn
	 + Trong đường tròn
	 + Trên đường tròn
	 
	 => Nếu điểm đó nằm trên đường tròn --> vẽ đường thẳng từ tâm O đến điểm đó
	 */
	
	//Enum
	//KDL đối tượng chứa tập hợp các giá trị là hằng số
	
	public static void main(String[] args) {
		Point pA = new Point(3,  4);
		
		Circle circle=new Circle(new Point(0, 0),5);
		
		double distance = getDistance(pA, circle);
		System.out.println("distance: " + distance);
		
		System.out.println("==========================");
		
		CirclePos position = getPosition(distance, circle);
		System.out.println(position.getValue());
		if(position.equals(CirclePos.ONSIDE)) {
			System.out.println("Vẽ đường thẳng từ tâm O đến điểm đó");
		}
		System.out.println("\n Kết Thúc CT");
	}
	private static CirclePos getPosition(double distance, Circle circle) {
		int R = circle.getR();
		
		if(distance == R) {
			return CirclePos.ONSIDE;
		}
		if(distance < R) {
			return CirclePos.INSIDE;
		}
		return CirclePos.OUTSIDE;
	}
	
	private static double getDistance(Point pA, Circle circle) {
		
		Point p0 = circle.getP0();
		
		return sqrt(pow(pA.getX() - p0.getX(), 2) + pow(pA.getY() - p0.getY(), 2));
	}

}
