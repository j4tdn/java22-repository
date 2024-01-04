package view;

import bean.Car;

public class Ex01BasicCarDemo {
	
	public static void main(String[] args) {
		
		Car c1 = new Car("1", "mg5", "yellow", 800d);
		Car c2 = new Car("2", "raize", "orange", 540d);
		Car c3 = new Car("3", "vf8", "blue", 720d);
		
		c2.setSalesPrice(560d);
	     
		System.out.println("c3 model --> " + c3.getModel());
		System.out.println("c1 --> " + c1);
		System.out.println("c2 --> " + c2);
		System.out.println("c3 --> " + c3);
		
	}

}
