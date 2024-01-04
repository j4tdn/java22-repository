package view;

import bean.car;

public class Ex02StaticAttributeDemo {
	
	public static void main(String[] args) {
		
	car c01 = new car("01", "Audi", "Yellow", 100d);
	car c02 = new car("02", "Audi", "Red", 200d);
	car c03 = new car("03", "Audi", "Blue", 300d);
	car c04 = new car("04", "Audi", "Green", 400d);
	car c05 = new car("05", "Audi", "White", 500d);
	car c06 = new car("06", "Audi", "Orange", 600d);
	car c07 = new car("07", "Audi", "Violet", 700d);
	
	System.out.println("C01 --> " + c01);
	System.out.println("C05 --> " + c05);
	}
}
