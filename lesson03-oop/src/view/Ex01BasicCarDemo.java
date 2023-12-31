package view;

import Bean.Car;

public class Ex01BasicCarDemo {

	public static void main (String[] args) {
		//tạo ra 3 đối tượng
		Car c1 = new Car("1","MG5", "Yellow", 800d);
		Car c2 = new Car("2","Raize", "Orange", 500d);
		Car c3 = new Car("3","VF8", "Blue", 720d);
		
		//doi thong tin SalesPrice cua c2
		c2.setSalesPrice(560d);
		
		//lay thong tin model c3
		System.out.println("c3 Model-->"+c3.getModel());
		
		System.out.println("c1-->"+c1);
		System.out.println("c2-->"+c2);
		System.out.println("c3-->"+c3);
	}
	
}
