package enum_demo;

import static java.lang.Math.*;
public class DistanceApp {

	/*
	 Xac dinh vi tri cua 1 diem so voi duong tron tam O bán kính R
	 
	 + Ngoài đường tròn
	 + Trong đường tròn
	 + Trên đường tròn 
	 
	 ==> Nếu điểm đó nằm trên đường tròn --> vẽ đường thẳng từ tâm O đến điểm đó
	 
	 
	 */
	
	//Enum - enumeration
	//KDL đối tượng chứa tập hợp các giá trị là hằng số 
	
	
	public static void main(String[] args) {
		
		Point pA = new Point(4,4);
		
		Circle circle = new Circle(new Point(0,0), 5);
		
		double distance = getDistance(pA, circle);
		
		System.out.println("distance: " + distance);
		
		System.out.println("\n=========================\n");
		
		CirclePos position = getPosition(distance, circle);
		
		System.out.println("position:" + position.getValue());
		
		if (position.equals(CirclePos.ONSIDE)) {
			System.out.println("Vẽ đường thẳng từ tâm O đến điểm đó");
		}
		
		System.out.println("\nKết thúc chương trình");
		
	}
	
	private static CirclePos getPosition(double distance, Circle circle) {
		int R = circle.getR();
		if (distance == R) {
			return CirclePos.ONSIDE;
		}
		
		if (distance < R) {
			return CirclePos.INSIDE;
			
		}
		
		return CirclePos.OUTSIDE;
	}
	
	private static double getDistance(Point pA, Circle circle) {
		Point pO = circle.getPO();
		return sqrt(pow(pA.getX() - pO.getX(),2) + pow(pA.getY() - pO.getY(),2));
		
//		return Math.sqrt(2);
	}
}
