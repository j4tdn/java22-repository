package enum_demo;

import static java.lang.Math.*;
//enumeration
public class DistanceApp {
	
	public static void main(String[] args) {
		
		Point pA = new Point(3,4);
		
		Circle circle = new Circle(new Point(0,0), 5); 
		
		double distance = getDistance(pA, circle);
		
		System.out.println("distance: " + distance);
		
		System.out.println("\n ======================= \n");
		
		String position = getPosition(distance, circle);
	
		if(position.equals("tren duong tron")) {
			System.out.println("ve duong tron tu tam o den diem do");
		}
		
		System.out.println("\n ket thuc chuong trinh");
	
	}
	
	private static String getPosition(double distance, Circle circle) {
		int r = circle.getR();
		
		if(distance == r) {
			return "tren duong tron";
		}
		
		if (distance < r) {
			return "trong duong torn";
		}
		
		return "ngoai duong tron";
	}
	
	private static double getDistance(Point pA, Circle circle) {
		Point pO = circle.getpO();
		
		return sqrt(pow(pA.getX() - pO.getX(), 2) + pow(pA.getY() - pO.getY(), 2));
	}

}
